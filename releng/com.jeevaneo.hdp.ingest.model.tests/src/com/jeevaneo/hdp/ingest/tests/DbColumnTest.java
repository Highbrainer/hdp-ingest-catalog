/**
 */
package com.jeevaneo.hdp.ingest.tests;

import com.jeevaneo.hdp.ingest.DbColumn;
import com.jeevaneo.hdp.ingest.IngestFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Db Column</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbColumnTest extends TestCase {

	/**
	 * The fixture for this Db Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbColumn fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DbColumnTest.class);
	}

	/**
	 * Constructs a new Db Column test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbColumnTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Db Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DbColumn fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Db Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbColumn getFixture() {
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
		setFixture(IngestFactory.eINSTANCE.createDbColumn());
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

} //DbColumnTest
