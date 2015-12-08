/**
 */
package com.jeevaneo.hdp.ingest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqoop Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.SqoopImport#getDbTable <em>Db Table</em>}</li>
 * </ul>
 *
 * @see com.jeevaneo.hdp.ingest.IngestPackage#getSqoopImport()
 * @model
 * @generated
 */
public interface SqoopImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Db Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Table</em>' reference.
	 * @see #setDbTable(DbTable)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getSqoopImport_DbTable()
	 * @model required="true"
	 * @generated
	 */
	DbTable getDbTable();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.SqoopImport#getDbTable <em>Db Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Table</em>' reference.
	 * @see #getDbTable()
	 * @generated
	 */
	void setDbTable(DbTable value);

} // SqoopImport
