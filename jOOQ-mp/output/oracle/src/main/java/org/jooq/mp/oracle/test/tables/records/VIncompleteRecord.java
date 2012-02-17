
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.oracle.test.tables.VIncomplete;
import org.jooq.mp.oracle.test.Test;
import org.jooq.mp.oracle.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class VIncompleteRecord extends UpdatableRecordImpl<org.jooq.mp.oracle.test.tables.records.VIncompleteRecord> {

	private static final long serialVersionUID = 123456789;

//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.ID-test@
	/**
	 * mapping ID setter
	 */
	public void setId(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.ID, value);
	}
	
	/**
	 * mapping ID getter
	 */
	public java.lang.String getId() {
		return getValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.AUTHOR_ID-test@
	/**
	 * mapping AUTHOR_ID setter
	 */
	public void setAuthorId(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.AUTHOR_ID, value);
	}
	
	/**
	 * mapping AUTHOR_ID getter
	 */
	public java.lang.String getAuthorId() {
		return getValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.AUTHOR_ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.CO_AUTHOR_ID-test@
	/**
	 * mapping CO_AUTHOR_ID setter
	 */
	public void setCoAuthorId(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.CO_AUTHOR_ID, value);
	}
	
	/**
	 * mapping CO_AUTHOR_ID getter
	 */
	public java.lang.String getCoAuthorId() {
		return getValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.CO_AUTHOR_ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.DETAILS_ID-test@
	/**
	 * mapping DETAILS_ID setter
	 */
	public void setDetailsId(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.DETAILS_ID, value);
	}
	
	/**
	 * mapping DETAILS_ID getter
	 */
	public java.lang.String getDetailsId() {
		return getValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.DETAILS_ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.TITLE-test@
	/**
	 * mapping TITLE setter
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.TITLE, value);
	}
	
	/**
	 * mapping TITLE getter
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.TITLE);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.PUBLISHED_IN-test@
	/**
	 * mapping PUBLISHED_IN setter
	 */
	public void setPublishedIn(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.PUBLISHED_IN, value);
	}
	
	/**
	 * mapping PUBLISHED_IN getter
	 */
	public java.lang.String getPublishedIn() {
		return getValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.PUBLISHED_IN);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.LANGUAGE_ID-test@
	/**
	 * mapping LANGUAGE_ID setter
	 */
	public void setLanguageId(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.LANGUAGE_ID, value);
	}
	
	/**
	 * mapping LANGUAGE_ID getter
	 */
	public java.lang.String getLanguageId() {
		return getValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.LANGUAGE_ID);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.CONTENT_TEXT-test@
	/**
	 * mapping CONTENT_TEXT setter
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.CONTENT_TEXT, value);
	}
	
	/**
	 * mapping CONTENT_TEXT getter
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.CONTENT_TEXT);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.CONTENT_PDF-test@
	/**
	 * mapping CONTENT_PDF setter
	 */
	public void setContentPdf(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.CONTENT_PDF, value);
	}
	
	/**
	 * mapping CONTENT_PDF getter
	 */
	public java.lang.String getContentPdf() {
		return getValue(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE.CONTENT_PDF);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached VIncompleteRecord
	 */
	public VIncompleteRecord() {
		super(org.jooq.mp.oracle.test.tables.VIncomplete.__V_INCOMPLETE);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
