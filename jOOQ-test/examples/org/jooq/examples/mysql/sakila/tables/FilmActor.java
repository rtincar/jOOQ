/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class FilmActor extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> {

	private static final long serialVersionUID = 1795668552;

	/**
	 * The singleton instance of film_actor
	 */
	public static final org.jooq.examples.mysql.sakila.tables.FilmActor FILM_ACTOR = new org.jooq.examples.mysql.sakila.tables.FilmActor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film_actor.actor_id]
	 * REFERENCES actor [sakila.actor.actor_id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.lang.Short> ACTOR_ID = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.lang.Short>("actor_id", org.jooq.impl.SQLDataType.SMALLINT, FILM_ACTOR);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.film_actor.film_id]
	 * REFERENCES film [sakila.film.film_id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.lang.Short> FILM_ID = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.lang.Short>("film_id", org.jooq.impl.SQLDataType.SMALLINT, FILM_ACTOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.sql.Timestamp> LAST_UPDATE = new org.jooq.impl.TableFieldImpl<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.sql.Timestamp>("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, FILM_ACTOR);

	/**
	 * No further instances allowed
	 */
	private FilmActor() {
		super("film_actor", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_film_actor_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_film_actor_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.fk_film_actor_actor, org.jooq.examples.mysql.sakila.Keys.fk_film_actor_film);
	}
}