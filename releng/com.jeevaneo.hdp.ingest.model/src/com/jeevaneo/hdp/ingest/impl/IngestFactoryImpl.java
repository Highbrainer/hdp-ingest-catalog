/**
 */
package com.jeevaneo.hdp.ingest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.jeevaneo.hdp.ingest.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IngestFactoryImpl extends EFactoryImpl implements IngestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IngestFactory init() {
		try {
			IngestFactory theIngestFactory = (IngestFactory)EPackage.Registry.INSTANCE.getEFactory(IngestPackage.eNS_URI);
			if (theIngestFactory != null) {
				return theIngestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IngestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IngestPackage.DATABASE: return createDatabase();
			case IngestPackage.DB_TABLE: return createDbTable();
			case IngestPackage.DB_SCHEMA: return createDbSchema();
			case IngestPackage.SQOOP_IMPORT: return createSqoopImport();
			case IngestPackage.SQOOP_HIVE_IMPORT: return createSqoopHiveImport();
			case IngestPackage.SQOOP_HIVE_INCREMENTAL_IMPORT: return createSqoopHiveIncrementalImport();
			case IngestPackage.DB_COLUMN: return createDbColumn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbTable createDbTable() {
		DbTableImpl dbTable = new DbTableImpl();
		return dbTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbSchema createDbSchema() {
		DbSchemaImpl dbSchema = new DbSchemaImpl();
		return dbSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqoopImport createSqoopImport() {
		SqoopImportImpl sqoopImport = new SqoopImportImpl();
		return sqoopImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqoopHiveImport createSqoopHiveImport() {
		SqoopHiveImportImpl sqoopHiveImport = new SqoopHiveImportImpl();
		return sqoopHiveImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqoopHiveIncrementalImport createSqoopHiveIncrementalImport() {
		SqoopHiveIncrementalImportImpl sqoopHiveIncrementalImport = new SqoopHiveIncrementalImportImpl();
		return sqoopHiveIncrementalImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbColumn createDbColumn() {
		DbColumnImpl dbColumn = new DbColumnImpl();
		return dbColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngestPackage getIngestPackage() {
		return (IngestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IngestPackage getPackage() {
		return IngestPackage.eINSTANCE;
	}

} //IngestFactoryImpl
