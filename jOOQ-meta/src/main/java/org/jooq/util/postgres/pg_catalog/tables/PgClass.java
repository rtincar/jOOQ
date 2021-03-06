/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class PgClass extends org.jooq.impl.TableImpl<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord> {

	private static final long serialVersionUID = 684490387;

	/**
	 * The singleton instance of pg_class
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgClass PG_CLASS = new org.jooq.util.postgres.pg_catalog.tables.PgClass();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord> __RECORD_TYPE = org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.String> RELNAME = createField("relname", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELNAMESPACE = createField("relnamespace", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELTYPE = createField("reltype", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELOFTYPE = createField("reloftype", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELOWNER = createField("relowner", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELAM = createField("relam", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELFILENODE = createField("relfilenode", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELTABLESPACE = createField("reltablespace", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Integer> RELPAGES = createField("relpages", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Float> RELTUPLES = createField("reltuples", org.jooq.impl.SQLDataType.REAL, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELTOASTRELID = createField("reltoastrelid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELTOASTIDXID = createField("reltoastidxid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASINDEX = createField("relhasindex", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELISSHARED = createField("relisshared", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELISTEMP = createField("relistemp", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.String> RELKIND = createField("relkind", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Short> RELNATTS = createField("relnatts", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Short> RELCHECKS = createField("relchecks", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASOIDS = createField("relhasoids", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASPKEY = createField("relhaspkey", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASEXCLUSION = createField("relhasexclusion", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASRULES = createField("relhasrules", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASTRIGGERS = createField("relhastriggers", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Boolean> RELHASSUBCLASS = createField("relhassubclass", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.Long> RELFROZENXID = createField("relfrozenxid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.String[]> RELACL = createField("relacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgClassRecord, java.lang.String[]> RELOPTIONS = createField("reloptions", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this);

	/**
	 * No further instances allowed
	 */
	private PgClass() {
		super("pg_class", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG);
	}

	/**
	 * No further instances allowed
	 */
	private PgClass(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.pg_catalog.tables.PgClass.PG_CLASS);
	}

	@Override
	public org.jooq.util.postgres.pg_catalog.tables.PgClass as(java.lang.String alias) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgClass(alias);
	}
}
