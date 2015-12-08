/**
 */
package com.jeevaneo.hdp.ingest.tests;

import com.jeevaneo.hdp.ingest.IngestFactory;
import com.jeevaneo.hdp.ingest.SqoopHiveIncrementalImport;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sqoop Hive Incremental Import</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqoopHiveIncrementalImportTest extends SqoopHiveImportTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SqoopHiveIncrementalImportTest.class);
	}

	/**
	 * Constructs a new Sqoop Hive Incremental Import test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqoopHiveIncrementalImportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sqoop Hive Incremental Import test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SqoopHiveIncrementalImport getFixture() {
		return (SqoopHiveIncrementalImport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IngestFactory.eINSTANCE.createSqoopHiveIncrementalImport());
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

} //SqoopHiveIncrementalImportTest
