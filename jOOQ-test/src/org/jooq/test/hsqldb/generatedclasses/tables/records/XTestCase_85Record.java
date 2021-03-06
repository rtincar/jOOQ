/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = -773922949;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public org.jooq.test.hsqldb.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID)))
			.and(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.NAME.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
	}

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}
}
