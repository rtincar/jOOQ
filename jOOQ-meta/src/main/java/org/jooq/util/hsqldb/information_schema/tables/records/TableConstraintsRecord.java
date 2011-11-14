/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TableConstraintsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.hsqldb.information_schema.tables.records.TableConstraintsRecord> {

	private static final long serialVersionUID = -1371495510;

	/**
	 * An uncommented item
	 */
	public void setConstraintCatalog(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintCatalog() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintSchema(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintSchema() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintName(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintName() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setConstraintType(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintType() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.CONSTRAINT_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableCatalog() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableSchema() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableName() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setIsDeferrable(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.IS_DEFERRABLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getIsDeferrable() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.IS_DEFERRABLE);
	}

	/**
	 * An uncommented item
	 */
	public void setInitiallyDeferred(java.lang.String value) {
		setValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.INITIALLY_DEFERRED, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getInitiallyDeferred() {
		return getValue(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS.INITIALLY_DEFERRED);
	}

	/**
	 * Create a detached TableConstraintsRecord
	 */
	public TableConstraintsRecord() {
		super(org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS);
	}
}
