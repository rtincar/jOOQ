
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.oracle.test.tables.T639NumbersTable;
import org.jooq.mp.oracle.test.Test;
import org.jooq.mp.oracle.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class T639NumbersTableRecord extends UpdatableRecordImpl<org.jooq.mp.oracle.test.tables.records.T639NumbersTableRecord> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Long value) {
        setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Long getId() {
        return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BYTE-test@
	/**
	 * mapping BYTE setter
	 */
	public void setByteName(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BYTE, value);
	}
	
	/**
	 * mapping BYTE getter
	 */
	public java.lang.Long getByteName() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BYTE);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.SHORT-test@
	/**
	 * mapping SHORT setter
	 */
	public void setShortName(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.SHORT, value);
	}
	
	/**
	 * mapping SHORT getter
	 */
	public java.lang.Long getShortName() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.SHORT);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.INTEGER-test@
	/**
	 * mapping INTEGER setter
	 */
	public void setInteger(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.INTEGER, value);
	}
	
	/**
	 * mapping INTEGER getter
	 */
	public java.lang.Long getInteger() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.INTEGER);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.LONG-test@
	/**
	 * mapping LONG setter
	 */
	public void setLongName(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.LONG, value);
	}
	
	/**
	 * mapping LONG getter
	 */
	public java.lang.Long getLongName() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.LONG);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BYTE_DECIMAL-test@
	/**
	 * mapping BYTE_DECIMAL setter
	 */
	public void setByteDecimal(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BYTE_DECIMAL, value);
	}
	
	/**
	 * mapping BYTE_DECIMAL getter
	 */
	public java.lang.Long getByteDecimal() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BYTE_DECIMAL);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.SHORT_DECIMAL-test@
	/**
	 * mapping SHORT_DECIMAL setter
	 */
	public void setShortDecimal(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.SHORT_DECIMAL, value);
	}
	
	/**
	 * mapping SHORT_DECIMAL getter
	 */
	public java.lang.Long getShortDecimal() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.SHORT_DECIMAL);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.INTEGER_DECIMAL-test@
	/**
	 * mapping INTEGER_DECIMAL setter
	 */
	public void setIntegerDecimal(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.INTEGER_DECIMAL, value);
	}
	
	/**
	 * mapping INTEGER_DECIMAL getter
	 */
	public java.lang.Long getIntegerDecimal() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.INTEGER_DECIMAL);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.LONG_DECIMAL-test@
	/**
	 * mapping LONG_DECIMAL setter
	 */
	public void setLongDecimal(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.LONG_DECIMAL, value);
	}
	
	/**
	 * mapping LONG_DECIMAL getter
	 */
	public java.lang.Long getLongDecimal() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.LONG_DECIMAL);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BIG_INTEGER-test@
	/**
	 * mapping BIG_INTEGER setter
	 */
	public void setBigInteger(java.lang.Integer value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BIG_INTEGER, value);
	}
	
	/**
	 * mapping BIG_INTEGER getter
	 */
	public java.lang.Integer getBigInteger() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BIG_INTEGER);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BIG_DECIMAL-test@
	/**
	 * mapping BIG_DECIMAL setter
	 */
	public void setBigDecimal(java.math.BigDecimal value) {
		setValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BIG_DECIMAL, value);
	}
	
	/**
	 * mapping BIG_DECIMAL getter
	 */
	public java.math.BigDecimal getBigDecimal() {
		return getValue(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE.BIG_DECIMAL);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached T639NumbersTableRecord
	 */
	public T639NumbersTableRecord() {
		super(org.jooq.mp.oracle.test.tables.T639NumbersTable.__T_639_NUMBERS_TABLE);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
