
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.hsqldb.test.tables.T725LobTest;
import org.jooq.mp.hsqldb.test.Test;
import org.jooq.mp.hsqldb.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class T725LobTestRecord extends UpdatableRecordImpl<org.jooq.mp.hsqldb.test.tables.records.T725LobTestRecord> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Integer value) {
        setValue(org.jooq.mp.hsqldb.test.tables.T725LobTest.__T_725_LOB_TEST.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Integer getId() {
        return getValue(org.jooq.mp.hsqldb.test.tables.T725LobTest.__T_725_LOB_TEST.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.T725LobTest.__T_725_LOB_TEST.LOB-test@
	/**
	 * mapping LOB setter
	 */
	public void setLob(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.T725LobTest.__T_725_LOB_TEST.LOB, value);
	}
	
	/**
	 * mapping LOB getter
	 */
	public java.lang.Integer getLob() {
		return getValue(org.jooq.mp.hsqldb.test.tables.T725LobTest.__T_725_LOB_TEST.LOB);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached T725LobTestRecord
	 */
	public T725LobTestRecord() {
		super(org.jooq.mp.hsqldb.test.tables.T725LobTest.__T_725_LOB_TEST);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
