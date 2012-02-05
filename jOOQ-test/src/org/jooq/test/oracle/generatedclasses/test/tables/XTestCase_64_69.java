/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_64_69 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -507939372;

	/**
	 * The singleton instance of X_TEST_CASE_64_69
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_64_69.UNUSED_ID]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super("X_TEST_CASE_64_69", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_TEST_CASE_64_69;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_TEST_CASE_64_69);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.FK_X_TEST_CASE_64_69);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69(alias);
	}
}
