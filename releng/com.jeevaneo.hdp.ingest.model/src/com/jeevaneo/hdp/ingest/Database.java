/**
 */
package com.jeevaneo.hdp.ingest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.Database#getLabel <em>Label</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.Database#getJdbcUrl <em>Jdbc Url</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.Database#getJdbcUser <em>Jdbc User</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.Database#getJdbcPassword <em>Jdbc Password</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.Database#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.Database#getJdbcDriver <em>Jdbc Driver</em>}</li>
 * </ul>
 *
 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDatabase_Label()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.Database#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Url</em>' attribute.
	 * @see #setJdbcUrl(String)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDatabase_JdbcUrl()
	 * @model required="true"
	 * @generated
	 */
	String getJdbcUrl();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.Database#getJdbcUrl <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Url</em>' attribute.
	 * @see #getJdbcUrl()
	 * @generated
	 */
	void setJdbcUrl(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc User</em>' attribute.
	 * @see #setJdbcUser(String)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDatabase_JdbcUser()
	 * @model required="true"
	 * @generated
	 */
	String getJdbcUser();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.Database#getJdbcUser <em>Jdbc User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc User</em>' attribute.
	 * @see #getJdbcUser()
	 * @generated
	 */
	void setJdbcUser(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Password</em>' attribute.
	 * @see #setJdbcPassword(String)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDatabase_JdbcPassword()
	 * @model required="true"
	 * @generated
	 */
	String getJdbcPassword();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.Database#getJdbcPassword <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Password</em>' attribute.
	 * @see #getJdbcPassword()
	 * @generated
	 */
	void setJdbcPassword(String value);

	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.hdp.ingest.DbSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDatabase_Schemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<DbSchema> getSchemas();

	/**
	 * Returns the value of the '<em><b>Jdbc Driver</b></em>' attribute.
	 * The default value is <code>"oracle.jdbc.driver.OracleDriver"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Driver</em>' attribute.
	 * @see #setJdbcDriver(String)
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getDatabase_JdbcDriver()
	 * @model default="oracle.jdbc.driver.OracleDriver" required="true"
	 * @generated
	 */
	String getJdbcDriver();

	/**
	 * Sets the value of the '{@link com.jeevaneo.hdp.ingest.Database#getJdbcDriver <em>Jdbc Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Driver</em>' attribute.
	 * @see #getJdbcDriver()
	 * @generated
	 */
	void setJdbcDriver(String value);

} // Database
