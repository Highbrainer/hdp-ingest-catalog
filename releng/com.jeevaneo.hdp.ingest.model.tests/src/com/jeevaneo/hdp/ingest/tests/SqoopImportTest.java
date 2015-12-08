/**
 */
package com.jeevaneo.hdp.ingest.tests;

import com.jeevaneo.hdp.ingest.IngestFactory;
import com.jeevaneo.hdp.ingest.SqoopImport;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sqoop Import</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqoopImportTest extends TestCase {

	/**
	 * The fixture for this Sqoop Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqoopImport fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SqoopImportTest.class);
	}

	/**
	 * Constructs a new Sqoop Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqoopImportTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sqoop Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SqoopImport fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sqoop Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqoopImport getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IngestFactory.eINSTANCE.createSqoopImport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SqoopImportTest
