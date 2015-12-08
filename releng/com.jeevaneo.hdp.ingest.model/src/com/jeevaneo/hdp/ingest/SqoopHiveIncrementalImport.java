/**
 */
package com.jeevaneo.hdp.ingest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqoop Hive Incremental Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport#getCheckColumn <em>Check Column</em>}</li>
 * </ul>
 *
 * @see com.jeevaneo.hdp.ingest.IngestPackage#getSqoopHiveIncrementalImport()
 * @model
 * @generated
 */
public interface SqoopHiveIncrementalImport extends SqoopHiveImport {
	/**
	 * Returns the value of the '<em><b>Check Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Column</em>' reference.
	 * @see #setCheckColumn(DbColumn)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getSqoopHiveIncrementalImport_CheckColumn()
	 * @model required="true"
	 * @generated
	 */
	DbColumn getCheckColumn();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport#getCheckColumn <em>Check Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Column</em>' reference.
	 * @see #getCheckColumn()
	 * @generated
	 */
	void setCheckColumn(DbColumn value);

} // SqoopHiveIncrementalImport
