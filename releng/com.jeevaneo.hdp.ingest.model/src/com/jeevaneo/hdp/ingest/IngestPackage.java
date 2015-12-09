/**
 */
package com.jeevaneo.hdp.ingest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.jeevaneo.hdp.ingest.IngestFactory
 * @model kind="package"
 * @generated
 */
public interface IngestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ingest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://emf.jeevaneo.com/hdp/ingest/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ingest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IngestPackage eINSTANCE = com.jeevaneo.hdp.ingest.impl.IngestPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.jeevaneo.hdp.ingest.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.hdp.ingest.impl.DatabaseImpl
	 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Jdbc Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__JDBC_URL = 1;

	/**
	 * The feature id for the '<em><b>Jdbc User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__JDBC_USER = 2;

	/**
	 * The feature id for the '<em><b>Jdbc Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__JDBC_PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__SCHEMAS = 4;

	/**
	 * The feature id for the '<em><b>Jdbc Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__JDBC_DRIVER = 5;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.jeevaneo.hdp.ingest.impl.DbTableImpl <em>Db Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.hdp.ingest.impl.DbTableImpl
	 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getDbTable()
	 * @generated
	 */
	int DB_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TABLE__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Sqoop Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TABLE__SQOOP_IMPORTS = 2;

	/**
	 * The number of structural features of the '<em>Db Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Db Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.jeevaneo.hdp.ingest.impl.DbSchemaImpl <em>Db Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.hdp.ingest.impl.DbSchemaImpl
	 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getDbSchema()
	 * @generated
	 */
	int DB_SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SCHEMA__TABLES = 1;

	/**
	 * The number of structural features of the '<em>Db Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Db Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.jeevaneo.hdp.ingest.impl.SqoopImportImpl <em>Sqoop Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.hdp.ingest.impl.SqoopImportImpl
	 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getSqoopImport()
	 * @generated
	 */
	int SQOOP_IMPORT = 3;

	/**
	 * The number of structural features of the '<em>Sqoop Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_IMPORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sqoop Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.jeevaneo.hdp.ingest.impl.SqoopHiveImportImpl <em>Sqoop Hive Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.hdp.ingest.impl.SqoopHiveImportImpl
	 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getSqoopHiveImport()
	 * @generated
	 */
	int SQOOP_HIVE_IMPORT = 4;

	/**
	 * The feature id for the '<em><b>Target Hive Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_HIVE_IMPORT__TARGET_HIVE_DATABASE = SQOOP_IMPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Hive Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_HIVE_IMPORT__TARGET_HIVE_TABLE = SQOOP_IMPORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqoop Hive Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_HIVE_IMPORT_FEATURE_COUNT = SQOOP_IMPORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqoop Hive Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_HIVE_IMPORT_OPERATION_COUNT = SQOOP_IMPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.jeevaneo.hdp.ingest.impl.SqoopHiveIncrementalImportImpl <em>Sqoop Hive Incremental Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.hdp.ingest.impl.SqoopHiveIncrementalImportImpl
	 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getSqoopHiveIncrementalImport()
	 * @generated
	 */
	int SQOOP_HIVE_INCREMENTAL_IMPORT = 5;

	/**
	 * The feature id for the '<em><b>Target Hive Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_HIVE_INCREMENTAL_IMPORT__TARGET_HIVE_DATABASE = SQOOP_HIVE_IMPORT__TARGET_HIVE_DATABASE;

	/**
	 * The feature id for the '<em><b>Target Hive Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_HIVE_INCREMENTAL_IMPORT__TARGET_HIVE_TABLE = SQOOP_HIVE_IMPORT__TARGET_HIVE_TABLE;

	/**
	 * The feature id for the '<em><b>Check Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN = SQOOP_HIVE_IMPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqoop Hive Incremental Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_HIVE_INCREMENTAL_IMPORT_FEATURE_COUNT = SQOOP_HIVE_IMPORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqoop Hive Incremental Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQOOP_HIVE_INCREMENTAL_IMPORT_OPERATION_COUNT = SQOOP_HIVE_IMPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.jeevaneo.hdp.ingest.impl.DbColumnImpl <em>Db Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.hdp.ingest.impl.DbColumnImpl
	 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getDbColumn()
	 * @generated
	 */
	int DB_COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Jdbc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN__JDBC_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Jdbc Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN__JDBC_SCALE = 2;

	/**
	 * The feature id for the '<em><b>Jdbc Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN__JDBC_PRECISION = 3;

	/**
	 * The number of structural features of the '<em>Db Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Db Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COLUMN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.jeevaneo.hdp.ingest.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jeevaneo.hdp.ingest.impl.CatalogueImpl
	 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 7;

	/**
	 * The feature id for the '<em><b>Databases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__DATABASES = 0;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.jeevaneo.hdp.ingest.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see com.jeevaneo.hdp.ingest.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.Database#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.jeevaneo.hdp.ingest.Database#getLabel()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Label();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.Database#getJdbcUrl <em>Jdbc Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Url</em>'.
	 * @see com.jeevaneo.hdp.ingest.Database#getJdbcUrl()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_JdbcUrl();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.Database#getJdbcUser <em>Jdbc User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc User</em>'.
	 * @see com.jeevaneo.hdp.ingest.Database#getJdbcUser()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_JdbcUser();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.Database#getJdbcPassword <em>Jdbc Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Password</em>'.
	 * @see com.jeevaneo.hdp.ingest.Database#getJdbcPassword()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_JdbcPassword();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.hdp.ingest.Database#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see com.jeevaneo.hdp.ingest.Database#getSchemas()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Schemas();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.Database#getJdbcDriver <em>Jdbc Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Driver</em>'.
	 * @see com.jeevaneo.hdp.ingest.Database#getJdbcDriver()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_JdbcDriver();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.hdp.ingest.DbTable <em>Db Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Db Table</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbTable
	 * @generated
	 */
	EClass getDbTable();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.DbTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbTable#getName()
	 * @see #getDbTable()
	 * @generated
	 */
	EAttribute getDbTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.hdp.ingest.DbTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbTable#getColumns()
	 * @see #getDbTable()
	 * @generated
	 */
	EReference getDbTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.hdp.ingest.DbTable#getSqoopImports <em>Sqoop Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sqoop Imports</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbTable#getSqoopImports()
	 * @see #getDbTable()
	 * @generated
	 */
	EReference getDbTable_SqoopImports();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.hdp.ingest.DbSchema <em>Db Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Db Schema</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbSchema
	 * @generated
	 */
	EClass getDbSchema();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.DbSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbSchema#getName()
	 * @see #getDbSchema()
	 * @generated
	 */
	EAttribute getDbSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.hdp.ingest.DbSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbSchema#getTables()
	 * @see #getDbSchema()
	 * @generated
	 */
	EReference getDbSchema_Tables();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.hdp.ingest.SqoopImport <em>Sqoop Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqoop Import</em>'.
	 * @see com.jeevaneo.hdp.ingest.SqoopImport
	 * @generated
	 */
	EClass getSqoopImport();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.hdp.ingest.SqoopHiveImport <em>Sqoop Hive Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqoop Hive Import</em>'.
	 * @see com.jeevaneo.hdp.ingest.SqoopHiveImport
	 * @generated
	 */
	EClass getSqoopHiveImport();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.SqoopHiveImport#getTargetHiveDatabase <em>Target Hive Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Hive Database</em>'.
	 * @see com.jeevaneo.hdp.ingest.SqoopHiveImport#getTargetHiveDatabase()
	 * @see #getSqoopHiveImport()
	 * @generated
	 */
	EAttribute getSqoopHiveImport_TargetHiveDatabase();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.SqoopHiveImport#getTargetHiveTable <em>Target Hive Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Hive Table</em>'.
	 * @see com.jeevaneo.hdp.ingest.SqoopHiveImport#getTargetHiveTable()
	 * @see #getSqoopHiveImport()
	 * @generated
	 */
	EAttribute getSqoopHiveImport_TargetHiveTable();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport <em>Sqoop Hive Incremental Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqoop Hive Incremental Import</em>'.
	 * @see com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport
	 * @generated
	 */
	EClass getSqoopHiveIncrementalImport();

	/**
	 * Returns the meta object for the reference '{@link com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport#getCheckColumn <em>Check Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Check Column</em>'.
	 * @see com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport#getCheckColumn()
	 * @see #getSqoopHiveIncrementalImport()
	 * @generated
	 */
	EReference getSqoopHiveIncrementalImport_CheckColumn();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.hdp.ingest.DbColumn <em>Db Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Db Column</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbColumn
	 * @generated
	 */
	EClass getDbColumn();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.DbColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbColumn#getName()
	 * @see #getDbColumn()
	 * @generated
	 */
	EAttribute getDbColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.DbColumn#getJdbcType <em>Jdbc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Type</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbColumn#getJdbcType()
	 * @see #getDbColumn()
	 * @generated
	 */
	EAttribute getDbColumn_JdbcType();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.DbColumn#getJdbcScale <em>Jdbc Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Scale</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbColumn#getJdbcScale()
	 * @see #getDbColumn()
	 * @generated
	 */
	EAttribute getDbColumn_JdbcScale();

	/**
	 * Returns the meta object for the attribute '{@link com.jeevaneo.hdp.ingest.DbColumn#getJdbcPrecision <em>Jdbc Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Precision</em>'.
	 * @see com.jeevaneo.hdp.ingest.DbColumn#getJdbcPrecision()
	 * @see #getDbColumn()
	 * @generated
	 */
	EAttribute getDbColumn_JdbcPrecision();

	/**
	 * Returns the meta object for class '{@link com.jeevaneo.hdp.ingest.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see com.jeevaneo.hdp.ingest.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.jeevaneo.hdp.ingest.Catalogue#getDatabases <em>Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Databases</em>'.
	 * @see com.jeevaneo.hdp.ingest.Catalogue#getDatabases()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Databases();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IngestFactory getIngestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.jeevaneo.hdp.ingest.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.hdp.ingest.impl.DatabaseImpl
		 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__LABEL = eINSTANCE.getDatabase_Label();

		/**
		 * The meta object literal for the '<em><b>Jdbc Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__JDBC_URL = eINSTANCE.getDatabase_JdbcUrl();

		/**
		 * The meta object literal for the '<em><b>Jdbc User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__JDBC_USER = eINSTANCE.getDatabase_JdbcUser();

		/**
		 * The meta object literal for the '<em><b>Jdbc Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__JDBC_PASSWORD = eINSTANCE.getDatabase_JdbcPassword();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__SCHEMAS = eINSTANCE.getDatabase_Schemas();

		/**
		 * The meta object literal for the '<em><b>Jdbc Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__JDBC_DRIVER = eINSTANCE.getDatabase_JdbcDriver();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.hdp.ingest.impl.DbTableImpl <em>Db Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.hdp.ingest.impl.DbTableImpl
		 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getDbTable()
		 * @generated
		 */
		EClass DB_TABLE = eINSTANCE.getDbTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_TABLE__NAME = eINSTANCE.getDbTable_Name();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_TABLE__COLUMNS = eINSTANCE.getDbTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Sqoop Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_TABLE__SQOOP_IMPORTS = eINSTANCE.getDbTable_SqoopImports();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.hdp.ingest.impl.DbSchemaImpl <em>Db Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.hdp.ingest.impl.DbSchemaImpl
		 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getDbSchema()
		 * @generated
		 */
		EClass DB_SCHEMA = eINSTANCE.getDbSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_SCHEMA__NAME = eINSTANCE.getDbSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_SCHEMA__TABLES = eINSTANCE.getDbSchema_Tables();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.hdp.ingest.impl.SqoopImportImpl <em>Sqoop Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.hdp.ingest.impl.SqoopImportImpl
		 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getSqoopImport()
		 * @generated
		 */
		EClass SQOOP_IMPORT = eINSTANCE.getSqoopImport();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.hdp.ingest.impl.SqoopHiveImportImpl <em>Sqoop Hive Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.hdp.ingest.impl.SqoopHiveImportImpl
		 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getSqoopHiveImport()
		 * @generated
		 */
		EClass SQOOP_HIVE_IMPORT = eINSTANCE.getSqoopHiveImport();

		/**
		 * The meta object literal for the '<em><b>Target Hive Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQOOP_HIVE_IMPORT__TARGET_HIVE_DATABASE = eINSTANCE.getSqoopHiveImport_TargetHiveDatabase();

		/**
		 * The meta object literal for the '<em><b>Target Hive Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQOOP_HIVE_IMPORT__TARGET_HIVE_TABLE = eINSTANCE.getSqoopHiveImport_TargetHiveTable();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.hdp.ingest.impl.SqoopHiveIncrementalImportImpl <em>Sqoop Hive Incremental Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.hdp.ingest.impl.SqoopHiveIncrementalImportImpl
		 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getSqoopHiveIncrementalImport()
		 * @generated
		 */
		EClass SQOOP_HIVE_INCREMENTAL_IMPORT = eINSTANCE.getSqoopHiveIncrementalImport();

		/**
		 * The meta object literal for the '<em><b>Check Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN = eINSTANCE.getSqoopHiveIncrementalImport_CheckColumn();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.hdp.ingest.impl.DbColumnImpl <em>Db Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.hdp.ingest.impl.DbColumnImpl
		 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getDbColumn()
		 * @generated
		 */
		EClass DB_COLUMN = eINSTANCE.getDbColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLUMN__NAME = eINSTANCE.getDbColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Jdbc Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLUMN__JDBC_TYPE = eINSTANCE.getDbColumn_JdbcType();

		/**
		 * The meta object literal for the '<em><b>Jdbc Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLUMN__JDBC_SCALE = eINSTANCE.getDbColumn_JdbcScale();

		/**
		 * The meta object literal for the '<em><b>Jdbc Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COLUMN__JDBC_PRECISION = eINSTANCE.getDbColumn_JdbcPrecision();

		/**
		 * The meta object literal for the '{@link com.jeevaneo.hdp.ingest.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jeevaneo.hdp.ingest.impl.CatalogueImpl
		 * @see com.jeevaneo.hdp.ingest.impl.IngestPackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Databases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__DATABASES = eINSTANCE.getCatalogue_Databases();

	}

} //IngestPackage
