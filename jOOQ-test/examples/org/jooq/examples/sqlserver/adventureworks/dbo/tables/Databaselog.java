/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.tables;

/**
 * This class is generated by jOOQ.
 */
public class Databaselog extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord> {

	private static final long serialVersionUID = 706521811;

	/**
	 * The singleton instance of dbo.DatabaseLog
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog DATABASELOG = new org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.lang.Integer> DATABASELOGID = createField("DatabaseLogID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.sql.Timestamp> POSTTIME = createField("PostTime", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.lang.String> DATABASEUSER = createField("DatabaseUser", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.lang.String> EVENT = createField("Event", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.lang.String> SCHEMA = createField("Schema", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.lang.String> OBJECT = createField("Object", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.lang.String> TSQL = createField("TSQL", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.lang.Object> XMLEVENT = createField("XmlEvent", org.jooq.util.sqlserver.SQLServerDataType.getDefaultDataType("xml"), this);

	/**
	 * No further instances allowed
	 */
	private Databaselog() {
		super("DatabaseLog", org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO);
	}

	/**
	 * No further instances allowed
	 */
	private Databaselog(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO, org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog.DATABASELOG);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.IDENTITY_DATABASELOG;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_DATABASELOG_DATABASELOGID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord>>asList(org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_DATABASELOG_DATABASELOGID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog(alias);
	}
}
