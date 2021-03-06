/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class X_TEST_CASE_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> {

	private static final long serialVersionUID = 1375158550;

	/**
	 * The singleton instance of TEST.X_TEST_CASE_71
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71 X_TEST_CASE_71 = new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> __RECORD_TYPE = org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES TEST.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, java.lang.Short> TEST_CASE_64_69_ID = createField("TEST_CASE_64_69_ID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * No further instances allowed
	 */
	private X_TEST_CASE_71() {
		super("X_TEST_CASE_71", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private X_TEST_CASE_71(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_71;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_71);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_X_TEST_CASE_71);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71 as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71(alias);
	}
}
