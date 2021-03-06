/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
public class FilmText extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> {

	private static final long serialVersionUID = -1655032286;

	/**
	 * The singleton instance of sakila.film_text
	 */
	public static final org.jooq.examples.mysql.sakila.tables.FilmText FILM_TEXT = new org.jooq.examples.mysql.sakila.tables.FilmText();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * No further instances allowed
	 */
	private FilmText() {
		super("film_text", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * No further instances allowed
	 */
	private FilmText(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_FILM_TEXT_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_TEXT_PRIMARY);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.FilmText as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.FilmText(alias);
	}
}
