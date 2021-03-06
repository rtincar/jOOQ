
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.derby.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.derby.test.tables.XTestCase85;
import org.jooq.mp.derby.test.Test;
import org.jooq.mp.derby.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class XTestCase85Record extends UpdatableRecordImpl<org.jooq.mp.derby.test.tables.records.XTestCase85Record> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Integer value) {
        setValue(org.jooq.mp.derby.test.tables.XTestCase85.__X_TEST_CASE_85.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Integer getId() {
        return getValue(org.jooq.mp.derby.test.tables.XTestCase85.__X_TEST_CASE_85.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
//many2many


   //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-parent-org.jooq.mp.derby.test.tables.XTestCase85.__X_TEST_CASE_85.X_UNUSED_ID-test@
	/**
	 * setter and mapper in for XUnusedId
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XTestCase85.XUnusedId]
	 * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.mp.derby.test.tables.XTestCase85.__X_TEST_CASE_85.X_UNUSED_ID, value);
	}
	

	/**
	 * getter and mapper out for XUnusedId
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XTestCase85.XUnusedId]
	 * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.mp.derby.test.tables.XTestCase85.__X_TEST_CASE_85.X_UNUSED_ID);
	}
	

	/**
	 * fetcher of associated XUnused via XUnusedId
	 * <p>
	 * <code><pre>
     * FOREIGN KEY [XTestCase85.XUnusedId]
     * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public org.jooq.mp.derby.test.tables.records.XUnusedRecord fetchXUnusedId() {
		return create()
			.selectFrom(org.jooq.mp.derby.test.tables.XUnused.__X_UNUSED)
			.where(org.jooq.mp.derby.test.tables.XUnused.__X_UNUSED.ID.equal(getValue(org.jooq.mp.derby.test.tables.XTestCase85.__X_TEST_CASE_85.X_UNUSED_ID))) //ID
			.fetchOne();
    }
//MP-MANAGED-UPDATABLE-ENDING
	/**
	 * Create a detached XTestCase85Record
	 */
	public XTestCase85Record() {
		super(org.jooq.mp.derby.test.tables.XTestCase85.__X_TEST_CASE_85);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
