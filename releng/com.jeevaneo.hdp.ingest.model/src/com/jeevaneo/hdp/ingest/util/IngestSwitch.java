/**
 */
package com.jeevaneo.hdp.ingest.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import com.jeevaneo.hdp.ingest.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.jeevaneo.hdp.ingest.IngestPackage
 * @generated
 */
public class IngestSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IngestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngestSwitch() {
		if (modelPackage == null) {
			modelPackage = IngestPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IngestPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IngestPackage.DB_TABLE: {
				DbTable dbTable = (DbTable)theEObject;
				T result = caseDbTable(dbTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IngestPackage.DB_SCHEMA: {
				DbSchema dbSchema = (DbSchema)theEObject;
				T result = caseDbSchema(dbSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IngestPackage.SQOOP_IMPORT: {
				SqoopImport sqoopImport = (SqoopImport)theEObject;
				T result = caseSqoopImport(sqoopImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IngestPackage.SQOOP_HIVE_IMPORT: {
				SqoopHiveImport sqoopHiveImport = (SqoopHiveImport)theEObject;
				T result = caseSqoopHiveImport(sqoopHiveImport);
				if (result == null) result = caseSqoopImport(sqoopHiveImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IngestPackage.SQOOP_HIVE_INCREMENTAL_IMPORT: {
				SqoopHiveIncrementalImport sqoopHiveIncrementalImport = (SqoopHiveIncrementalImport)theEObject;
				T result = caseSqoopHiveIncrementalImport(sqoopHiveIncrementalImport);
				if (result == null) result = caseSqoopHiveImport(sqoopHiveIncrementalImport);
				if (result == null) result = caseSqoopImport(sqoopHiveIncrementalImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IngestPackage.DB_COLUMN: {
				DbColumn dbColumn = (DbColumn)theEObject;
				T result = caseDbColumn(dbColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IngestPackage.CATALOGUE: {
				Catalogue catalogue = (Catalogue)theEObject;
				T result = caseCatalogue(catalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Db Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Db Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbTable(DbTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Db Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Db Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbSchema(DbSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqoop Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqoop Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqoopImport(SqoopImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqoop Hive Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqoop Hive Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqoopHiveImport(SqoopHiveImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sqoop Hive Incremental Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sqoop Hive Incremental Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqoopHiveIncrementalImport(SqoopHiveIncrementalImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Db Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Db Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbColumn(DbColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogue(Catalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IngestSwitch
