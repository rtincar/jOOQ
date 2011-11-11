/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * Stored Procedures
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class ProcRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.mysql.mysql.tables.records.ProcRecord> {

	private static final long serialVersionUID = 1736946350;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setDb(java.lang.String value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.DB, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.String getDb() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.DB);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.NAME);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setType(org.jooq.util.mysql.mysql.enums.ProcType value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.TYPE, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public org.jooq.util.mysql.mysql.enums.ProcType getType() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setSpecificName(java.lang.String value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.SPECIFIC_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSpecificName() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.SPECIFIC_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLanguage(org.jooq.util.mysql.mysql.enums.ProcLanguage value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.LANGUAGE, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.util.mysql.mysql.enums.ProcLanguage getLanguage() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.LANGUAGE);
	}

	/**
	 * An uncommented item
	 */
	public void setSqlDataAccess(org.jooq.util.mysql.mysql.enums.ProcSqlDataAccess value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.SQL_DATA_ACCESS, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.util.mysql.mysql.enums.ProcSqlDataAccess getSqlDataAccess() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.SQL_DATA_ACCESS);
	}

	/**
	 * An uncommented item
	 */
	public void setIsDeterministic(org.jooq.util.mysql.mysql.enums.ProcIsDeterministic value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.IS_DETERMINISTIC, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.util.mysql.mysql.enums.ProcIsDeterministic getIsDeterministic() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.IS_DETERMINISTIC);
	}

	/**
	 * An uncommented item
	 */
	public void setSecurityType(org.jooq.util.mysql.mysql.enums.ProcSecurityType value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.SECURITY_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.util.mysql.mysql.enums.ProcSecurityType getSecurityType() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.SECURITY_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setParamList(byte[] value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.PARAM_LIST, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getParamList() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.PARAM_LIST);
	}

	/**
	 * An uncommented item
	 */
	public void setReturns(byte[] value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.RETURNS, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getReturns() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.RETURNS);
	}

	/**
	 * An uncommented item
	 */
	public void setBody(byte[] value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.BODY, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getBody() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.BODY);
	}

	/**
	 * An uncommented item
	 */
	public void setDefiner(java.lang.String value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.DEFINER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDefiner() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.DEFINER);
	}

	/**
	 * An uncommented item
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.CREATED, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getCreated() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.CREATED);
	}

	/**
	 * An uncommented item
	 */
	public void setModified(java.sql.Timestamp value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.MODIFIED, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getModified() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.MODIFIED);
	}

	/**
	 * An uncommented item
	 */
	public void setSqlMode(java.lang.String value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.SQL_MODE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSqlMode() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.SQL_MODE);
	}

	/**
	 * An uncommented item
	 */
	public void setComment(java.lang.String value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.COMMENT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getComment() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.COMMENT);
	}

	/**
	 * An uncommented item
	 */
	public void setCharacterSetClient(java.lang.String value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.CHARACTER_SET_CLIENT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCharacterSetClient() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.CHARACTER_SET_CLIENT);
	}

	/**
	 * An uncommented item
	 */
	public void setCollationConnection(java.lang.String value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.COLLATION_CONNECTION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCollationConnection() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.COLLATION_CONNECTION);
	}

	/**
	 * An uncommented item
	 */
	public void setDbCollation(java.lang.String value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.DB_COLLATION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDbCollation() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.DB_COLLATION);
	}

	/**
	 * An uncommented item
	 */
	public void setBodyUtf8(byte[] value) {
		setValue(org.jooq.util.mysql.mysql.tables.Proc.BODY_UTF8, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getBodyUtf8() {
		return getValue(org.jooq.util.mysql.mysql.tables.Proc.BODY_UTF8);
	}

	/**
	 * Create a detached ProcRecord
	 */
	public ProcRecord() {
		super(org.jooq.util.mysql.mysql.tables.Proc.PROC);
	}
}
