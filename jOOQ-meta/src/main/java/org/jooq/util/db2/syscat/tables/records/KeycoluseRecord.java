/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class KeycoluseRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.db2.syscat.tables.records.KeycoluseRecord> {

	private static final long serialVersionUID = 2023773812;

	/**
	 * An uncommented item
	 */
	public void setConstname(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Keycoluse.CONSTNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstname() {
		return getValue(org.jooq.util.db2.syscat.tables.Keycoluse.CONSTNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setTabschema(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Keycoluse.TABSCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTabschema() {
		return getValue(org.jooq.util.db2.syscat.tables.Keycoluse.TABSCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTabname(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Keycoluse.TABNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTabname() {
		return getValue(org.jooq.util.db2.syscat.tables.Keycoluse.TABNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColname(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Keycoluse.COLNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getColname() {
		return getValue(org.jooq.util.db2.syscat.tables.Keycoluse.COLNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setColseq(java.lang.Short value) {
		setValue(org.jooq.util.db2.syscat.tables.Keycoluse.COLSEQ, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getColseq() {
		return getValue(org.jooq.util.db2.syscat.tables.Keycoluse.COLSEQ);
	}

	/**
	 * Create a detached KeycoluseRecord
	 */
	public KeycoluseRecord() {
		super(org.jooq.util.db2.syscat.tables.Keycoluse.KEYCOLUSE);
	}
}
