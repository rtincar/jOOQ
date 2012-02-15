/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class Sysprocparm extends org.jooq.impl.TableImpl<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord> {

	private static final long serialVersionUID = 1417863293;

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
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Integer> PROC_ID = createField("proc_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> PARM_ID = createField("parm_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> PARM_TYPE = createField("parm_type", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> PARM_MODE_IN = createField("parm_mode_in", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> PARM_MODE_OUT = createField("parm_mode_out", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Long> WIDTH = createField("width", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> SCALE = createField("scale", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.Short> USER_TYPE = createField("user_type", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> PARM_NAME = createField("parm_name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> DEFAULT = createField("default", org.jooq.impl.SQLDataType.LONGVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.LONGVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysprocparmRecord, java.lang.String> BASE_TYPE_STR = createField("base_type_str", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private Sysprocparm() {
		super("SYSPROCPARM", org.jooq.util.sybase.sys.Sys.SYS);
	}

	/**
	 * No further instances allowed
	 */
	private Sysprocparm(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Sysprocparm.SYSPROCPARM);
	}

	@Override
	public org.jooq.util.sybase.sys.tables.Sysprocparm as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Sysprocparm(alias);
	}
}
