/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_64_69 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 1325597275;

	/**
	 * The singleton instance of dba.x_test_case_64_69
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT x_test_case_64_69__fk_x_test_case_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES dba.x_unused (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super("x_test_case_64_69", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69(alias);
	}
}
