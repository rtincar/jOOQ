/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
public class Film extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> {

	private static final long serialVersionUID = -1980175031;

	/**
	 * The singleton instance of sakila.film
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Film FILM = new org.jooq.examples.mysql.sakila.tables.Film();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.FilmRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.sql.Date> RELEASE_YEAR = createField("release_year", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_language
	 * FOREIGN KEY (language_id)
	 * REFERENCES sakila.language (language_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Byte> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_language_original
	 * FOREIGN KEY (original_language_id)
	 * REFERENCES sakila.language (language_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Byte> ORIGINAL_LANGUAGE_ID = createField("original_language_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Byte> RENTAL_DURATION = createField("rental_duration", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.math.BigDecimal> RENTAL_RATE = createField("rental_rate", org.jooq.impl.SQLDataType.DECIMAL, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Short> LENGTH = createField("length", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.math.BigDecimal> REPLACEMENT_COST = createField("replacement_cost", org.jooq.impl.SQLDataType.DECIMAL, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, org.jooq.examples.mysql.sakila.enums.FilmRating> RATING = createField("rating", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.examples.mysql.sakila.enums.FilmRating.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.String> SPECIAL_FEATURES = createField("special_features", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Film() {
		super("film", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * No further instances allowed
	 */
	private Film(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Film.FILM);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_FILM;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_FILM_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_FILM_LANGUAGE, org.jooq.examples.mysql.sakila.Keys.FK_FILM_LANGUAGE_ORIGINAL);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Film as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Film(alias);
	}
}
