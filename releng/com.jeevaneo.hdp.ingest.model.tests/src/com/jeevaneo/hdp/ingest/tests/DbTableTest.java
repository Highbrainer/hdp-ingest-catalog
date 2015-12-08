/**
 */
package com.jeevaneo.hdp.ingest.tests;

import com.jeevaneo.hdp.ingest.DbTable;
import com.jeevaneo.hdp.ingest.IngestFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Db Table</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbTableTest extends TestCase {

	/**
	 * The fixture for this Db Table test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbTable fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DbTableTest.class);
	}

	/**
	 * Constructs a new Db Table test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbTableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Db Table test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DbTable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Db Table test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbTable getFixture() {
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
		setFixture(IngestFactory.eINSTANCE.createDbTable());
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

} //DbTableTest
