/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TTriggers extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = 1386538958;

	/**
	 * The singleton instance of t_triggers
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TTriggers T_TRIGGERS = new org.jooq.test.postgres.generatedclasses.tables.TTriggers();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord> __RECORD_TYPE = org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID_GENERATED = createField("id_generated", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private TTriggers() {
		super("t_triggers", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private TTriggers(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.postgres.generatedclasses.Keys.IDENTITY_t_triggers;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.pk_t_triggers;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.pk_t_triggers);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TTriggers as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TTriggers(alias);
	}
}
