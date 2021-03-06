/**
 */
package com.jeevaneo.hdp.ingest.provider;

import com.jeevaneo.hdp.ingest.util.IngestAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IngestItemProviderAdapterFactory extends IngestAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngestItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.hdp.ingest.Database} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseItemProvider databaseItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.hdp.ingest.Database}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatabaseAdapter() {
		if (databaseItemProvider == null) {
			databaseItemProvider = new DatabaseItemProvider(this);
		}

		return databaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.hdp.ingest.DbTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbTableItemProvider dbTableItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.hdp.ingest.DbTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDbTableAdapter() {
		if (dbTableItemProvider == null) {
			dbTableItemProvider = new DbTableItemProvider(this);
		}

		return dbTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.hdp.ingest.DbSchema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbSchemaItemProvider dbSchemaItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.hdp.ingest.DbSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDbSchemaAdapter() {
		if (dbSchemaItemProvider == null) {
			dbSchemaItemProvider = new DbSchemaItemProvider(this);
		}

		return dbSchemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.hdp.ingest.SqoopImport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqoopImportItemProvider sqoopImportItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.hdp.ingest.SqoopImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSqoopImportAdapter() {
		if (sqoopImportItemProvider == null) {
			sqoopImportItemProvider = new SqoopImportItemProvider(this);
		}

		return sqoopImportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.hdp.ingest.SqoopHiveImport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqoopHiveImportItemProvider sqoopHiveImportItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.hdp.ingest.SqoopHiveImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSqoopHiveImportAdapter() {
		if (sqoopHiveImportItemProvider == null) {
			sqoopHiveImportItemProvider = new SqoopHiveImportItemProvider(this);
		}

		return sqoopHiveImportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqoopHiveIncrementalImportItemProvider sqoopHiveIncrementalImportItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSqoopHiveIncrementalImportAdapter() {
		if (sqoopHiveIncrementalImportItemProvider == null) {
			sqoopHiveIncrementalImportItemProvider = new SqoopHiveIncrementalImportItemProvider(this);
		}

		return sqoopHiveIncrementalImportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.hdp.ingest.DbColumn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbColumnItemProvider dbColumnItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.hdp.ingest.DbColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDbColumnAdapter() {
		if (dbColumnItemProvider == null) {
			dbColumnItemProvider = new DbColumnItemProvider(this);
		}

		return dbColumnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.jeevaneo.hdp.ingest.Catalogue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogueItemProvider catalogueItemProvider;

	/**
	 * This creates an adapter for a {@link com.jeevaneo.hdp.ingest.Catalogue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCatalogueAdapter() {
		if (catalogueItemProvider == null) {
			catalogueItemProvider = new CatalogueItemProvider(this);
		}

		return catalogueItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (databaseItemProvider != null) databaseItemProvider.dispose();
		if (dbTableItemProvider != null) dbTableItemProvider.dispose();
		if (dbSchemaItemProvider != null) dbSchemaItemProvider.dispose();
		if (sqoopImportItemProvider != null) sqoopImportItemProvider.dispose();
		if (sqoopHiveImportItemProvider != null) sqoopHiveImportItemProvider.dispose();
		if (sqoopHiveIncrementalImportItemProvider != null) sqoopHiveIncrementalImportItemProvider.dispose();
		if (dbColumnItemProvider != null) dbColumnItemProvider.dispose();
		if (catalogueItemProvider != null) catalogueItemProvider.dispose();
	}

}
