/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Shift", schema = "HumanResources")
public class ShiftRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.ShiftRecord> {

	private static final long serialVersionUID = -730819422;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setShiftid(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.SHIFTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ShiftID", unique = true)
	public java.lang.Byte getShiftid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.SHIFTID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setStarttime(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.STARTTIME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StartTime")
	public java.sql.Timestamp getStarttime() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.STARTTIME);
	}

	/**
	 * An uncommented item
	 */
	public void setEndtime(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.ENDTIME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EndTime")
	public java.sql.Timestamp getEndtime() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.ENDTIME);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT.MODIFIEDDATE);
	}

	/**
	 * Create a detached ShiftRecord
	 */
	public ShiftRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Shift.SHIFT);
	}
}
