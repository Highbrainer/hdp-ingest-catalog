/**
 */
package com.jeevaneo.hdp.ingest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqoop Hive Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.SqoopHiveImport#getTargetHiveDatabase <em>Target Hive Database</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.SqoopHiveImport#getTargetHiveTable <em>Target Hive Table</em>}</li>
 * </ul>
 *
 * @see com.jeevaneo.hdp.ingest.IngestPackage#getSqoopHiveImport()
 * @model
 * @generated
 */
public interface SqoopHiveImport extends SqoopImport {
	/**
	 * Returns the value of the '<em><b>Target Hive Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Hive Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Hive Database</em>' attribute.
	 * @see #setTargetHiveDatabase(String)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getSqoopHiveImport_TargetHiveDatabase()
	 * @model required="true"
	 * @generated
	 */
	String getTargetHiveDatabase();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.SqoopHiveImport#getTargetHiveDatabase <em>Target Hive Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Hive Database</em>' attribute.
	 * @see #getTargetHiveDatabase()
	 * @generated
	 */
	void setTargetHiveDatabase(String value);

	/**
	 * Returns the value of the '<em><b>Target Hive Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Hive Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Hive Table</em>' attribute.
	 * @see #setTargetHiveTable(String)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getSqoopHiveImport_TargetHiveTable()
	 * @model required="true"
	 * @generated
	 */
	String getTargetHiveTable();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.SqoopHiveImport#getTargetHiveTable <em>Target Hive Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Hive Table</em>' attribute.
	 * @see #getTargetHiveTable()
	 * @generated
	 */
	void setTargetHiveTable(String value);

} // SqoopHiveImport
