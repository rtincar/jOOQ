
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.hsqldb.test.tables.T65832;
import org.jooq.mp.hsqldb.test.Test;
import org.jooq.mp.hsqldb.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class T65832Record extends UpdatableRecordImpl<org.jooq.mp.hsqldb.test.tables.records.T65832Record> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Long value) {
        setValue(org.jooq.mp.hsqldb.test.tables.T65832.__T_658_32.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Long getId() {
        return getValue(org.jooq.mp.hsqldb.test.tables.T65832.__T_658_32.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
  //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-child-T658Refs-test@
	/**
	 * An uncommented item
	 * 
	 */
	public java.util.List<org.jooq.mp.hsqldb.test.tables.records.T658RefRecord> fetchT658RefsList() {
		return create()
			.selectFrom(org.jooq.mp.hsqldb.test.tables.T658Ref.__T_658_REF)
			.where(org.jooq.mp.hsqldb.test.tables.T658Ref.__T_658_REF.REF_32.equal(getValue(org.jooq.mp.hsqldb.test.tables.T65832.__T_658_32.ID))) 
			.fetch();
	}
	
//MP-MANAGED-UPDATABLE-ENDING
//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.T65832.__T_658_32.CD-test@
	/**
	 * mapping CD setter
	 */
	public void setCd(java.lang.Long value) {
		setValue(org.jooq.mp.hsqldb.test.tables.T65832.__T_658_32.CD, value);
	}
	
	/**
	 * mapping CD getter
	 */
	public java.lang.Long getCd() {
		return getValue(org.jooq.mp.hsqldb.test.tables.T65832.__T_658_32.CD);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached T65832Record
	 */
	public T65832Record() {
		super(org.jooq.mp.hsqldb.test.tables.T65832.__T_658_32);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
