/**
 */
package com.jeevaneo.hdp.ingest.tests;

import com.jeevaneo.hdp.ingest.IngestFactory;
import com.jeevaneo.hdp.ingest.SqoopHiveImport;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sqoop Hive Import</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqoopHiveImportTest extends SqoopImportTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SqoopHiveImportTest.class);
	}

	/**
	 * Constructs a new Sqoop Hive Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqoopHiveImportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sqoop Hive Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SqoopHiveImport getFixture() {
		return (SqoopHiveImport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IngestFactory.eINSTANCE.createSqoopHiveImport());
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

} //SqoopHiveImportTest
