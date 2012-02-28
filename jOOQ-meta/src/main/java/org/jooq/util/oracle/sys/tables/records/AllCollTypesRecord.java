/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * Description of named collection types accessible to the user
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class AllCollTypesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.oracle.sys.tables.records.AllCollTypesRecord> {

	private static final long serialVersionUID = -2105042876;

	/**
	 * Owner of the type
	 */
	public void setOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.OWNER, value);
	}

	/**
	 * Owner of the type
	 */
	public java.lang.String getOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.OWNER);
	}

	/**
	 * Name of the type
	 */
	public void setTypeName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.TYPE_NAME, value);
	}

	/**
	 * Name of the type
	 */
	public java.lang.String getTypeName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.TYPE_NAME);
	}

	/**
	 * Collection type
	 */
	public void setCollType(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.COLL_TYPE, value);
	}

	/**
	 * Collection type
	 */
	public java.lang.String getCollType() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.COLL_TYPE);
	}

	/**
	 * Size of the FIXED ARRAY type or maximum size of the VARYING ARRAY type
	 */
	public void setUpperBound(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.UPPER_BOUND, value);
	}

	/**
	 * Size of the FIXED ARRAY type or maximum size of the VARYING ARRAY type
	 */
	public java.math.BigDecimal getUpperBound() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.UPPER_BOUND);
	}

	/**
	 * Type modifier of the element
	 */
	public void setElemTypeMod(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.ELEM_TYPE_MOD, value);
	}

	/**
	 * Type modifier of the element
	 */
	public java.lang.String getElemTypeMod() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.ELEM_TYPE_MOD);
	}

	/**
	 * Owner of the type of the element
	 */
	public void setElemTypeOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.ELEM_TYPE_OWNER, value);
	}

	/**
	 * Owner of the type of the element
	 */
	public java.lang.String getElemTypeOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.ELEM_TYPE_OWNER);
	}

	/**
	 * Name of the type of the element
	 */
	public void setElemTypeName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.ELEM_TYPE_NAME, value);
	}

	/**
	 * Name of the type of the element
	 */
	public java.lang.String getElemTypeName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.ELEM_TYPE_NAME);
	}

	/**
	 * Length of the CHAR element or maximum length of the VARCHAR
or VARCHAR2 element
	 */
	public void setLength(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.LENGTH, value);
	}

	/**
	 * Length of the CHAR element or maximum length of the VARCHAR
or VARCHAR2 element
	 */
	public java.math.BigDecimal getLength() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.LENGTH);
	}

	/**
	 * Decimal precision of the NUMBER or DECIMAL element or
binary precision of the FLOAT element
	 */
	public void setPrecision(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.PRECISION, value);
	}

	/**
	 * Decimal precision of the NUMBER or DECIMAL element or
binary precision of the FLOAT element
	 */
	public java.math.BigDecimal getPrecision() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.PRECISION);
	}

	/**
	 * Scale of the NUMBER or DECIMAL element
	 */
	public void setScale(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.SCALE, value);
	}

	/**
	 * Scale of the NUMBER or DECIMAL element
	 */
	public java.math.BigDecimal getScale() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.SCALE);
	}

	/**
	 * Character set name of the element
	 */
	public void setCharacterSetName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.CHARACTER_SET_NAME, value);
	}

	/**
	 * Character set name of the element
	 */
	public java.lang.String getCharacterSetName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.CHARACTER_SET_NAME);
	}

	/**
	 * Storage optimization specification for VARRAY of numeric elements
	 */
	public void setElemStorage(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.ELEM_STORAGE, value);
	}

	/**
	 * Storage optimization specification for VARRAY of numeric elements
	 */
	public java.lang.String getElemStorage() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.ELEM_STORAGE);
	}

	/**
	 * Is null information stored with each VARRAY element?
	 */
	public void setNullsStored(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.NULLS_STORED, value);
	}

	/**
	 * Is null information stored with each VARRAY element?
	 */
	public java.lang.String getNullsStored() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.NULLS_STORED);
	}

	/**
	 * C if the width was specified in characters, B if in bytes
	 */
	public void setCharUsed(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.CHAR_USED, value);
	}

	/**
	 * C if the width was specified in characters, B if in bytes
	 */
	public java.lang.String getCharUsed() {
		return getValue(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES.CHAR_USED);
	}

	/**
	 * Create a detached AllCollTypesRecord
	 */
	public AllCollTypesRecord() {
		super(org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES);
	}
}
