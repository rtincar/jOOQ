/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = -1076493472;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setStringArray(java.lang.String[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.STRING_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String[] getStringArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.STRING_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNumberArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.NUMBER_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer[] getNumberArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.NUMBER_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setDateArray(java.sql.Date[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.DATE_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date[] getDateArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.DATE_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setUdtArray(org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.UDT_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] getUdtArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.UDT_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setEnumArray(org.jooq.test.postgres.generatedclasses.enums.UCountry[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.ENUM_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.postgres.generatedclasses.enums.UCountry[] getEnumArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.ENUM_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setArrayArray(java.lang.Integer[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.ARRAY_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer[] getArrayArray() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TArrays.ARRAY_ARRAY);
	}

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS);
	}
}
