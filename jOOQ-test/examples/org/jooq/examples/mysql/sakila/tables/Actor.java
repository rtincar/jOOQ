/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Actor extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> {

	private static final long serialVersionUID = 1724330580;

	/**
	 * The singleton instance of actor
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Actor ACTOR = new org.jooq.examples.mysql.sakila.tables.Actor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.ActorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.Short> ACTOR_ID = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.Short>("actor_id", org.jooq.impl.SQLDataType.SMALLINT, ACTOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.String> FIRST_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.String>("first_name", org.jooq.impl.SQLDataType.VARCHAR, ACTOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.String> LAST_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.String>("last_name", org.jooq.impl.SQLDataType.VARCHAR, ACTOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.sql.Timestamp> LAST_UPDATE = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.sql.Timestamp>("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, ACTOR);

	/**
	 * No further instances allowed
	 */
	private Actor() {
		super("actor", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_actor;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_actor_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.ActorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.ActorRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_actor_PRIMARY);
	}
}