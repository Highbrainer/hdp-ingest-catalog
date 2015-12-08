/**
 */
package com.jeevaneo.hdp.ingest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Db Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.DbColumn#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.DbColumn#getJdbcType <em>Jdbc Type</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.DbColumn#getJdbcScale <em>Jdbc Scale</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.DbColumn#getJdbcPrecision <em>Jdbc Precision</em>}</li>
 * </ul>
 *
 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDbColumn()
 * @model
 * @generated
 */
public interface DbColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDbColumn_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.DbColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Type</em>' attribute.
	 * @see #setJdbcType(int)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDbColumn_JdbcType()
	 * @model required="true"
	 * @generated
	 */
	int getJdbcType();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.DbColumn#getJdbcType <em>Jdbc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Type</em>' attribute.
	 * @see #getJdbcType()
	 * @generated
	 */
	void setJdbcType(int value);

	/**
	 * Returns the value of the '<em><b>Jdbc Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Scale</em>' attribute.
	 * @see #setJdbcScale(int)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDbColumn_JdbcScale()
	 * @model required="true"
	 * @generated
	 */
	int getJdbcScale();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.DbColumn#getJdbcScale <em>Jdbc Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Scale</em>' attribute.
	 * @see #getJdbcScale()
	 * @generated
	 */
	void setJdbcScale(int value);

	/**
	 * Returns the value of the '<em><b>Jdbc Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Precision</em>' attribute.
	 * @see #setJdbcPrecision(int)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDbColumn_JdbcPrecision()
	 * @model required="true"
	 * @generated
	 */
	int getJdbcPrecision();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.DbColumn#getJdbcPrecision <em>Jdbc Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Precision</em>' attribute.
	 * @see #getJdbcPrecision()
	 * @generated
	 */
	void setJdbcPrecision(int value);

} // DbColumn
