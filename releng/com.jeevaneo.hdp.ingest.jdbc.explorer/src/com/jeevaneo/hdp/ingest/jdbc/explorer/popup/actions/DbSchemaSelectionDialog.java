package com.jeevaneo.hdp.ingest.jdbc.explorer.popup.actions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.datatools.connectivity.IConnection;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.IManagedConnection;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.provider.SQLSchemaItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import com.jeevaneo.hdp.ingest.Database;

public class DbSchemaSelectionDialog extends TitleAreaDialog {

	private List<Schema> schemas;
	private List<Schema> selectedSchemas = new ArrayList<>();
	private TreeViewer viewer;
	private IConnectionProfile profile;

	public DbSchemaSelectionDialog(Shell parentShell, IConnectionProfile profile) throws SQLException {
		super(parentShell);
		this.profile = profile;
		this.schemas = querySchemas(profile);
	}

	private List<Schema> querySchemas(IConnectionProfile profile) throws SQLException {

		org.eclipse.datatools.modelbase.sql.schema.Database db = getDatabaseModel(profile);

		List<Schema> schemaNames = new ArrayList<>(db.getSchemas());

		return schemaNames;
	}

	@Override
	public void create() {
		super.create();
		setTitle("Veuillez sélectionner les schémas à importer...");
		setMessage("Import de données JDBC", IMessageProvider.INFORMATION);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	public org.eclipse.datatools.modelbase.sql.schema.Database getDatabaseModel(IConnectionProfile profile) {
		IManagedConnection managedConnection = profile.getManagedConnection("org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo");
		if (managedConnection != null) {
			try {
				if (!managedConnection.isConnected()) {
					IStatus status = profile.connect();
					System.out.println(status.isOK());
				}
				IConnection connection = managedConnection.getConnection();
				ConnectionInfo connectionInfo = (ConnectionInfo) connection.getRawConnection();
				if (connectionInfo != null) {
					org.eclipse.datatools.modelbase.sql.schema.Database database = connectionInfo.getSharedDatabase();
					return database;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private org.eclipse.datatools.modelbase.sql.schema.Database test(Database db) {
		IConnectionProfile[] profiles = ProfileManager.getInstance().getProfiles();
		for (IConnectionProfile profile : profiles) {
			if (db.getLabel().equals(profile.getName())) {
				return getDatabaseModel(profile);
			}
		}
		return null;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		// area.setLayout(new FillLayout());
		viewer = new TreeViewer(area);

		// CheckboxTableViewer.newCheckList(area, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		// viewer.setContentProvider(new ArrayContentProvider());

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new SQLSchemaItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		viewer.setInput(schemas);
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		return area;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		saveSelection();
		super.buttonPressed(buttonId);
	}

	private void saveSelection() {
		selectedSchemas.clear();
		Object[] checkedElements = viewer.getStructuredSelection().toArray();
		for (Object checked : checkedElements) {
			selectedSchemas.add((Schema) checked);
		}
	}

	// public static void main(String[] args) throws SQLException {
	// Display display = new Display();
	// Shell shell = new Shell(display);
	// shell.open();
	//
	// ConnectionProfile db = SQLSchemaFactory.eINSTANCE.createDatabase();
	// db.setJdbcUrl("jdbc:oracle:thin:@saapp151a:1521:K2GENR");
	// db.setJdbcUser("RTG");
	// db.setJdbcPassword("RTG");
	//
	// DbSchemaSelectionDialog dialog = new DbSchemaSelectionDialog(shell, db);
	// if (dialog.open() == Window.OK) {
	// System.out.println(dialog.getSelectedSchemas());
	// }
	//
	// while (!shell.isDisposed()) {
	// if (!display.readAndDispatch())
	// display.sleep();
	// }
	// display.dispose();
	// }

	public List<Schema> getSelectedSchemas() {
		return selectedSchemas;
	}

}
