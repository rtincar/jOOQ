/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class XTestCase_64_69 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -18726556;

	/**
	 * The singleton instance of x_test_case_64_69
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> __RECORD_TYPE = org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.x_test_case_64_69.unused_id]
	 * REFERENCES x_unused [public.x_unused.id]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("unused_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super("x_test_case_64_69", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.pk_x_test_case_64_69;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.postgres.generatedclasses.Keys.pk_x_test_case_64_69);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.x_test_case_64_69__fk_x_test_case_64_69);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69(alias);
	}
}
