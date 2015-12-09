package com.jeevaneo.hdp.ingest.jdbc.explorer.popup.actions;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.IManagedConnection;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogObject;
import org.eclipse.datatools.modelbase.sql.datatypes.BooleanDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.CharacterStringDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.DateDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.FixedPrecisionDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.NumberDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.NumericalDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.PredefinedDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataType;
import org.eclipse.datatools.modelbase.sql.datatypes.TimeDataType;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.jeevaneo.hdp.ingest.Catalogue;
import com.jeevaneo.hdp.ingest.Database;
import com.jeevaneo.hdp.ingest.DbColumn;
import com.jeevaneo.hdp.ingest.DbSchema;
import com.jeevaneo.hdp.ingest.DbTable;
import com.jeevaneo.hdp.ingest.IngestFactory;
import com.jeevaneo.hdp.ingest.IngestPackage;
import com.jeevaneo.hdp.ingest.impl.IngestPackageImpl;
import com.jeevaneo.hdp.ingest.presentation.IngestEditor;

public class JdbcLoadSchemas implements IObjectActionDelegate {

	private Shell shell;

	private final List<ICatalogObject> objects = new ArrayList<>();

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

		IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		System.out.println(activeEditor.getEditorSite().getId());
		if (activeEditor instanceof IngestEditor) {
			IngestEditor editor = (IngestEditor) activeEditor;
			EList<Resource> resources = editor.getEditingDomain().getResourceSet().getResources();
			for (Resource res : resources) {
				EList<EObject> contents = res.getContents();
				for (EObject root : contents) {
					if (root instanceof Catalogue) {
						final Catalogue catalog = (Catalogue) root;

						editor.getEditingDomain().getCommandStack().execute(new ChangeCommand(catalog) {

							@Override
							protected void doExecute() {
								integrate(catalog, objects);
							}
						});

						break;
					}
				}
			}

		}

