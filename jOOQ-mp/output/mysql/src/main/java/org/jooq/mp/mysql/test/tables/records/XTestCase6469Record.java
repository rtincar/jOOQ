
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.mysql.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.mysql.test.tables.XTestCase6469;
import org.jooq.mp.mysql.test.Test;
import org.jooq.mp.mysql.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class XTestCase6469Record extends UpdatableRecordImpl<org.jooq.mp.mysql.test.tables.records.XTestCase6469Record> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Integer value) {
        setValue(org.jooq.mp.mysql.test.tables.XTestCase6469.__X_TEST_CASE_64_69.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Integer getId() {
        return getValue(org.jooq.mp.mysql.test.tables.XTestCase6469.__X_TEST_CASE_64_69.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
  //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-child-XTestCase71s-test@
	/**
	 * An uncommented item
	 * 
	 */
	public java.util.List<org.jooq.mp.mysql.test.tables.records.XTestCase71Record> fetchXTestCase71sList() {
		return create()
			.selectFrom(org.jooq.mp.mysql.test.tables.XTestCase71.__X_TEST_CASE_71)
			.where(org.jooq.mp.mysql.test.tables.XTestCase71.__X_TEST_CASE_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.mp.mysql.test.tables.XTestCase6469.__X_TEST_CASE_64_69.ID))) 
			.fetch();
	}
	
//MP-MANAGED-UPDATABLE-ENDING
//many2many


   //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-parent-org.jooq.mp.mysql.test.tables.XTestCase6469.__X_TEST_CASE_64_69.UNUSED_ID-test@
	/**
	 * setter and mapper in for unusedId
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XTestCase6469.unusedId]
	 * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.mp.mysql.test.tables.XTestCase6469.__X_TEST_CASE_64_69.UNUSED_ID, value);
	}
	

	/**
	 * getter and mapper out for unusedId
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XTestCase6469.unusedId]
	 * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.mp.mysql.test.tables.XTestCase6469.__X_TEST_CASE_64_69.UNUSED_ID);
	}
	

	/**
	 * fetcher of associated XUnused via UnusedId
	 * <p>
	 * <code><pre>
     * FOREIGN KEY [XTestCase6469.unusedId]
     * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public org.jooq.mp.mysql.test.tables.records.XUnusedRecord fetchUnusedId() {
		return create()
			.selectFrom(org.jooq.mp.mysql.test.tables.XUnused.__X_UNUSED)
			.where(org.jooq.mp.mysql.test.tables.XUnused.__X_UNUSED.ID.equal(getValue(org.jooq.mp.mysql.test.tables.XTestCase6469.__X_TEST_CASE_64_69.UNUSED_ID))) //ID
			.fetchOne();
    }
//MP-MANAGED-UPDATABLE-ENDING
	/**
	 * Create a detached XTestCase6469Record
	 */
	public XTestCase6469Record() {
		super(org.jooq.mp.mysql.test.tables.XTestCase6469.__X_TEST_CASE_64_69);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
