/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Sysprocparm extends org.jooq.impl.TableImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord> {

	private static final long serialVersionUID = 1100134786;

	/**
	 * The singleton instance of SYSPROCPARM
	 */
	public static final org.jooq.util.sybase.sys.tables.Sysprocparm SYSPROCPARM = new org.jooq.util.sybase.sys.tables.Sysprocparm();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord> __RECORD_TYPE = org.jooq.util.sybase.sys.tables.records.SysprocparmRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Integer> PROC_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Integer>("proc_id", org.jooq.impl.SQLDataType.INTEGER, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> PARM_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short>("parm_id", org.jooq.impl.SQLDataType.SMALLINT, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> PARM_TYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short>("parm_type", org.jooq.impl.SQLDataType.SMALLINT, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> PARM_MODE_IN = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String>("parm_mode_in", org.jooq.impl.SQLDataType.CHAR, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> PARM_MODE_OUT = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String>("parm_mode_out", org.jooq.impl.SQLDataType.CHAR, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> DOMAIN_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short>("domain_id", org.jooq.impl.SQLDataType.SMALLINT, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Long> WIDTH = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Long>("width", org.jooq.impl.SQLDataType.BIGINT, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> SCALE = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short>("scale", org.jooq.impl.SQLDataType.SMALLINT, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> USER_TYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short>("user_type", org.jooq.impl.SQLDataType.SMALLINT, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> PARM_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String>("parm_name", org.jooq.impl.SQLDataType.CHAR, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> DEFAULT = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String>("default", org.jooq.impl.SQLDataType.LONGVARCHAR, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> REMARKS = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String>("remarks", org.jooq.impl.SQLDataType.LONGVARCHAR, SYSPROCPARM);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> BASE_TYPE_STR = new org.jooq.impl.TableFieldImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String>("base_type_str", org.jooq.impl.SQLDataType.VARCHAR, SYSPROCPARM);

	/**
	 * No further instances allowed
	 */
	private Sysprocparm() {
		super("SYSPROCPARM", org.jooq.util.sybase.sys.Sys.SYS);
	}
}