/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * Description of attributes of types accessible to the user
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class AllTypeAttrsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.oracle.sys.tables.records.AllTypeAttrsRecord> {

	private static final long serialVersionUID = 999948773;

	/**
	 * Owner of the type
	 */
	public void setOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.OWNER, value);
	}

	/**
	 * Owner of the type
	 */
	public java.lang.String getOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.OWNER);
	}

	/**
	 * Name of the type
	 */
	public void setTypeName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.TYPE_NAME, value);
	}

	/**
	 * Name of the type
	 */
	public java.lang.String getTypeName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.TYPE_NAME);
	}

	/**
	 * Name of the attribute
	 */
	public void setAttrName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_NAME, value);
	}

	/**
	 * Name of the attribute
	 */
	public java.lang.String getAttrName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_NAME);
	}

	/**
	 * Type modifier of the attribute
	 */
	public void setAttrTypeMod(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_TYPE_MOD, value);
	}

	/**
	 * Type modifier of the attribute
	 */
	public java.lang.String getAttrTypeMod() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_TYPE_MOD);
	}

	/**
	 * Owner of the type of the attribute
	 */
	public void setAttrTypeOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_TYPE_OWNER, value);
	}

	/**
	 * Owner of the type of the attribute
	 */
	public java.lang.String getAttrTypeOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_TYPE_OWNER);
	}

	/**
	 * Name of the type of the attribute
	 */
	public void setAttrTypeName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_TYPE_NAME, value);
	}

	/**
	 * Name of the type of the attribute
	 */
	public java.lang.String getAttrTypeName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_TYPE_NAME);
	}

	/**
	 * Length of the CHAR attribute or maximum length of the VARCHAR
or VARCHAR2 attribute
	 */
	public void setLength(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.LENGTH, value);
	}

	/**
	 * Length of the CHAR attribute or maximum length of the VARCHAR
or VARCHAR2 attribute
	 */
	public java.math.BigDecimal getLength() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.LENGTH);
	}

	/**
	 * Decimal precision of the NUMBER or DECIMAL attribute or
binary precision of the FLOAT attribute
	 */
	public void setPrecision(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.PRECISION, value);
	}

	/**
	 * Decimal precision of the NUMBER or DECIMAL attribute or
binary precision of the FLOAT attribute
	 */
	public java.math.BigDecimal getPrecision() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.PRECISION);
	}

	/**
	 * Scale of the NUMBER or DECIMAL attribute
	 */
	public void setScale(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.SCALE, value);
	}

	/**
	 * Scale of the NUMBER or DECIMAL attribute
	 */
	public java.math.BigDecimal getScale() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.SCALE);
	}

	/**
	 * Character set name of the attribute
	 */
	public void setCharacterSetName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.CHARACTER_SET_NAME, value);
	}

	/**
	 * Character set name of the attribute
	 */
	public java.lang.String getCharacterSetName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.CHARACTER_SET_NAME);
	}

	/**
	 * Syntactical order number or position of the attribute as specified in the
type specification or CREATE TYPE statement (not to be used as ID number)
	 */
	public void setAttrNo(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_NO, value);
	}

	/**
	 * Syntactical order number or position of the attribute as specified in the
type specification or CREATE TYPE statement (not to be used as ID number)
	 */
	public java.math.BigDecimal getAttrNo() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.ATTR_NO);
	}

	/**
	 * Is the attribute inherited from the supertype ?
	 */
	public void setInherited(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.INHERITED, value);
	}

	/**
	 * Is the attribute inherited from the supertype ?
	 */
	public java.lang.String getInherited() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS.INHERITED);
	}

	/**
	 * Create a detached AllTypeAttrsRecord
	 */
	public AllTypeAttrsRecord() {
		super(org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS);
	}
}
