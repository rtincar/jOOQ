/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class SysidxcolRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.sybase.sys.tables.records.SysidxcolRecord> {

	private static final long serialVersionUID = -1068136308;

	/**
	 * An uncommented item
	 */
	public void setTableId(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.TABLE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getTableId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.TABLE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setIndexId(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.INDEX_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getIndexId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.INDEX_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setSequence(java.lang.Short value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.SEQUENCE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getSequence() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.SEQUENCE);
	}

	/**
	 * An uncommented item
	 */
	public void setColumnId(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.COLUMN_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getColumnId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.COLUMN_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setOrder(java.lang.String value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.ORDER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getOrder() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.ORDER);
	}

	/**
	 * An uncommented item
	 */
	public void setPrimaryColumnId(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.PRIMARY_COLUMN_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPrimaryColumnId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL.PRIMARY_COLUMN_ID);
	}

	/**
	 * Create a detached SysidxcolRecord
	 */
	public SysidxcolRecord() {
		super(org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL);
	}
}
