/**
 */
package com.jeevaneo.hdp.ingest.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import com.jeevaneo.hdp.ingest.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.jeevaneo.hdp.ingest.IngestPackage
 * @generated
 */
public class IngestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IngestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IngestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngestSwitch<Adapter> modelSwitch =
		new IngestSwitch<Adapter>() {
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseDbTable(DbTable object) {
				return createDbTableAdapter();
			}
			@Override
			public Adapter caseDbSchema(DbSchema object) {
				return createDbSchemaAdapter();
			}
			@Override
			public Adapter caseSqoopImport(SqoopImport object) {
				return createSqoopImportAdapter();
			}
			@Override
			public Adapter caseSqoopHiveImport(SqoopHiveImport object) {
				return createSqoopHiveImportAdapter();
			}
			@Override
			public Adapter caseSqoopHiveIncrementalImport(SqoopHiveIncrementalImport object) {
				return createSqoopHiveIncrementalImportAdapter();
			}
			@Override
			public Adapter caseDbColumn(DbColumn object) {
				return createDbColumnAdapter();
			}
			@Override
			public Adapter caseCatalogue(Catalogue object) {
				return createCatalogueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.hdp.ingest.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.hdp.ingest.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.hdp.ingest.DbTable <em>Db Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.hdp.ingest.DbTable
	 * @generated
	 */
	public Adapter createDbTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.hdp.ingest.DbSchema <em>Db Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.hdp.ingest.DbSchema
	 * @generated
	 */
	public Adapter createDbSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.hdp.ingest.SqoopImport <em>Sqoop Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.hdp.ingest.SqoopImport
	 * @generated
	 */
	public Adapter createSqoopImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.hdp.ingest.SqoopHiveImport <em>Sqoop Hive Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.hdp.ingest.SqoopHiveImport
	 * @generated
	 */
	public Adapter createSqoopHiveImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport <em>Sqoop Hive Incremental Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport
	 * @generated
	 */
	public Adapter createSqoopHiveIncrementalImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.hdp.ingest.DbColumn <em>Db Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.hdp.ingest.DbColumn
	 * @generated
	 */
	public Adapter createDbColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.jeevaneo.hdp.ingest.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.jeevaneo.hdp.ingest.Catalogue
	 * @generated
	 */
	public Adapter createCatalogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IngestAdapterFactory
