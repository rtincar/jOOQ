/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class ActorInfoRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord> {

	private static final long serialVersionUID = -424778646;

	/**
	 * An uncommented item
	 */
	public void setActorId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.ACTOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getActorId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.ACTOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setFilmInfo(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.FILM_INFO, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFilmInfo() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.FILM_INFO);
	}

	/**
	 * Create a detached ActorInfoRecord
	 */
	public ActorInfoRecord() {
		super(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO);
	}
}
