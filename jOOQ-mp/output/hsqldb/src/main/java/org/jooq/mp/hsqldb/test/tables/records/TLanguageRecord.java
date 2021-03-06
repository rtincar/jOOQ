
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.hsqldb.test.tables.TLanguage;
import org.jooq.mp.hsqldb.test.Test;
import org.jooq.mp.hsqldb.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class TLanguageRecord extends UpdatableRecordImpl<org.jooq.mp.hsqldb.test.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 123456789;

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-pk-test@
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public void setId(java.lang.Integer value) {
        setValue(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.ID, value);
    }
	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
    public java.lang.Integer getId() {
        return getValue(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.ID);
    }
//MP-MANAGED-UPDATABLE-ENDING
  //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-child-TBooks-test@
	/**
	 * An uncommented item
	 * 
	 */
	public java.util.List<org.jooq.mp.hsqldb.test.tables.records.TBookRecord> fetchTBooksList() {
		return create()
			.selectFrom(org.jooq.mp.hsqldb.test.tables.TBook.__T_BOOK)
			.where(org.jooq.mp.hsqldb.test.tables.TBook.__T_BOOK.LANGUAGE_ID.equal(getValue(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.ID))) 
			.fetch();
	}
	
//MP-MANAGED-UPDATABLE-ENDING
//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.CD-test@
	/**
	 * mapping CD setter
	 */
	public void setCd(java.lang.String value) {
		setValue(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.CD, value);
	}
	
	/**
	 * mapping CD getter
	 */
	public java.lang.String getCd() {
		return getValue(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.CD);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.DESCRIPTION-test@
	/**
	 * mapping DESCRIPTION setter
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.DESCRIPTION, value);
	}
	
	/**
	 * mapping DESCRIPTION getter
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.DESCRIPTION);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.DESCRIPTION_ENGLISH-test@
	/**
	 * mapping DESCRIPTION_ENGLISH setter
	 */
	public void setDescriptionEnglish(java.lang.String value) {
		setValue(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.DESCRIPTION_ENGLISH, value);
	}
	
	/**
	 * mapping DESCRIPTION_ENGLISH getter
	 */
	public java.lang.String getDescriptionEnglish() {
		return getValue(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE.DESCRIPTION_ENGLISH);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached TLanguageRecord
	 */
	public TLanguageRecord() {
		super(org.jooq.mp.hsqldb.test.tables.TLanguage.__T_LANGUAGE);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
