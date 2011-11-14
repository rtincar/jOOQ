/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PgEnum extends org.jooq.impl.TableImpl<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord> {

	private static final long serialVersionUID = 65138932;

	/**
	 * The singleton instance of pg_enum
	 */
	public static final org.jooq.util.postgres.pg_catalog.tables.PgEnum PG_ENUM = new org.jooq.util.postgres.pg_catalog.tables.PgEnum();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord> __RECORD_TYPE = org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord, java.lang.Long> ENUMTYPID = createField("enumtypid", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.pg_catalog.tables.records.PgEnumRecord, java.lang.String> ENUMLABEL = createField("enumlabel", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private PgEnum() {
		super("pg_enum", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG);
	}

	/**
	 * No further instances allowed
	 */
	private PgEnum(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.util.postgres.pg_catalog.tables.PgEnum.PG_ENUM);
	}

	@Override
	public org.jooq.util.postgres.pg_catalog.tables.PgEnum as(java.lang.String alias) {
		return new org.jooq.util.postgres.pg_catalog.tables.PgEnum(alias);
	}
}
