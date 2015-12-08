/**
 */
package com.jeevaneo.hdp.ingest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.jeevaneo.hdp.ingest.DbTable;
import com.jeevaneo.hdp.ingest.IngestPackage;
import com.jeevaneo.hdp.ingest.SqoopImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqoop Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.SqoopImportImpl#getDbTable <em>Db Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqoopImportImpl extends MinimalEObjectImpl.Container implements SqoopImport {
	/**
	 * The cached value of the '{@link #getDbTable() <em>Db Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTable()
	 * @generated
	 * @ordered
	 */
	protected DbTable dbTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqoopImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IngestPackage.Literals.SQOOP_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbTable getDbTable() {
		if (dbTable != null && dbTable.eIsProxy()) {
			InternalEObject oldDbTable = (InternalEObject)dbTable;
			dbTable = (DbTable)eResolveProxy(oldDbTable);
			if (dbTable != oldDbTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IngestPackage.SQOOP_IMPORT__DB_TABLE, oldDbTable, dbTable));
			}
		}
		return dbTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbTable basicGetDbTable() {
		return dbTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbTable(DbTable newDbTable) {
		DbTable oldDbTable = dbTable;
		dbTable = newDbTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.SQOOP_IMPORT__DB_TABLE, oldDbTable, dbTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IngestPackage.SQOOP_IMPORT__DB_TABLE:
				if (resolve) return getDbTable();
				return basicGetDbTable();
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
			case IngestPackage.SQOOP_IMPORT__DB_TABLE:
				setDbTable((DbTable)newValue);
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
			case IngestPackage.SQOOP_IMPORT__DB_TABLE:
				setDbTable((DbTable)null);
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
			case IngestPackage.SQOOP_IMPORT__DB_TABLE:
				return dbTable != null;
		}
		return super.eIsSet(featureID);
	}

} //SqoopImportImpl
