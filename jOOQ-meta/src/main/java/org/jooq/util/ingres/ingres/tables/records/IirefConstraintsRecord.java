/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class IirefConstraintsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.ingres.ingres.tables.records.IirefConstraintsRecord> {

	private static final long serialVersionUID = 549772835;

	/**
	 * An uncommented item
	 */
	public void setRefConstraintName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.REF_CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getRefConstraintName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.REF_CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setRefSchemaName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.REF_SCHEMA_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getRefSchemaName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.REF_SCHEMA_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setRefTableName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.REF_TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getRefTableName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.REF_TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueConstraintName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.UNIQUE_CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getUniqueConstraintName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.UNIQUE_CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueSchemaName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.UNIQUE_SCHEMA_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getUniqueSchemaName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.UNIQUE_SCHEMA_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setUniqueTableName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.UNIQUE_TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getUniqueTableName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IirefConstraints.UNIQUE_TABLE_NAME);
	}

	/**
	 * Create a detached IirefConstraintsRecord
	 */
	public IirefConstraintsRecord() {
		super(org.jooq.util.ingres.ingres.tables.IirefConstraints.IIREF_CONSTRAINTS);
	}
}
