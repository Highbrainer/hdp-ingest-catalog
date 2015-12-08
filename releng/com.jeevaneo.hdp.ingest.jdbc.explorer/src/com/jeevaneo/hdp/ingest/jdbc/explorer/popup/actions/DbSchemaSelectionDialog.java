package com.jeevaneo.hdp.ingest.jdbc.explorer.popup.actions;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.jeevaneo.hdp.ingest.Database;
import com.jeevaneo.hdp.ingest.IngestFactory;

public class DbSchemaSelectionDialog extends TitleAreaDialog {

	private List<String> schemas;
	private List<String> selectedSchemas = new ArrayList<>();
	private CheckboxTableViewer viewer;

	public DbSchemaSelectionDialog(Shell parentShell, Database db) throws SQLException {
		super(parentShell);
		this.schemas = querySchemas(db);
	}

	private List<String> querySchemas(Database db) throws SQLException {
		try {
			Class.forName(db.getJdbcDriver());
		} catch (ClassNotFoundException e) {
			// MessageDialog.openError(shell, "Driver JDBC introuvable",
			// );
			throw new RuntimeException(String.format("Driver JDBC introuvable : %s\nManque-t-il le jar dans le classpath?", db.getJdbcDriver()), e);
		}

		List<String> schemaNames = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(db.getJdbcUrl(), db.getJdbcUser(), db.getJdbcUser());) {
			DatabaseMetaData metadata = con.getMetaData();
			try (ResultSet schemas = metadata.getSchemas();) {
				while (schemas.next()) {
					schemaNames.add(schemas.getString(1));
				}
			}
		}
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

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		// area.setLayout(new FillLayout());
		viewer = CheckboxTableViewer.newCheckList(area, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setInput(schemas);
		viewer.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		return area;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		saveSelection();
		super.buttonPressed(buttonId);
	}

	private void saveSelection() {
		selectedSchemas.clear();
		Object[] checkedElements = viewer.getCheckedElements();
		for (Object checked : checkedElements) {
			selectedSchemas.add(checked.toString());
		}
	}

	public static void main(String[] args) throws SQLException {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.open();

		Database db = IngestFactory.eINSTANCE.createDatabase();
		db.setJdbcUrl("jdbc:oracle:thin:@saapp151a:1521:K2GENR");
		db.setJdbcUser("RTG");
		db.setJdbcPassword("RTG");

		DbSchemaSelectionDialog dialog = new DbSchemaSelectionDialog(shell, db);
		if (dialog.open() == Window.OK) {
			System.out.println(dialog.getSelectedSchemas());
		}

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public List<String> getSelectedSchemas() {
		return selectedSchemas;
	}

}
