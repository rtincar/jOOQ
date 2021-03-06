/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_71", schema = "TEST")
public class X_TEST_CASE_71 extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> {

	private static final long serialVersionUID = -1737053817;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true)
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES TEST.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	public void setTEST_CASE_64_69_ID(java.lang.Short value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES TEST.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "TEST_CASE_64_69_ID")
	public java.lang.Short getTEST_CASE_64_69_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES TEST.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69 fetchX_TEST_CASE_64_69() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID.equal(getValueAsInteger(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached X_TEST_CASE_71
	 */
	public X_TEST_CASE_71() {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71);
	}
}
