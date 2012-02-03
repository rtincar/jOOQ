/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
public class Department extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord> {

	private static final long serialVersionUID = 1891140250;

	/**
	 * The singleton instance of Department
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department DEPARTMENT = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord, java.lang.Short> DEPARTMENTID = createField("DepartmentID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord, java.lang.String> GROUPNAME = createField("GroupName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Department() {
		super("Department", org.jooq.examples.sqlserver.adventureworks.humanresources.Humanresources.HUMANRESOURCES);
	}

	/**
	 * No further instances allowed
	 */
	private Department(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.Humanresources.HUMANRESOURCES, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.DEPARTMENT);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.IDENTITY_Department;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_Department_DepartmentID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.DepartmentRecord>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_Department_DepartmentID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department(alias);
	}
}
