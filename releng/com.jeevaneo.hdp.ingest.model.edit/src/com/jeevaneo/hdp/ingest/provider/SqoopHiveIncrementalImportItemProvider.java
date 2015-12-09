/**
 */
package com.jeevaneo.hdp.ingest.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import com.jeevaneo.hdp.ingest.DbTable;
import com.jeevaneo.hdp.ingest.IngestPackage;
import com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport;

/**
 * This is the item provider adapter for a {@link com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class SqoopHiveIncrementalImportItemProvider extends SqoopHiveImportItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SqoopHiveIncrementalImportItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCheckColumnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Check Column feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addCheckColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_SqoopHiveIncrementalImport_checkColumn_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SqoopHiveIncrementalImport_checkColumn_feature",
						"_UI_SqoopHiveIncrementalImport_type"),
				IngestPackage.Literals.SQOOP_HIVE_INCREMENTAL_IMPORT__CHECK_COLUMN, true, false, true, null, null, null) {
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				SqoopHiveIncrementalImport sqoopImport = (SqoopHiveIncrementalImport) object;
				DbTable table = (DbTable) sqoopImport.eContainer();
				return new ArrayList<>(table.getColumns());
			}
		});
	}

	/**
	 * This returns SqoopHiveIncrementalImport.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SqoopHiveIncrementalImport"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SqoopHiveIncrementalImport) object).getTargetHiveDatabase();
		return label == null || label.length() == 0 ? getString("_UI_SqoopHiveIncrementalImport_type")
				: getString("_UI_SqoopHiveIncrementalImport_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