		MessageDialog.openInformation(shell, "Explorer", "Charger les schémas was executed.");
	}

	private void integrate(Catalogue catalog, List<ICatalogObject> os) {
		for (ICatalogObject iCatalogObject : os) {
			if (iCatalogObject instanceof org.eclipse.datatools.modelbase.sql.schema.Database) {
				org.eclipse.datatools.modelbase.sql.schema.Database db = (org.eclipse.datatools.modelbase.sql.schema.Database) iCatalogObject;
				Database database = updateOrCreateDatabase(catalog, db);
				List<Schema> schemas = db.getSchemas();
				for (Schema schema : schemas) {
					DbSchema dbSchema = updateOrCreateSchema(database, schema);
				}
			}
			if (iCatalogObject instanceof Schema) {
				Schema schema = (Schema) iCatalogObject;
				org.eclipse.datatools.modelbase.sql.schema.Database db = findDatabase(schema);
				Database database = updateOrCreateDatabase(catalog, db);
				DbSchema schem = updateOrCreateSchema(database, schema);
				List<Table> tables = schema.getTables();
				for (Table table : tables) {
					DbTable dbTable = updateOrCreateTable(schem, table);
				}
			} else if (iCatalogObject instanceof Table) {
				Table table = (Table) iCatalogObject;
				Schema schema = table.getSchema();
				org.eclipse.datatools.modelbase.sql.schema.Database db = findDatabase(schema);
				Database database = updateOrCreateDatabase(catalog, db);
				DbSchema schem = updateOrCreateSchema(database, schema);
				updateOrCreateTable(schem, table);
			}
		}
	}

	private org.eclipse.datatools.modelbase.sql.schema.Database findDatabase(Schema schema) {
		org.eclipse.datatools.modelbase.sql.schema.Database db = schema.getDatabase();
		if (null == db) {
			db = schema.getCatalog().getDatabase();
		}
		return db;
	}

	private DbTable updateOrCreateTable(DbSchema schem, Table table) {
		EList<DbTable> tables = schem.getTables();
		for (DbTable dbTable : tables) {
			if (dbTable.getName().equalsIgnoreCase(table.getName())) {
				return dbTable;
			}
		}
		// not found, create it!
		DbTable ret = makeDbTable(table);
		schem.getTables().add(ret);
		return ret;
	}

	private int jdbcType(SQLDataType type) {

		if (type instanceof PredefinedDataType) {
			PredefinedDataType fixed = (PredefinedDataType) type;
			return fixed.getPrimitiveType().getValue();
		} else if (type instanceof BooleanDataType) {
			BooleanDataType bool = (BooleanDataType) type;
			return Types.BOOLEAN;
		} else if (type instanceof CharacterStringDataType) {
			CharacterStringDataType string = (CharacterStringDataType) type;
			return Types.VARCHAR;
		} else if (type instanceof DateDataType) {
			DateDataType date = (DateDataType) type;
			return Types.DATE;
		} else if (type instanceof NumberDataType) {
			NumberDataType number = (NumberDataType) type;
			return Types.INTEGER;
		} else if (type instanceof NumericalDataType) {
			NumericalDataType number = (NumericalDataType) type;
			return Types.NUMERIC;
		} else if (type instanceof TimeDataType) {
			TimeDataType number = (TimeDataType) type;
			return Types.TIME;
		}
		throw new UnsupportedOperationException("Non supported : " + type);
	}

	private DbTable makeDbTable(Table table) {
		DbTable ret = IngestFactory.eINSTANCE.createDbTable();
		ret.setName(table.getName());
		EList<Column> columns = table.getColumns();
		for (Column column : columns) {
			DbColumn col = IngestFactory.eINSTANCE.createDbColumn();
			ret.getColumns().add(col);
			col.setName(column.getName());
			SQLDataType type = column.getContainedType();

			if (null == type) {
				System.err.println("Column ignored because it has no type! " + table.getName() + "." + column.getName());
				continue;
			}
			// System.out.println(type.getName());
			if (type instanceof FixedPrecisionDataType) {
				FixedPrecisionDataType fixed = (FixedPrecisionDataType) type;
				col.setJdbcPrecision(fixed.getPrecision());
				col.setJdbcScale(fixed.getScale());
			} else if (type instanceof CharacterStringDataType) {
				CharacterStringDataType string = (CharacterStringDataType) type;
				col.setJdbcScale(string.getLength());
			}
			col.setJdbcType(jdbcType(type));
		}
		return ret;
	}

	/**
	 * REnvoie celui qui est trouvé. Si pas trouvé, en crée un et le rattache à la db.
	 * 
	 * @param database
	 * @param schema
	 * @return
	 */
	private DbSchema updateOrCreateSchema(Database database, Schema schema) {
		EList<DbSchema> schemas = database.getSchemas();
		for (DbSchema dbSchema : schemas) {
			if (dbSchema.getName().equalsIgnoreCase(schema.getName())) {
				return dbSchema;
			}
		}
		// Not found!
		DbSchema ret = makeDbSchema(schema);
		database.getSchemas().add(ret);
		return ret;
	}

	private DbSchema makeDbSchema(Schema schema) {
		DbSchema ret = IngestFactory.eINSTANCE.createDbSchema();
		ret.setName(schema.getName());
		return ret;
	}

	private Database updateOrCreateDatabase(Catalogue catalog, org.eclipse.datatools.modelbase.sql.schema.Database db) {
		EList<Database> databases = catalog.getDatabases();
		for (Database database : databases) {
			String label = database.getLabel();
			if (null != label && label.equalsIgnoreCase(db.getName())) {
				return database;
			}
		}
		// Not found
		Database ret = makeDatabase(db);
		catalog.getDatabases().add(ret);
		return ret;
	}

	private Database makeDatabase(org.eclipse.datatools.modelbase.sql.schema.Database db) {
		Database ret = IngestFactory.eINSTANCE.createDatabase();
		ret.setLabel(db.getName());
		return ret;
	}

	public org.eclipse.datatools.modelbase.sql.schema.Database getDatabaseModel(IConnectionProfile profile) {
		IManagedConnection managedConnection = profile.getManagedConnection("org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo");
		if (managedConnection != null) {
			try {
				ConnectionInfo connectionInfo = (ConnectionInfo) managedConnection.getConnection().getRawConnection();
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

	private void test() {

		// And then once you have your IConnectionProfile reference, you can get
		// the JDBC connection this way:
		//
		// public java.sql.Connection getJavaConnectionForProfile
		// (IConnectionProfile profile) {
		// IConnection connection =
		// ProfileConnectionManager.
		// getProfileConnectionManagerInstance().getConnection(profile,
		// "java.sql.Connection");
		// if (connection != null) {
		// return (java.sql.Connection) connection.getRawConnection();
		// }
		// return null;
		// }
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
			objects.clear();
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Iterator<?> iterator = ssel.iterator();
			while (iterator.hasNext()) {
				Object object = iterator.next();
				if (object instanceof ICatalogObject) {
					objects.add((ICatalogObject) object);
				}
			}

		}

		for (ICatalogObject o : objects) {
			System.out.println("Object " + o);
		}

	}

	private Collection<? extends Table> findTables(IConnectionProfile object) {
		return new ArrayList<>(getDatabaseModel(object).getSchemas());
	}

	private Collection<? extends Table> findTables(Schema schema) {
		return new ArrayList<>(schema.getTables());
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
