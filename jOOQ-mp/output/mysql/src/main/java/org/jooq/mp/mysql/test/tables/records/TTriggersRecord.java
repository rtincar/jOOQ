
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.mysql.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.mysql.test.tables.TTriggers;
import org.jooq.mp.mysql.test.Test;
import org.jooq.mp.mysql.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class TTriggersRecord extends UpdatableRecordImpl<org.jooq.mp.mysql.test.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setIdGenerated(java.lang.Integer value) {
        setValue(org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS.ID_GENERATED, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Integer getIdGenerated() {
        return getValue(org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS.ID_GENERATED);
    }
//MP-MANAGED-UPDATABLE-ENDING
//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS.ID-test@
	/**
	 * mapping id setter
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS.ID, value);
	}
	
	/**
	 * mapping id getter
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS.ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS.COUNTER-test@
	/**
	 * mapping counter setter
	 */
	public void setCounter(java.lang.Integer value) {
		setValue(org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS.COUNTER, value);
	}
	
	/**
	 * mapping counter getter
	 */
	public java.lang.Integer getCounter() {
		return getValue(org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS.COUNTER);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.mp.mysql.test.tables.TTriggers.__T_TRIGGERS);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
