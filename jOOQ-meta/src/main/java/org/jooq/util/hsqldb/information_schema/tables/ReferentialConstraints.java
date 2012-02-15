/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class ReferentialConstraints extends org.jooq.impl.TableImpl<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord> {

	private static final long serialVersionUID = -1891513099;

	/**
	 * The singleton instance of REFERENTIAL_CONSTRAINTS
	 */
	public static final org.jooq.util.hsqldb.information_schema.tables.ReferentialConstraints REFERENTIAL_CONSTRAINTS = new org.jooq.util.hsqldb.information_schema.tables.ReferentialConstraints();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord> __RECORD_TYPE = org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> UNIQUE_CONSTRAINT_CATALOG = createField("UNIQUE_CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> UNIQUE_CONSTRAINT_SCHEMA = createField("UNIQUE_CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> UNIQUE_CONSTRAINT_NAME = createField("UNIQUE_CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> MATCH_OPTION = createField("MATCH_OPTION", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> UPDATE_RULE = createField("UPDATE_RULE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.hsqldb.information_schema.tables.records.ReferentialConstraintsRecord, java.lang.String> DELETE_RULE = createField("DELETE_RULE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private ReferentialConstraints() {
		super("REFERENTIAL_CONSTRAINTS", org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * No further instances allowed
	 */
	private ReferentialConstraints(java.lang.String alias) {
		super(alias, org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.hsqldb.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS);
	}

	@Override
	public org.jooq.util.hsqldb.information_schema.tables.ReferentialConstraints as(java.lang.String alias) {
		return new org.jooq.util.hsqldb.information_schema.tables.ReferentialConstraints(alias);
	}
}
