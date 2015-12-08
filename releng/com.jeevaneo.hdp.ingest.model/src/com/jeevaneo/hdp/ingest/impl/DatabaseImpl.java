/**
 */
package com.jeevaneo.hdp.ingest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.jeevaneo.hdp.ingest.Database;
import com.jeevaneo.hdp.ingest.DbSchema;
import com.jeevaneo.hdp.ingest.IngestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DatabaseImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DatabaseImpl#getJdbcUrl <em>Jdbc Url</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DatabaseImpl#getJdbcUser <em>Jdbc User</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DatabaseImpl#getJdbcPassword <em>Jdbc Password</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DatabaseImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DatabaseImpl#getJdbcDriver <em>Jdbc Driver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements Database {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcUrl() <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdbcUrl() <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUrl()
	 * @generated
	 * @ordered
	 */
	protected String jdbcUrl = JDBC_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcUser() <em>Jdbc User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUser()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdbcUser() <em>Jdbc User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUser()
	 * @generated
	 * @ordered
	 */
	protected String jdbcUser = JDBC_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcPassword() <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdbcPassword() <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcPassword()
	 * @generated
	 * @ordered
	 */
	protected String jdbcPassword = JDBC_PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<DbSchema> schemas;

	/**
	 * The default value of the '{@link #getJdbcDriver() <em>Jdbc Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_DRIVER_EDEFAULT = "oracle.jdbc.driver.OracleDriver";

	/**
	 * The cached value of the '{@link #getJdbcDriver() <em>Jdbc Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcDriver()
	 * @generated
	 * @ordered
	 */
	protected String jdbcDriver = JDBC_DRIVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IngestPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DATABASE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcUrl() {
		return jdbcUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcUrl(String newJdbcUrl) {
		String oldJdbcUrl = jdbcUrl;
		jdbcUrl = newJdbcUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DATABASE__JDBC_URL, oldJdbcUrl, jdbcUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcUser() {
		return jdbcUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcUser(String newJdbcUser) {
		String oldJdbcUser = jdbcUser;
		jdbcUser = newJdbcUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DATABASE__JDBC_USER, oldJdbcUser, jdbcUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcPassword() {
		return jdbcPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcPassword(String newJdbcPassword) {
		String oldJdbcPassword = jdbcPassword;
		jdbcPassword = newJdbcPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DATABASE__JDBC_PASSWORD, oldJdbcPassword, jdbcPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DbSchema> getSchemas() {
		if (schemas == null) {
			schemas = new EObjectContainmentEList<DbSchema>(DbSchema.class, this, IngestPackage.DATABASE__SCHEMAS);
		}
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcDriver() {
		return jdbcDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcDriver(String newJdbcDriver) {
		String oldJdbcDriver = jdbcDriver;
		jdbcDriver = newJdbcDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DATABASE__JDBC_DRIVER, oldJdbcDriver, jdbcDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IngestPackage.DATABASE__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IngestPackage.DATABASE__LABEL:
				return getLabel();
			case IngestPackage.DATABASE__JDBC_URL:
				return getJdbcUrl();
			case IngestPackage.DATABASE__JDBC_USER:
				return getJdbcUser();
			case IngestPackage.DATABASE__JDBC_PASSWORD:
				return getJdbcPassword();
			case IngestPackage.DATABASE__SCHEMAS:
				return getSchemas();
			case IngestPackage.DATABASE__JDBC_DRIVER:
				return getJdbcDriver();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IngestPackage.DATABASE__LABEL:
				setLabel((String)newValue);
				return;
			case IngestPackage.DATABASE__JDBC_URL:
				setJdbcUrl((String)newValue);
				return;
			case IngestPackage.DATABASE__JDBC_USER:
				setJdbcUser((String)newValue);
				return;
			case IngestPackage.DATABASE__JDBC_PASSWORD:
				setJdbcPassword((String)newValue);
				return;
			case IngestPackage.DATABASE__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends DbSchema>)newValue);
				return;
			case IngestPackage.DATABASE__JDBC_DRIVER:
				setJdbcDriver((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IngestPackage.DATABASE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case IngestPackage.DATABASE__JDBC_URL:
				setJdbcUrl(JDBC_URL_EDEFAULT);
				return;
			case IngestPackage.DATABASE__JDBC_USER:
				setJdbcUser(JDBC_USER_EDEFAULT);
				return;
			case IngestPackage.DATABASE__JDBC_PASSWORD:
				setJdbcPassword(JDBC_PASSWORD_EDEFAULT);
				return;
			case IngestPackage.DATABASE__SCHEMAS:
				getSchemas().clear();
				return;
			case IngestPackage.DATABASE__JDBC_DRIVER:
				setJdbcDriver(JDBC_DRIVER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IngestPackage.DATABASE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case IngestPackage.DATABASE__JDBC_URL:
				return JDBC_URL_EDEFAULT == null ? jdbcUrl != null : !JDBC_URL_EDEFAULT.equals(jdbcUrl);
			case IngestPackage.DATABASE__JDBC_USER:
				return JDBC_USER_EDEFAULT == null ? jdbcUser != null : !JDBC_USER_EDEFAULT.equals(jdbcUser);
			case IngestPackage.DATABASE__JDBC_PASSWORD:
				return JDBC_PASSWORD_EDEFAULT == null ? jdbcPassword != null : !JDBC_PASSWORD_EDEFAULT.equals(jdbcPassword);
			case IngestPackage.DATABASE__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
			case IngestPackage.DATABASE__JDBC_DRIVER:
				return JDBC_DRIVER_EDEFAULT == null ? jdbcDriver != null : !JDBC_DRIVER_EDEFAULT.equals(jdbcDriver);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", jdbcUrl: ");
		result.append(jdbcUrl);
		result.append(", jdbcUser: ");
		result.append(jdbcUser);
		result.append(", jdbcPassword: ");
		result.append(jdbcPassword);
		result.append(", jdbcDriver: ");
		result.append(jdbcDriver);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
