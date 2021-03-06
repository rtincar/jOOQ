/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class Sysconglomerates extends org.jooq.impl.TableImpl<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord> {

	private static final long serialVersionUID = 153972552;

	/**
	 * The singleton instance of SYSCONGLOMERATES
	 */
	public static final org.jooq.util.derby.sys.tables.Sysconglomerates SYSCONGLOMERATES = new org.jooq.util.derby.sys.tables.Sysconglomerates();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord> __RECORD_TYPE = org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord, java.lang.String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord, java.lang.String> TABLEID = createField("TABLEID", org.jooq.impl.SQLDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord, java.lang.Long> CONGLOMERATENUMBER = createField("CONGLOMERATENUMBER", org.jooq.impl.SQLDataType.BIGINT, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord, java.lang.String> CONGLOMERATENAME = createField("CONGLOMERATENAME", org.jooq.impl.SQLDataType.VARCHAR, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord, java.lang.Boolean> ISINDEX = createField("ISINDEX", org.jooq.impl.SQLDataType.BOOLEAN, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord, java.lang.String> DESCRIPTOR = createField("DESCRIPTOR", org.jooq.impl.SQLDataType.CLOB, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord, java.lang.Boolean> ISCONSTRAINT = createField("ISCONSTRAINT", org.jooq.impl.SQLDataType.BOOLEAN, SYSCONGLOMERATES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord, java.lang.String> CONGLOMERATEID = createField("CONGLOMERATEID", org.jooq.impl.SQLDataType.CHAR, SYSCONGLOMERATES);

	/**
	 * No further instances allowed
	 */
	private Sysconglomerates() {
		super("SYSCONGLOMERATES", org.jooq.util.derby.sys.Sys.SYS);
	}
}
