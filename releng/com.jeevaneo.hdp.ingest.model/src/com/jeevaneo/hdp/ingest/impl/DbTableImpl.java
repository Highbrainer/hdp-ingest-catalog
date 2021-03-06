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

import com.jeevaneo.hdp.ingest.DbColumn;
import com.jeevaneo.hdp.ingest.DbTable;
import com.jeevaneo.hdp.ingest.IngestPackage;
import com.jeevaneo.hdp.ingest.SqoopImport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Db Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DbTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DbTableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.DbTableImpl#getSqoopImports <em>Sqoop Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DbTableImpl extends MinimalEObjectImpl.Container implements DbTable {
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
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<DbColumn> columns;

	/**
	 * The cached value of the '{@link #getSqoopImports() <em>Sqoop Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqoopImports()
	 * @generated
	 * @ordered
	 */
	protected EList<SqoopImport> sqoopImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IngestPackage.Literals.DB_TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IngestPackage.DB_TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DbColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<DbColumn>(DbColumn.class, this, IngestPackage.DB_TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqoopImport> getSqoopImports() {
		if (sqoopImports == null) {
			sqoopImports = new EObjectContainmentEList<SqoopImport>(SqoopImport.class, this, IngestPackage.DB_TABLE__SQOOP_IMPORTS);
		}
		return sqoopImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IngestPackage.DB_TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case IngestPackage.DB_TABLE__SQOOP_IMPORTS:
				return ((InternalEList<?>)getSqoopImports()).basicRemove(otherEnd, msgs);
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
			case IngestPackage.DB_TABLE__NAME:
				return getName();
			case IngestPackage.DB_TABLE__COLUMNS:
				return getColumns();
			case IngestPackage.DB_TABLE__SQOOP_IMPORTS:
				return getSqoopImports();
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
			case IngestPackage.DB_TABLE__NAME:
				setName((String)newValue);
				return;
			case IngestPackage.DB_TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends DbColumn>)newValue);
				return;
			case IngestPackage.DB_TABLE__SQOOP_IMPORTS:
				getSqoopImports().clear();
				getSqoopImports().addAll((Collection<? extends SqoopImport>)newValue);
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
			case IngestPackage.DB_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IngestPackage.DB_TABLE__COLUMNS:
				getColumns().clear();
				return;
			case IngestPackage.DB_TABLE__SQOOP_IMPORTS:
				getSqoopImports().clear();
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
			case IngestPackage.DB_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IngestPackage.DB_TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case IngestPackage.DB_TABLE__SQOOP_IMPORTS:
				return sqoopImports != null && !sqoopImports.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DbTableImpl
