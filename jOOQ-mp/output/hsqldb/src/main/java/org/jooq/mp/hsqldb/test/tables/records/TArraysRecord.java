
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.hsqldb.test.tables.TArrays;
import org.jooq.mp.hsqldb.test.Test;
import org.jooq.mp.hsqldb.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class TArraysRecord extends UpdatableRecordImpl<org.jooq.mp.hsqldb.test.tables.records.TArraysRecord> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Integer value) {
        setValue(org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Integer getId() {
        return getValue(org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.STRING_ARRAY-test@
	/**
	 * mapping STRING_ARRAY setter
	 */
	public void setStringArray(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.STRING_ARRAY, value);
	}
	
	/**
	 * mapping STRING_ARRAY getter
	 */
	public java.lang.Integer getStringArray() {
		return getValue(org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.STRING_ARRAY);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.NUMBER_ARRAY-test@
	/**
	 * mapping NUMBER_ARRAY setter
	 */
	public void setNumberArray(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.NUMBER_ARRAY, value);
	}
	
	/**
	 * mapping NUMBER_ARRAY getter
	 */
	public java.lang.Integer getNumberArray() {
		return getValue(org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.NUMBER_ARRAY);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.DATE_ARRAY-test@
	/**
	 * mapping DATE_ARRAY setter
	 */
	public void setDateArray(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.DATE_ARRAY, value);
	}
	
	/**
	 * mapping DATE_ARRAY getter
	 */
	public java.lang.Integer getDateArray() {
		return getValue(org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS.DATE_ARRAY);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.mp.hsqldb.test.tables.TArrays.__T_ARRAYS);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
