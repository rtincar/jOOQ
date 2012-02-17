
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.oracle.test.tables.XTestCase71;
import org.jooq.mp.oracle.test.Test;
import org.jooq.mp.oracle.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class XTestCase71Record extends UpdatableRecordImpl<org.jooq.mp.oracle.test.tables.records.XTestCase71Record> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Long value) {
        setValue(org.jooq.mp.oracle.test.tables.XTestCase71.__X_TEST_CASE_71.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Long getId() {
        return getValue(org.jooq.mp.oracle.test.tables.XTestCase71.__X_TEST_CASE_71.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
//many2many


   //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-parent-org.jooq.mp.oracle.test.tables.XTestCase71.__X_TEST_CASE_71.TEST_CASE_64_69_ID-test@
	/**
	 * setter and mapper in for testCase6469Id
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XTestCase71.testCase6469Id]
	 * REFERENCES XTestCase6469 [XTestCase6469.id]
	 * </pre></code>
	 */
	public void setTestCase6469Id(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.XTestCase71.__X_TEST_CASE_71.TEST_CASE_64_69_ID, value);
	}
	

	/**
	 * getter and mapper out for testCase6469Id
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XTestCase71.testCase6469Id]
	 * REFERENCES XTestCase6469 [XTestCase6469.id]
	 * </pre></code>
	 */
	public java.lang.Long getTestCase6469Id() {
		return getValue(org.jooq.mp.oracle.test.tables.XTestCase71.__X_TEST_CASE_71.TEST_CASE_64_69_ID);
	}
	

	/**
	 * fetcher of associated XTestCase6469 via TestCase6469Id
	 * <p>
	 * <code><pre>
     * FOREIGN KEY [XTestCase71.testCase6469Id]
     * REFERENCES XTestCase6469 [XTestCase6469.id]
	 * </pre></code>
	 */
	public org.jooq.mp.oracle.test.tables.records.XTestCase6469Record fetchTestCase6469Id() {
		return create()
			.selectFrom(org.jooq.mp.oracle.test.tables.XTestCase6469.__X_TEST_CASE_64_69)
			.where(org.jooq.mp.oracle.test.tables.XTestCase6469.__X_TEST_CASE_64_69.ID.equal(getValue(org.jooq.mp.oracle.test.tables.XTestCase71.__X_TEST_CASE_71.TEST_CASE_64_69_ID))) //ID
			.fetchOne();
    }
//MP-MANAGED-UPDATABLE-ENDING
	/**
	 * Create a detached XTestCase71Record
	 */
	public XTestCase71Record() {
		super(org.jooq.mp.oracle.test.tables.XTestCase71.__X_TEST_CASE_71);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
