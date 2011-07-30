/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Sysidx extends org.jooq.impl.TableImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord> {

	private static final long serialVersionUID = 100308795;

	/**
	 * The singleton instance of SYSIDX
	 */
	public static final org.jooq.util.sybase.sys.tables.Sysidx SYSIDX = new org.jooq.util.sybase.sys.tables.Sysidx();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.sybase.sys.tables.records.SysidxRecord> __RECORD_TYPE = org.jooq.util.sybase.sys.tables.records.SysidxRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.sybase.sys.tables.records.SysidxRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Integer> TABLE_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Integer>("table_id", org.jooq.impl.SQLDataType.INTEGER, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Integer> INDEX_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Integer>("index_id", org.jooq.impl.SQLDataType.INTEGER, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Long> OBJECT_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Long>("object_id", org.jooq.impl.SQLDataType.BIGINT, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Integer> PHYS_INDEX_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Integer>("phys_index_id", org.jooq.impl.SQLDataType.INTEGER, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Short> DBSPACE_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Short>("dbspace_id", org.jooq.impl.SQLDataType.SMALLINT, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Byte> INDEX_CATEGORY = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Byte>("index_category", org.jooq.impl.SQLDataType.TINYINT, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Byte> UNIQUE = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Byte>("unique", org.jooq.impl.SQLDataType.TINYINT, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.String> INDEX_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.String>("index_name", org.jooq.impl.SQLDataType.CHAR, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.String> NOT_ENFORCED = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.String>("not_enforced", org.jooq.impl.SQLDataType.CHAR, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Short> FILE_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Short>("file_id", org.jooq.impl.SQLDataType.SMALLINT, SYSIDX);

	/**
	 * No further instances allowed
	 */
	private Sysidx() {
		super("SYSIDX", org.jooq.util.sybase.sys.Sys.SYS);
	}
}