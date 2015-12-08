/**
 */
package com.jeevaneo.hdp.ingest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.jeevaneo.hdp.ingest.DbColumn;
import com.jeevaneo.hdp.ingest.IngestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Db Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DbColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DbColumnImpl#getJdbcType <em>Jdbc Type</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DbColumnImpl#getJdbcScale <em>Jdbc Scale</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DbColumnImpl#getJdbcPrecision <em>Jdbc Precision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DbColumnImpl extends MinimalEObjectImpl.Container implements DbColumn {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcType() <em>Jdbc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcType()
	 * @generated
	 * @ordered
	 */
	protected static final int JDBC_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJdbcType() <em>Jdbc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcType()
	 * @generated
	 * @ordered
	 */
	protected int jdbcType = JDBC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcScale() <em>Jdbc Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcScale()
	 * @generated
	 * @ordered
	 */
	protected static final int JDBC_SCALE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJdbcScale() <em>Jdbc Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcScale()
	 * @generated
	 * @ordered
	 */
	protected int jdbcScale = JDBC_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcPrecision() <em>Jdbc Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int JDBC_PRECISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJdbcPrecision() <em>Jdbc Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcPrecision()
	 * @generated
	 * @ordered
	 */
	protected int jdbcPrecision = JDBC_PRECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IngestPackage.Literals.DB_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DB_COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJdbcType() {
		return jdbcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcType(int newJdbcType) {
		int oldJdbcType = jdbcType;
		jdbcType = newJdbcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DB_COLUMN__JDBC_TYPE, oldJdbcType, jdbcType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJdbcScale() {
		return jdbcScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcScale(int newJdbcScale) {
		int oldJdbcScale = jdbcScale;
		jdbcScale = newJdbcScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DB_COLUMN__JDBC_SCALE, oldJdbcScale, jdbcScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJdbcPrecision() {
		return jdbcPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcPrecision(int newJdbcPrecision) {
		int oldJdbcPrecision = jdbcPrecision;
		jdbcPrecision = newJdbcPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DB_COLUMN__JDBC_PRECISION, oldJdbcPrecision, jdbcPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IngestPackage.DB_COLUMN__NAME:
				return getName();
			case IngestPackage.DB_COLUMN__JDBC_TYPE:
				return getJdbcType();
			case IngestPackage.DB_COLUMN__JDBC_SCALE:
				return getJdbcScale();
			case IngestPackage.DB_COLUMN__JDBC_PRECISION:
				return getJdbcPrecision();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IngestPackage.DB_COLUMN__NAME:
				setName((String)newValue);
				return;
			case IngestPackage.DB_COLUMN__JDBC_TYPE:
				setJdbcType((Integer)newValue);
				return;
			case IngestPackage.DB_COLUMN__JDBC_SCALE:
				setJdbcScale((Integer)newValue);
				return;
			case IngestPackage.DB_COLUMN__JDBC_PRECISION:
				setJdbcPrecision((Integer)newValue);
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
			case IngestPackage.DB_COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IngestPackage.DB_COLUMN__JDBC_TYPE:
				setJdbcType(JDBC_TYPE_EDEFAULT);
				return;
			case IngestPackage.DB_COLUMN__JDBC_SCALE:
				setJdbcScale(JDBC_SCALE_EDEFAULT);
				return;
			case IngestPackage.DB_COLUMN__JDBC_PRECISION:
				setJdbcPrecision(JDBC_PRECISION_EDEFAULT);
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
			case IngestPackage.DB_COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IngestPackage.DB_COLUMN__JDBC_TYPE:
				return jdbcType != JDBC_TYPE_EDEFAULT;
			case IngestPackage.DB_COLUMN__JDBC_SCALE:
				return jdbcScale != JDBC_SCALE_EDEFAULT;
			case IngestPackage.DB_COLUMN__JDBC_PRECISION:
				return jdbcPrecision != JDBC_PRECISION_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", jdbcType: ");
		result.append(jdbcType);
		result.append(", jdbcScale: ");
		result.append(jdbcScale);
		result.append(", jdbcPrecision: ");
		result.append(jdbcPrecision);
		result.append(')');
		return result.toString();
	}

} //DbColumnImpl
