
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.oracle.test.tables.VBook;
import org.jooq.mp.oracle.test.Test;
import org.jooq.mp.oracle.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class VBookRecord extends UpdatableRecordImpl<org.jooq.mp.oracle.test.tables.records.VBookRecord> {

	private static final long serialVersionUID = 123456789;

//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.ID-test@
	/**
	 * mapping ID setter
	 */
	public void setId(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.ID, value);
	}
	
	/**
	 * mapping ID getter
	 */
	public java.lang.Long getId() {
		return getValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.AUTHOR_ID-test@
	/**
	 * mapping AUTHOR_ID setter
	 */
	public void setAuthorId(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.AUTHOR_ID, value);
	}
	
	/**
	 * mapping AUTHOR_ID getter
	 */
	public java.lang.Long getAuthorId() {
		return getValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.AUTHOR_ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.CO_AUTHOR_ID-test@
	/**
	 * mapping CO_AUTHOR_ID setter
	 */
	public void setCoAuthorId(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.CO_AUTHOR_ID, value);
	}
	
	/**
	 * mapping CO_AUTHOR_ID getter
	 */
	public java.lang.Long getCoAuthorId() {
		return getValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.CO_AUTHOR_ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.DETAILS_ID-test@
	/**
	 * mapping DETAILS_ID setter
	 */
	public void setDetailsId(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.DETAILS_ID, value);
	}
	
	/**
	 * mapping DETAILS_ID getter
	 */
	public java.lang.Long getDetailsId() {
		return getValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.DETAILS_ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.TITLE-test@
	/**
	 * mapping TITLE setter
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.TITLE, value);
	}
	
	/**
	 * mapping TITLE getter
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.TITLE);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.PUBLISHED_IN-test@
	/**
	 * mapping PUBLISHED_IN setter
	 */
	public void setPublishedIn(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.PUBLISHED_IN, value);
	}
	
	/**
	 * mapping PUBLISHED_IN getter
	 */
	public java.lang.Long getPublishedIn() {
		return getValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.PUBLISHED_IN);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.LANGUAGE_ID-test@
	/**
	 * mapping LANGUAGE_ID setter
	 */
	public void setLanguageId(java.lang.Long value) {
		setValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.LANGUAGE_ID, value);
	}
	
	/**
	 * mapping LANGUAGE_ID getter
	 */
	public java.lang.Long getLanguageId() {
		return getValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.LANGUAGE_ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.CONTENT_TEXT-test@
	/**
	 * mapping CONTENT_TEXT setter
	 */
	public void setContentText(java.sql.Clob value) {
		setValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.CONTENT_TEXT, value);
	}
	
	/**
	 * mapping CONTENT_TEXT getter
	 */
	public java.sql.Clob getContentText() {
		return getValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.CONTENT_TEXT);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.CONTENT_PDF-test@
	/**
	 * mapping CONTENT_PDF setter
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.CONTENT_PDF, value);
	}
	
	/**
	 * mapping CONTENT_PDF getter
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK.CONTENT_PDF);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.mp.oracle.test.tables.VBook.__V_BOOK);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
