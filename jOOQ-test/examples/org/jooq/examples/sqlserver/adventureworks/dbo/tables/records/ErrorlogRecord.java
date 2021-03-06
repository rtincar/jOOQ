/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ErrorLog", schema = "dbo")
public class ErrorlogRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord> {

	private static final long serialVersionUID = -266762883;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setErrorlogid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORLOGID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ErrorLogID", unique = true)
	public java.lang.Integer getErrorlogid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORLOGID);
	}

	/**
	 * An uncommented item
	 */
	public void setErrortime(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORTIME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ErrorTime")
	public java.sql.Timestamp getErrortime() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORTIME);
	}

	/**
	 * An uncommented item
	 */
	public void setUsername(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.USERNAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "UserName")
	public java.lang.String getUsername() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.USERNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setErrornumber(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORNUMBER, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ErrorNumber")
	public java.lang.Integer getErrornumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORNUMBER);
	}

	/**
	 * An uncommented item
	 */
	public void setErrorseverity(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORSEVERITY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ErrorSeverity")
	public java.lang.Integer getErrorseverity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORSEVERITY);
	}

	/**
	 * An uncommented item
	 */
	public void setErrorstate(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORSTATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ErrorState")
	public java.lang.Integer getErrorstate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORSTATE);
	}

	/**
	 * An uncommented item
	 */
	public void setErrorprocedure(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORPROCEDURE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ErrorProcedure")
	public java.lang.String getErrorprocedure() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORPROCEDURE);
	}

	/**
	 * An uncommented item
	 */
	public void setErrorline(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORLINE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ErrorLine")
	public java.lang.Integer getErrorline() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORLINE);
	}

	/**
	 * An uncommented item
	 */
	public void setErrormessage(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORMESSAGE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ErrorMessage")
	public java.lang.String getErrormessage() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORMESSAGE);
	}

	/**
	 * Create a detached ErrorlogRecord
	 */
	public ErrorlogRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG);
	}
}
