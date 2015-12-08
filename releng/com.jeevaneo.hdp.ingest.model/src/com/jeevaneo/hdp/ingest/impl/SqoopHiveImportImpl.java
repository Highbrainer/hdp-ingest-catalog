/**
 */
package com.jeevaneo.hdp.ingest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.jeevaneo.hdp.ingest.IngestPackage;
import com.jeevaneo.hdp.ingest.SqoopHiveImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqoop Hive Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.SqoopHiveImportImpl#getTargetHiveDatabase <em>Target Hive Database</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.SqoopHiveImportImpl#getTargetHiveTable <em>Target Hive Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqoopHiveImportImpl extends SqoopImportImpl implements SqoopHiveImport {
	/**
	 * The default value of the '{@link #getTargetHiveDatabase() <em>Target Hive Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHiveDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HIVE_DATABASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetHiveDatabase() <em>Target Hive Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHiveDatabase()
	 * @generated
	 * @ordered
	 */
	protected String targetHiveDatabase = TARGET_HIVE_DATABASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetHiveTable() <em>Target Hive Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHiveTable()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HIVE_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetHiveTable() <em>Target Hive Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHiveTable()
	 * @generated
	 * @ordered
	 */
	protected String targetHiveTable = TARGET_HIVE_TABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqoopHiveImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IngestPackage.Literals.SQOOP_HIVE_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetHiveDatabase() {
		return targetHiveDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHiveDatabase(String newTargetHiveDatabase) {
		String oldTargetHiveDatabase = targetHiveDatabase;
		targetHiveDatabase = newTargetHiveDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_DATABASE, oldTargetHiveDatabase, targetHiveDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetHiveTable() {
		return targetHiveTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHiveTable(String newTargetHiveTable) {
		String oldTargetHiveTable = targetHiveTable;
		targetHiveTable = newTargetHiveTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_TABLE, oldTargetHiveTable, targetHiveTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_DATABASE:
				return getTargetHiveDatabase();
			case IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_TABLE:
				return getTargetHiveTable();
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
			case IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_DATABASE:
				setTargetHiveDatabase((String)newValue);
				return;
			case IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_TABLE:
				setTargetHiveTable((String)newValue);
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
			case IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_DATABASE:
				setTargetHiveDatabase(TARGET_HIVE_DATABASE_EDEFAULT);
				return;
			case IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_TABLE:
				setTargetHiveTable(TARGET_HIVE_TABLE_EDEFAULT);
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
			case IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_DATABASE:
				return TARGET_HIVE_DATABASE_EDEFAULT == null ? targetHiveDatabase != null : !TARGET_HIVE_DATABASE_EDEFAULT.equals(targetHiveDatabase);
			case IngestPackage.SQOOP_HIVE_IMPORT__TARGET_HIVE_TABLE:
				return TARGET_HIVE_TABLE_EDEFAULT == null ? targetHiveTable != null : !TARGET_HIVE_TABLE_EDEFAULT.equals(targetHiveTable);
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
		result.append(" (targetHiveDatabase: ");
		result.append(targetHiveDatabase);
		result.append(", targetHiveTable: ");
		result.append(targetHiveTable);
		result.append(')');
		return result.toString();
	}

} //SqoopHiveImportImpl
