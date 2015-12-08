/**
 */
package com.jeevaneo.hdp.ingest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.jeevaneo.hdp.ingest.IngestPackage
 * @generated
 */
public interface IngestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IngestFactory eINSTANCE = com.jeevaneo.hdp.ingest.impl.IngestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Db Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Db Table</em>'.
	 * @generated
	 */
	DbTable createDbTable();

	/**
	 * Returns a new object of class '<em>Db Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Db Schema</em>'.
	 * @generated
	 */
	DbSchema createDbSchema();

	/**
	 * Returns a new object of class '<em>Sqoop Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqoop Import</em>'.
	 * @generated
	 */
	SqoopImport createSqoopImport();

	/**
	 * Returns a new object of class '<em>Sqoop Hive Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqoop Hive Import</em>'.
	 * @generated
	 */
	SqoopHiveImport createSqoopHiveImport();

	/**
	 * Returns a new object of class '<em>Sqoop Hive Incremental Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqoop Hive Incremental Import</em>'.
	 * @generated
	 */
	SqoopHiveIncrementalImport createSqoopHiveIncrementalImport();

	/**
	 * Returns a new object of class '<em>Db Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Db Column</em>'.
	 * @generated
	 */
	DbColumn createDbColumn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IngestPackage getIngestPackage();

} //IngestFactory
