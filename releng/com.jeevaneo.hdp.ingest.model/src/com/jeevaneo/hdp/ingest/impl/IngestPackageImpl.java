/**
 */
package com.jeevaneo.hdp.ingest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.jeevaneo.hdp.ingest.Database;
import com.jeevaneo.hdp.ingest.DbColumn;
import com.jeevaneo.hdp.ingest.DbSchema;
import com.jeevaneo.hdp.ingest.DbTable;
import com.jeevaneo.hdp.ingest.IngestFactory;
import com.jeevaneo.hdp.ingest.IngestPackage;
import com.jeevaneo.hdp.ingest.SqoopHiveImport;
import com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport;
import com.jeevaneo.hdp.ingest.SqoopImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IngestPackageImpl extends EPackageImpl implements IngestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqoopImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqoopHiveImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqoopHiveIncrementalImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbColumnEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IngestPackageImpl() {
		super(eNS_URI, IngestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IngestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IngestPackage init() {
		if (isInited) return (IngestPackage)EPackage.Registry.INSTANCE.getEPackage(IngestPackage.eNS_URI);

		// Obtain or create and register package
		IngestPackageImpl theIngestPackage = (IngestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IngestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IngestPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIngestPackage.createPackageContents();

		// Initialize created meta-data
		theIngestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIngestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IngestPackage.eNS_URI, theIngestPackage);
		return theIngestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Label() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_JdbcUrl() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_JdbcUser() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_JdbcPassword() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Schemas() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_JdbcDriver() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDbTable() {
		return dbTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbTable_Name() {
		return (EAttribute)dbTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDbTable_Columns() {
		return (EReference)dbTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDbSchema() {
		return dbSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbSchema_Name() {
		return (EAttribute)dbSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDbSchema_Tables() {
		return (EReference)dbSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqoopImport() {
		return sqoopImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqoopImport_DbTable() {
		return (EReference)sqoopImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqoopHiveImport() {
		return sqoopHiveImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqoopHiveImport_TargetHiveDatabase() {
		return (EAttribute)sqoopHiveImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqoopHiveImport_TargetHiveTable() {
		return (EAttribute)sqoopHiveImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqoopHiveIncrementalImport() {
		return sqoopHiveIncrementalImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqoopHiveIncrementalImport_CheckColumn() {
		return (EReference)sqoopHiveIncrementalImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDbColumn() {
		return dbColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbColumn_Name() {
		return (EAttribute)dbColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbColumn_JdbcType() {
		return (EAttribute)dbColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbColumn_JdbcScale() {
		return (EAttribute)dbColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDbColumn_JdbcPrecision() {
		return (EAttribute)dbColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngestFactory getIngestFactory() {
		return (IngestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__LABEL);
		createEAttribute(databaseEClass, DATABASE__JDBC_URL);
		createEAttribute(databaseEClass, DATABASE__JDBC_USER);
		createEAttribute(databaseEClass, DATABASE__JDBC_PASSWORD);
		createEReference(databaseEClass, DATABASE__SCHEMAS);
		createEAttribute(databaseEClass, DATABASE__JDBC_DRIVER);

		dbTableEClass = createEClass(DB_TABLE);
		createEAttribute(dbTableEClass, DB_TABLE__NAME);
		createEReference(dbTableEClass, DB_TABLE__COLUMNS);

		dbSchemaEClass = createEClass(DB_SCHEMA);
		createEAttribute(dbSchemaEClass, DB_SCHEMA__NAME);
		createEReference(dbSchemaEClass, DB_SCHEMA__TABLES);

		sqoopImportEClass = createEClass(SQOOP_IMPORT);
		createEReference(sqoopImportEClass, SQOOP_IMPORT__DB_TABLE);

		sqoopHiveImportEClass = createEClass(SQOOP_HIVE_IMPORT);
		createEAttribute(sqoopHiveImportEClass, SQOOP_HIVE_IMPORT__TARGET_HIVE_DATABASE);
		createEAttribute(sqoopHiveImportEClass, SQOOP_HIVE_IMPORT__TARGET_HIVE_TABLE);

		sqoopHiveIncrementalImportEClass = createEClass(SQOOP_HIVE_INCREMENTAL_IMPORT);
		createEReference(sqoopHiveIncrementalImportEClass, SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN);

		dbColumnEClass = createEClass(DB_COLUMN);
		createEAttribute(dbColumnEClass, DB_COLUMN__NAME);
		createEAttribute(dbColumnEClass, DB_COLUMN__JDBC_TYPE);
		createEAttribute(dbColumnEClass, DB_COLUMN__JDBC_SCALE);
		createEAttribute(dbColumnEClass, DB_COLUMN__JDBC_PRECISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqoopHiveImportEClass.getESuperTypes().add(this.getSqoopImport());
		sqoopHiveIncrementalImportEClass.getESuperTypes().add(this.getSqoopHiveImport());

		// Initialize classes, features, and operations; add parameters
		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Label(), ecorePackage.getEString(), "label", null, 1, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_JdbcUrl(), ecorePackage.getEString(), "jdbcUrl", null, 1, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_JdbcUser(), ecorePackage.getEString(), "jdbcUser", null, 1, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_JdbcPassword(), ecorePackage.getEString(), "jdbcPassword", null, 1, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Schemas(), this.getDbSchema(), null, "schemas", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_JdbcDriver(), ecorePackage.getEString(), "jdbcDriver", "oracle.jdbc.driver.OracleDriver", 1, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbTableEClass, DbTable.class, "DbTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDbTable_Name(), ecorePackage.getEString(), "name", null, 1, 1, DbTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDbTable_Columns(), this.getDbColumn(), null, "columns", null, 0, -1, DbTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbSchemaEClass, DbSchema.class, "DbSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDbSchema_Name(), ecorePackage.getEString(), "name", null, 1, 1, DbSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDbSchema_Tables(), this.getDbTable(), null, "tables", null, 0, -1, DbSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqoopImportEClass, SqoopImport.class, "SqoopImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqoopImport_DbTable(), this.getDbTable(), null, "dbTable", null, 1, 1, SqoopImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqoopHiveImportEClass, SqoopHiveImport.class, "SqoopHiveImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqoopHiveImport_TargetHiveDatabase(), ecorePackage.getEString(), "targetHiveDatabase", null, 1, 1, SqoopHiveImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqoopHiveImport_TargetHiveTable(), ecorePackage.getEString(), "targetHiveTable", null, 1, 1, SqoopHiveImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqoopHiveIncrementalImportEClass, SqoopHiveIncrementalImport.class, "SqoopHiveIncrementalImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqoopHiveIncrementalImport_CheckColumn(), this.getDbColumn(), null, "checkColumn", null, 1, 1, SqoopHiveIncrementalImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbColumnEClass, DbColumn.class, "DbColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDbColumn_Name(), ecorePackage.getEString(), "name", null, 1, 1, DbColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbColumn_JdbcType(), ecorePackage.getEInt(), "jdbcType", null, 1, 1, DbColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbColumn_JdbcScale(), ecorePackage.getEInt(), "jdbcScale", null, 1, 1, DbColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDbColumn_JdbcPrecision(), ecorePackage.getEInt(), "jdbcPrecision", null, 1, 1, DbColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IngestPackageImpl
