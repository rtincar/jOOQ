/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class SysidxRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord> {

	private static final long serialVersionUID = 1610092805;

	/**
	 * An uncommented item
	 */
	public void setTableId(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.TABLE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getTableId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.TABLE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setIndexId(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.INDEX_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getIndexId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.INDEX_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setObjectId(java.lang.Long value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.OBJECT_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getObjectId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.OBJECT_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setPhysIndexId(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.PHYS_INDEX_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPhysIndexId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.PHYS_INDEX_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setDbspaceId(java.lang.Short value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.DBSPACE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getDbspaceId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.DBSPACE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setIndexCategory(java.lang.Byte value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.INDEX_CATEGORY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getIndexCategory() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.INDEX_CATEGORY);
	}

	/**
	 * An uncommented item
	 */
	public void setUnique(java.lang.Byte value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.UNIQUE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getUnique() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.UNIQUE);
	}

	/**
	 * An uncommented item
	 */
	public void setIndexName(java.lang.String value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.INDEX_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getIndexName() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.INDEX_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setNotEnforced(java.lang.String value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.NOT_ENFORCED, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getNotEnforced() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.NOT_ENFORCED);
	}

	/**
	 * An uncommented item
	 */
	public void setFileId(java.lang.Short value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysidx.FILE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getFileId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysidx.FILE_ID);
	}

	/**
	 * Create a detached SysidxRecord
	 */
	public SysidxRecord() {
		super(org.jooq.util.sybase.sys.tables.Sysidx.SYSIDX);
	}
}
