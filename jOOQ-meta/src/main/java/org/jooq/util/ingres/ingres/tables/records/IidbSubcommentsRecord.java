/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class IidbSubcommentsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.ingres.ingres.tables.records.IidbSubcommentsRecord> {

	private static final long serialVersionUID = -909876263;

	/**
	 * An uncommented item
	 */
	public void setObjectName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.OBJECT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getObjectName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.OBJECT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setObjectOwner(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.OBJECT_OWNER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getObjectOwner() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.OBJECT_OWNER);
	}

	/**
	 * An uncommented item
	 */
	public void setSubobjectName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.SUBOBJECT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSubobjectName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.SUBOBJECT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setSubobjectType(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.SUBOBJECT_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSubobjectType() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.SUBOBJECT_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setShortRemark(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.SHORT_REMARK, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getShortRemark() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.SHORT_REMARK);
	}

	/**
	 * An uncommented item
	 */
	public void setTextSequence(java.lang.Long value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.TEXT_SEQUENCE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getTextSequence() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.TEXT_SEQUENCE);
	}

	/**
	 * An uncommented item
	 */
	public void setLongRemark(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.LONG_REMARK, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLongRemark() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbSubcomments.LONG_REMARK);
	}

	/**
	 * Create a detached IidbSubcommentsRecord
	 */
	public IidbSubcommentsRecord() {
		super(org.jooq.util.ingres.ingres.tables.IidbSubcomments.IIDB_SUBCOMMENTS);
	}
}
