/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sqlserver.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class KeyColumnUsage extends org.jooq.impl.TableImpl<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord> {

	private static final long serialVersionUID = -1688829570;

	/**
	 * The singleton instance of KEY_COLUMN_USAGE
	 */
	public static final org.jooq.util.sqlserver.information_schema.tables.KeyColumnUsage KEY_COLUMN_USAGE = new org.jooq.util.sqlserver.information_schema.tables.KeyColumnUsage();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord> __RECORD_TYPE = org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord, java.lang.Long> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.KeyColumnUsageRecord, java.lang.Long> POSITION_IN_UNIQUE_CONSTRAINT = createField("POSITION_IN_UNIQUE_CONSTRAINT", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * No further instances allowed
	 */
	private KeyColumnUsage() {
		super("KEY_COLUMN_USAGE", org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * No further instances allowed
	 */
	private KeyColumnUsage(java.lang.String alias) {
		super(alias, org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.sqlserver.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE);
	}

	@Override
	public org.jooq.util.sqlserver.information_schema.tables.KeyColumnUsage as(java.lang.String alias) {
		return new org.jooq.util.sqlserver.information_schema.tables.KeyColumnUsage(alias);
	}
}
