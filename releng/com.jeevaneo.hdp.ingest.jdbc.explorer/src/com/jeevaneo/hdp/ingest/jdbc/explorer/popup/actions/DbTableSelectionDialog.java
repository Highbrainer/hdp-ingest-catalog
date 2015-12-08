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
import com.jeevaneo.hdp.ingest.DbSchema;
import com.jeevaneo.hdp.ingest.IngestFactory;

public class DbTableSelectionDialog extends TitleAreaDialog {

	private List<String> tables;
	private List<String> selectedTables = new ArrayList<>();
	private CheckboxTableViewer viewer;

	public DbTableSelectionDialog(Shell parent, DbSchema schema) throws SQLException {
		super(parent);
		this.tables = queryTables(schema);
	}

	private List<String> queryTables(DbSchema schema) throws SQLException {
		Database db = (Database) schema.eContainer();
		try {
			Class.forName(db.getJdbcDriver());
		} catch (ClassNotFoundException e) {
			// MessageDialog.openError(shell, "Driver JDBC introuvable",
			// );
			throw new RuntimeException(String.format("Driver JDBC introuvable : %s\nManque-t-il le jar dans le classpath?", db.getJdbcDriver()), e);
		}

		List<String> tableNames = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(db.getJdbcUrl(), db.getJdbcUser(), db.getJdbcUser());) {
			DatabaseMetaData metadata = con.getMetaData();
			try (ResultSet schemas = metadata.getTables(null, schema.getName(), "%", null);) {
				while (schemas.next()) {
					tableNames.add(schemas.getString(3));
				}
			}
		}
		return tableNames;
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
		viewer.setInput(tables);
		viewer.setAllChecked(true);
		viewer.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		return area;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		saveSelection();
		super.buttonPressed(buttonId);
	}

	private void saveSelection() {
		selectedTables.clear();
		Object[] checkedElements = viewer.getCheckedElements();
		for (Object checked : checkedElements) {
			selectedTables.add(checked.toString());
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

		DbSchema schema = IngestFactory.eINSTANCE.createDbSchema();
		schema.setName("RTG");
		db.getSchemas().add(schema);

		DbTableSelectionDialog dialog = new DbTableSelectionDialog(shell, schema);
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
		return selectedTables;
	}

}
