
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.derby.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.derby.test.tables.T65821;
import org.jooq.mp.derby.test.Test;
import org.jooq.mp.derby.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class T65821Record extends UpdatableRecordImpl<org.jooq.mp.derby.test.tables.records.T65821Record> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Integer value) {
        setValue(org.jooq.mp.derby.test.tables.T65821.__T_658_21.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Integer getId() {
        return getValue(org.jooq.mp.derby.test.tables.T65821.__T_658_21.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
  //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-child-T658Refs-test@
	/**
	 * An uncommented item
	 * 
	 */
	public java.util.List<org.jooq.mp.derby.test.tables.records.T658RefRecord> fetchT658RefsList() {
		return create()
			.selectFrom(org.jooq.mp.derby.test.tables.T658Ref.__T_658_REF)
			.where(org.jooq.mp.derby.test.tables.T658Ref.__T_658_REF.REF_21.equal(getValue(org.jooq.mp.derby.test.tables.T65821.__T_658_21.ID))) 
			.fetch();
	}
	
//MP-MANAGED-UPDATABLE-ENDING
//many2many


	/**
	 * Create a detached T65821Record
	 */
	public T65821Record() {
		super(org.jooq.mp.derby.test.tables.T65821.__T_658_21);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
