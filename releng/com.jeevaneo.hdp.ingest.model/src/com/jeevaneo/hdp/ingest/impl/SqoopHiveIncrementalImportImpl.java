/**
 */
package com.jeevaneo.hdp.ingest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.jeevaneo.hdp.ingest.DbColumn;
import com.jeevaneo.hdp.ingest.IngestPackage;
import com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqoop Hive Incremental Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.SqoopHiveIncrementalImportImpl#getCheckColumn <em>Check Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqoopHiveIncrementalImportImpl extends SqoopHiveImportImpl implements SqoopHiveIncrementalImport {
	/**
	 * The cached value of the '{@link #getCheckColumn() <em>Check Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckColumn()
	 * @generated
	 * @ordered
	 */
	protected DbColumn checkColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqoopHiveIncrementalImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IngestPackage.Literals.SQOOP_HIVE_INCREMENTAL_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbColumn getCheckColumn() {
		if (checkColumn != null && checkColumn.eIsProxy()) {
			InternalEObject oldCheckColumn = (InternalEObject)checkColumn;
			checkColumn = (DbColumn)eResolveProxy(oldCheckColumn);
			if (checkColumn != oldCheckColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IngestPackage.SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN, oldCheckColumn, checkColumn));
			}
		}
		return checkColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbColumn basicGetCheckColumn() {
		return checkColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckColumn(DbColumn newCheckColumn) {
		DbColumn oldCheckColumn = checkColumn;
		checkColumn = newCheckColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN, oldCheckColumn, checkColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IngestPackage.SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN:
				if (resolve) return getCheckColumn();
				return basicGetCheckColumn();
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
			case IngestPackage.SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN:
				setCheckColumn((DbColumn)newValue);
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
			case IngestPackage.SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN:
				setCheckColumn((DbColumn)null);
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
			case IngestPackage.SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN:
				return checkColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //SqoopHiveIncrementalImportImpl
