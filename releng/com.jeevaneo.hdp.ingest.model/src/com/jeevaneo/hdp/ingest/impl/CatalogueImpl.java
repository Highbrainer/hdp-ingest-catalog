/**
 */
package com.jeevaneo.hdp.ingest.impl;

import com.jeevaneo.hdp.ingest.Catalogue;
import com.jeevaneo.hdp.ingest.Database;
import com.jeevaneo.hdp.ingest.IngestPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.impl.CatalogueImpl#getDatabases <em>Databases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogueImpl extends MinimalEObjectImpl.Container implements Catalogue {
	/**
	 * The cached value of the '{@link #getDatabases() <em>Databases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabases()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> databases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IngestPackage.Literals.CATALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Database> getDatabases() {
		if (databases == null) {
			databases = new EObjectContainmentEList<Database>(Database.class, this, IngestPackage.CATALOGUE__DATABASES);
		}
		return databases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IngestPackage.CATALOGUE__DATABASES:
				return ((InternalEList<?>)getDatabases()).basicRemove(otherEnd, msgs);
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
			case IngestPackage.CATALOGUE__DATABASES:
				return getDatabases();
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
			case IngestPackage.CATALOGUE__DATABASES:
				getDatabases().clear();
				getDatabases().addAll((Collection<? extends Database>)newValue);
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
			case IngestPackage.CATALOGUE__DATABASES:
				getDatabases().clear();
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
			case IngestPackage.CATALOGUE__DATABASES:
				return databases != null && !databases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CatalogueImpl
