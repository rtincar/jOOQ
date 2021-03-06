/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class Syscolumns extends org.jooq.impl.TableImpl<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord> {

	private static final long serialVersionUID = 236864795;

	/**
	 * The singleton instance of SYSCOLUMNS
	 */
	public static final org.jooq.util.derby.sys.tables.Syscolumns SYSCOLUMNS = new org.jooq.util.derby.sys.tables.Syscolumns();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord> __RECORD_TYPE = org.jooq.util.derby.sys.tables.records.SyscolumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord, java.lang.String> REFERENCEID = createField("REFERENCEID", org.jooq.impl.SQLDataType.CHAR, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord, java.lang.String> COLUMNNAME = createField("COLUMNNAME", org.jooq.impl.SQLDataType.VARCHAR, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord, java.lang.Integer> COLUMNNUMBER = createField("COLUMNNUMBER", org.jooq.impl.SQLDataType.INTEGER, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord, java.lang.String> COLUMNDATATYPE = createField("COLUMNDATATYPE", org.jooq.impl.SQLDataType.CLOB, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord, java.lang.String> COLUMNDEFAULT = createField("COLUMNDEFAULT", org.jooq.impl.SQLDataType.CLOB, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord, java.lang.String> COLUMNDEFAULTID = createField("COLUMNDEFAULTID", org.jooq.impl.SQLDataType.CHAR, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord, java.lang.Long> AUTOINCREMENTVALUE = createField("AUTOINCREMENTVALUE", org.jooq.impl.SQLDataType.BIGINT, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord, java.lang.Long> AUTOINCREMENTSTART = createField("AUTOINCREMENTSTART", org.jooq.impl.SQLDataType.BIGINT, SYSCOLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SyscolumnsRecord, java.lang.Long> AUTOINCREMENTINC = createField("AUTOINCREMENTINC", org.jooq.impl.SQLDataType.BIGINT, SYSCOLUMNS);

	/**
	 * No further instances allowed
	 */
	private Syscolumns() {
		super("SYSCOLUMNS", org.jooq.util.derby.sys.Sys.SYS);
	}
}
