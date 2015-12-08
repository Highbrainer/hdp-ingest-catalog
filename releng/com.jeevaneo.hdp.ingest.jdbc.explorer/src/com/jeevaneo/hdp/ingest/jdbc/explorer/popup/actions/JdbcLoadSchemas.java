package com.jeevaneo.hdp.ingest.jdbc.explorer.popup.actions;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.jeevaneo.hdp.ingest.Database;
import com.jeevaneo.hdp.ingest.DbColumn;
import com.jeevaneo.hdp.ingest.DbSchema;
import com.jeevaneo.hdp.ingest.DbTable;
import com.jeevaneo.hdp.ingest.IngestFactory;
import com.jeevaneo.hdp.ingest.IngestPackage;
import com.jeevaneo.hdp.ingest.impl.IngestPackageImpl;

public class JdbcLoadSchemas implements IObjectActionDelegate {

	private Shell shell;

	private Database db = null;

	/**
	 * Constructor for Action1.
	 */
	public JdbcLoadSchemas() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		if (null == db) {
			return;
		}

		try {
			DbSchemaSelectionDialog dialog;
			dialog = new DbSchemaSelectionDialog(shell, db);
			if (dialog.open() != Window.OK) {
				return;
			}
			List<String> schemaNames = dialog.getSelectedSchemas();
			for (String schemaName : schemaNames) {
				// déjà là?
				boolean alreadyThere = false;
				EList<DbSchema> existingSchemas = db.getSchemas();
				for (DbSchema dbSchema : existingSchemas) {
					if (dbSchema.getName().equals(schemaName)) {
						alreadyThere = true;
						break;
					}
				}
				if (alreadyThere) {
					continue;
				}

				DbSchema schema = IngestFactory.eINSTANCE.createDbSchema();
				schema.setName(schemaName);
				db.getSchemas().add(schema);

				// Les tables de chaque schema
				populateTables(schema);
			}
		} catch (SQLException e) {
			MessageDialog.openError(shell, "Erreur Base de Données", "" + e.getMessage());
			return;
		}

		MessageDialog.openInformation(shell, "Explorer", "Charger les schémas was executed.");
	}

	private void populateTables(DbSchema schema) throws SQLException {
		DbTableSelectionDialog dialog = new DbTableSelectionDialog(shell, schema);
		if (dialog.open() != Window.OK) {
			throw new RuntimeException("Annulé");
		}
		List<String> tablesNames = dialog.getSelectedSchemas();

		for (String tableName : tablesNames) {
			boolean alreadyExisting = false;
			EList<DbTable> existingTables = schema.getTables();
			for (DbTable dbTable : existingTables) {
				if (dbTable.getName().equals(tableName)) {
					alreadyExisting = true;
					break;
				}
			}
			if (alreadyExisting) {
				continue;
			}

			DbTable table = IngestFactory.eINSTANCE.createDbTable();
			table.setName(tableName);
			schema.getTables().add(table);
			populateColumns(table);

		}

	}

	private void populateColumns(DbTable table) throws SQLException {
		final DbSchema schema = (DbSchema) table.eContainer();
		Database db = (Database) schema.eContainer();
		try {
			Class.forName(db.getJdbcDriver());
		} catch (ClassNotFoundException e) {
			// MessageDialog.openError(shell, "Driver JDBC introuvable",
			// );
			throw new RuntimeException(String.format("Driver JDBC introuvable : %s\nManque-t-il le jar dans le classpath?", db.getJdbcDriver()), e);
		}

		try (Connection con = DriverManager.getConnection(db.getJdbcUrl(), db.getJdbcUser(), db.getJdbcUser());) {
			DatabaseMetaData metadata = con.getMetaData();
			try (ResultSet cols = metadata.getColumns(null, schema.getName(), table.getName(), "%");) {
				while (cols.next()) {
					String name = cols.getString("COLUMN_NAME");
					int precision = cols.getInt("DECIMAL_DIGITS");
					int type = cols.getInt("DATA_TYPE");
					int scale = cols.getInt("COLUMN_SIZE");
					// String typeName = cols.getString("TYPE_NAME");
					DbColumn col = IngestFactory.eINSTANCE.createDbColumn();
					col.setJdbcPrecision(precision);
					col.setJdbcScale(scale);
					col.setJdbcType(type);
					col.setName(name);
					table.getColumns().add(col);
				}
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object object = ssel.getFirstElement();
			if (object instanceof Database) {
				this.db = (Database) object;
			} else {
				this.db = null;
			}

		}
	}

	public static void main(String[] args) throws SQLException, IOException {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.open();

		final Database db = IngestFactory.eINSTANCE.createDatabase();
		db.setJdbcUrl("jdbc:oracle:thin:@saapp151a:1521:K2GENR");
		db.setJdbcUser("RTG");
		db.setJdbcPassword("RTG");

		JdbcLoadSchemas moi = new JdbcLoadSchemas();
		moi.shell = shell;
		moi.selectionChanged(null, new IStructuredSelection() {

			@Override
			public boolean isEmpty() {
				return false;
			}

			@Override
			public List<?> toList() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Iterator<?> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object getFirstElement() {
				return db;
			}
		});
		moi.run(null);

		IngestPackageImpl.init();
		IngestPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .website extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("test", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource res = resSet.createResource(URI.createURI("My.test"));

		res.getContents().add(db);
		res.save(System.out, Collections.EMPTY_MAP);

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}
