/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class PgType extends org.jooq.impl.TableImpl<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord> {

	private static final long serialVersionUID = -229075457;

	/**
	 * The singleton instance of pg_type
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgType PG_TYPE = new org.jooq.util.postgres.pg_catalog.tables.PgType();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord> __RECORD_TYPE = org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPNAME = createField("typname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Long> TYPNAMESPACE = createField("typnamespace", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Long> TYPOWNER = createField("typowner", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Short> TYPLEN = createField("typlen", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Boolean> TYPBYVAL = createField("typbyval", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPTYPE = createField("typtype", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPCATEGORY = createField("typcategory", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Boolean> TYPISPREFERRED = createField("typispreferred", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Boolean> TYPISDEFINED = createField("typisdefined", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPDELIM = createField("typdelim", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Long> TYPRELID = createField("typrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Long> TYPELEM = createField("typelem", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Long> TYPARRAY = createField("typarray", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPINPUT = createField("typinput", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPOUTPUT = createField("typoutput", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPRECEIVE = createField("typreceive", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPSEND = createField("typsend", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPMODIN = createField("typmodin", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPMODOUT = createField("typmodout", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPANALYZE = createField("typanalyze", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPALIGN = createField("typalign", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPSTORAGE = createField("typstorage", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Boolean> TYPNOTNULL = createField("typnotnull", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Long> TYPBASETYPE = createField("typbasetype", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Integer> TYPTYPMOD = createField("typtypmod", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.Integer> TYPNDIMS = createField("typndims", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPDEFAULTBIN = createField("typdefaultbin", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgTypeRecord, java.lang.String> TYPDEFAULT = createField("typdefault", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * No further instances allowed
	 */
	private PgType() {
		super("pg_type", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG);
	}

	/**
	 * No further instances allowed
	 */
	private PgType(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.pg_catalog.tables.PgType.PG_TYPE);
	}

	@Override
	public org.jooq.util.postgres.pg_catalog.tables.PgType as(java.lang.String alias) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgType(alias);
	}
}
