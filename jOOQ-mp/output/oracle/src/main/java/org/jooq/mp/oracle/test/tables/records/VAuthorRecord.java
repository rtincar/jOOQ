
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.oracle.test.tables.VAuthor;
import org.jooq.mp.oracle.test.Test;
import org.jooq.mp.oracle.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class VAuthorRecord extends UpdatableRecordImpl<org.jooq.mp.oracle.test.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = 123456789;

//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.ID-test@
	/**
	 * mapping ID setter
	 */
	public void setId(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.ID, value);
	}
	
	/**
	 * mapping ID getter
	 */
	public java.lang.Long getId() {
		return getValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.FIRST_NAME-test@
	/**
	 * mapping FIRST_NAME setter
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.FIRST_NAME, value);
	}
	
	/**
	 * mapping FIRST_NAME getter
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.FIRST_NAME);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.LAST_NAME-test@
	/**
	 * mapping LAST_NAME setter
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.LAST_NAME, value);
	}
	
	/**
	 * mapping LAST_NAME getter
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.LAST_NAME);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.DATE_OF_BIRTH-test@
	/**
	 * mapping DATE_OF_BIRTH setter
	 */
	public void setDateOfBirth(java.sql.Timestamp value) {
		setValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.DATE_OF_BIRTH, value);
	}
	
	/**
	 * mapping DATE_OF_BIRTH getter
	 */
	public java.sql.Timestamp getDateOfBirth() {
		return getValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.DATE_OF_BIRTH);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.YEAR_OF_BIRTH-test@
	/**
	 * mapping YEAR_OF_BIRTH setter
	 */
	public void setYearOfBirth(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.YEAR_OF_BIRTH, value);
	}
	
	/**
	 * mapping YEAR_OF_BIRTH getter
	 */
	public java.lang.Long getYearOfBirth() {
		return getValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.YEAR_OF_BIRTH);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.ADDRESS-test@
	/**
	 * mapping ADDRESS setter
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.ADDRESS, value);
	}
	
	/**
	 * mapping ADDRESS getter
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR.ADDRESS);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.mp.oracle.test.tables.VAuthor.__V_AUTHOR);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
