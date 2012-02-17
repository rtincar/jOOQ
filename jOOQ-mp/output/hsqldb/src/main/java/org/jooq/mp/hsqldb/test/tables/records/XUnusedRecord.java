
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.hsqldb.test.tables.XUnused;
import org.jooq.mp.hsqldb.test.Test;
import org.jooq.mp.hsqldb.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class XUnusedRecord extends UpdatableRecordImpl<org.jooq.mp.hsqldb.test.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Integer value) {
        setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Integer getId() {
        return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setName(java.lang.String value) {
        setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.NAME, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.String getName() {
        return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.NAME);
    }
//MP-MANAGED-UPDATABLE-ENDING
  //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-child-XTestCase6469s-test@
	/**
	 * An uncommented item
	 * 
	 */
	public java.util.List<org.jooq.mp.hsqldb.test.tables.records.XTestCase6469Record> fetchXTestCase6469sList() {
		return create()
			.selectFrom(org.jooq.mp.hsqldb.test.tables.XTestCase6469.__X_TEST_CASE_64_69)
			.where(org.jooq.mp.hsqldb.test.tables.XTestCase6469.__X_TEST_CASE_64_69.UNUSED_ID.equal(getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID))) 
			.fetch();
	}
	
//MP-MANAGED-UPDATABLE-ENDING
  //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-child-XTestCase85s-test@
	/**
	 * An uncommented item
	 * 
	 */
	public java.util.List<org.jooq.mp.hsqldb.test.tables.records.XTestCase85Record> fetchXTestCase85sList() {
		return create()
			.selectFrom(org.jooq.mp.hsqldb.test.tables.XTestCase85.__X_TEST_CASE_85)
			.where(org.jooq.mp.hsqldb.test.tables.XTestCase85.__X_TEST_CASE_85.X_UNUSED_ID.equal(getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID))) 
			.fetch();
	}
	
//MP-MANAGED-UPDATABLE-ENDING
  //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-child-XUnuseds-test@
	/**
	 * An uncommented item
	 * 
	 */
	public java.util.List<org.jooq.mp.hsqldb.test.tables.records.XUnusedRecord> fetchXUnusedsList() {
		return create()
			.selectFrom(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED)
			.where(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID_REF.equal(getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID))) 
			.fetch();
	}
	
//MP-MANAGED-UPDATABLE-ENDING
//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.BIG_INTEGER-test@
	/**
	 * mapping BIG_INTEGER setter
	 */
	public void setBigInteger(java.lang.Long value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.BIG_INTEGER, value);
	}
	
	/**
	 * mapping BIG_INTEGER getter
	 */
	public java.lang.Long getBigInteger() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.BIG_INTEGER);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.CLASS-test@
	/**
	 * mapping CLASS setter
	 */
	public void setClassName(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.CLASS, value);
	}
	
	/**
	 * mapping CLASS getter
	 */
	public java.lang.Integer getClassName() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.CLASS);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.FIELDS-test@
	/**
	 * mapping FIELDS setter
	 */
	public void setFields_(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.FIELDS, value);
	}
	
	/**
	 * mapping FIELDS getter
	 */
	public java.lang.Integer getFields_() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.FIELDS);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.CONFIGURATION-test@
	/**
	 * mapping CONFIGURATION setter
	 */
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.CONFIGURATION, value);
	}
	
	/**
	 * mapping CONFIGURATION getter
	 */
	public java.lang.Integer getConfiguration_() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.CONFIGURATION);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.U_D_T-test@
	/**
	 * mapping U_D_T setter
	 */
	public void setUDT(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.U_D_T, value);
	}
	
	/**
	 * mapping U_D_T getter
	 */
	public java.lang.Integer getUDT() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.U_D_T);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.META_DATA-test@
	/**
	 * mapping META_DATA setter
	 */
	public void setMetaData(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.META_DATA, value);
	}
	
	/**
	 * mapping META_DATA getter
	 */
	public java.lang.Integer getMetaData() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.META_DATA);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.TYPE0-test@
	/**
	 * mapping TYPE0 setter
	 */
	public void setType0(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.TYPE0, value);
	}
	
	/**
	 * mapping TYPE0 getter
	 */
	public java.lang.Integer getType0() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.TYPE0);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.PRIMARY_KEY-test@
	/**
	 * mapping PRIMARY_KEY setter
	 */
	public void setPrimaryKey(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.PRIMARY_KEY, value);
	}
	
	/**
	 * mapping PRIMARY_KEY getter
	 */
	public java.lang.Integer getPrimaryKey() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.PRIMARY_KEY);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.PRIMARYKEY-test@
	/**
	 * mapping PRIMARYKEY setter
	 */
	public void setPrimarykey(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.PRIMARYKEY, value);
	}
	
	/**
	 * mapping PRIMARYKEY getter
	 */
	public java.lang.Integer getPrimarykey() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.PRIMARYKEY);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.FIELD_737-test@
	/**
	 * mapping FIELD 737 setter
	 */
	public void setField737(java.math.BigDecimal value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.FIELD_737, value);
	}
	
	/**
	 * mapping FIELD 737 getter
	 */
	public java.math.BigDecimal getField737() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.FIELD_737);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

   //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-parent-org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID_REF-test@
	/**
	 * setter and mapper in for idRef
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XUnused.idRef]
	 * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public void setIdRef(java.lang.Integer value) {
		setValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID_REF, value);
	}
	

	/**
	 * getter and mapper out for idRef
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [XUnused.idRef]
	 * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public java.lang.Integer getIdRef() {
		return getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID_REF);
	}
	

	/**
	 * fetcher of associated XUnused via IdRef
	 * <p>
	 * <code><pre>
     * FOREIGN KEY [XUnused.idRef]
     * REFERENCES XUnused [XUnused.id]
	 * </pre></code>
	 */
	public org.jooq.mp.hsqldb.test.tables.records.XUnusedRecord fetchIdRef() {
		return create()
			.selectFrom(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED)
			.where(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID.equal(getValue(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED.ID_REF))) //ID
			.fetchOne();
    }
//MP-MANAGED-UPDATABLE-ENDING
	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(org.jooq.mp.hsqldb.test.tables.XUnused.__X_UNUSED);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
