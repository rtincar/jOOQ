/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_71", schema = "test2")
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = -469225807;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES test2.x_test_case_64_69 (ID)
	 * </pre></code>
	 */
	public void setTestCase_64_69Id(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES test2.x_test_case_64_69 (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "TEST_CASE_64_69_ID")
	public java.lang.Integer getTestCase_64_69Id() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES test2.x_test_case_64_69 (ID)
	 * </pre></code>
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record fetchXTestCase_64_69() {
		return create()
			.selectFrom(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID.equal(getValue(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}
}
