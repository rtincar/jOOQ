/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class DbmsXplanTypeRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeRecord> {

	private static final long serialVersionUID = -323908679;


	/**
	 * An uncommented item
	 */
	public void setPlanTableOutput(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.udt.DbmsXplanType.PLAN_TABLE_OUTPUT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getPlanTableOutput() {
		return getValue(org.jooq.examples.oracle.sys.udt.DbmsXplanType.PLAN_TABLE_OUTPUT);
	}

	public DbmsXplanTypeRecord() {
		super(org.jooq.examples.oracle.sys.udt.DbmsXplanType.DBMS_XPLAN_TYPE);
	}
}