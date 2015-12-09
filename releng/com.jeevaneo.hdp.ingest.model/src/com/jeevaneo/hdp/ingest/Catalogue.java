/**
 */
package com.jeevaneo.hdp.ingest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.jeevaneo.hdp.ingest.Catalogue#getDatabases <em>Databases</em>}</li>
 * </ul>
 *
 * @see com.jeevaneo.hdp.ingest.IngestPackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Databases</b></em>' containment reference list.
	 * The list contents are of type {@link com.jeevaneo.hdp.ingest.Database}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databases</em>' containment reference list.
	 * @see com.jeevaneo.hdp.ingest.IngestPackage#getCatalogue_Databases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Database> getDatabases();

} // Catalogue
