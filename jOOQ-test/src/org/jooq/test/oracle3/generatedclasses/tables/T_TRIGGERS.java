/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_TRIGGERS extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS> {

	private static final long serialVersionUID = 1363189316;

	/**
	 * The singleton instance of T_TRIGGERS
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS T_TRIGGERS = new org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS> __RECORD_TYPE = org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS, java.lang.Integer> ID_GENERATED = createField("ID_GENERATED", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS, java.lang.Integer> COUNTER = createField("COUNTER", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private T_TRIGGERS() {
		super("T_TRIGGERS", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T_TRIGGERS(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_TRIGGERS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_TRIGGERS);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS(alias);
	}
}
