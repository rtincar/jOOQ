/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class SequencesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.db2.syscat.tables.records.SequencesRecord> {

	private static final long serialVersionUID = -1329221445;

	/**
	 * An uncommented item
	 */
	public void setSeqschema(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.SEQSCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSeqschema() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.SEQSCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setSeqname(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.SEQNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSeqname() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.SEQNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDefiner(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.DEFINER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDefiner() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.DEFINER);
	}

	/**
	 * An uncommented item
	 */
	public void setDefinertype(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.DEFINERTYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDefinertype() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.DEFINERTYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setOwner(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.OWNER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getOwner() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.OWNER);
	}

	/**
	 * An uncommented item
	 */
	public void setOwnertype(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.OWNERTYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getOwnertype() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.OWNERTYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setSeqid(java.lang.Integer value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.SEQID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getSeqid() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.SEQID);
	}

	/**
	 * An uncommented item
	 */
	public void setSeqtype(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.SEQTYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSeqtype() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.SEQTYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setBaseSeqschema(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.BASE_SEQSCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getBaseSeqschema() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.BASE_SEQSCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setBaseSeqname(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.BASE_SEQNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getBaseSeqname() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.BASE_SEQNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setIncrement(java.math.BigInteger value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.INCREMENT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigInteger getIncrement() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.INCREMENT);
	}

	/**
	 * An uncommented item
	 */
	public void setStart(java.math.BigInteger value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.START, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigInteger getStart() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.START);
	}

	/**
	 * An uncommented item
	 */
	public void setMaxvalue(java.math.BigInteger value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.MAXVALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigInteger getMaxvalue() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.MAXVALUE);
	}

	/**
	 * An uncommented item
	 */
	public void setMinvalue(java.math.BigInteger value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.MINVALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigInteger getMinvalue() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.MINVALUE);
	}

	/**
	 * An uncommented item
	 */
	public void setNextcachefirstvalue(java.math.BigInteger value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.NEXTCACHEFIRSTVALUE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigInteger getNextcachefirstvalue() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.NEXTCACHEFIRSTVALUE);
	}

	/**
	 * An uncommented item
	 */
	public void setCycle(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.CYCLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCycle() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.CYCLE);
	}

	/**
	 * An uncommented item
	 */
	public void setCache(java.lang.Integer value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.CACHE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getCache() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.CACHE);
	}

	/**
	 * An uncommented item
	 */
	public void setOrder(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.ORDER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getOrder() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.ORDER);
	}

	/**
	 * An uncommented item
	 */
	public void setDatatypeid(java.lang.Integer value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.DATATYPEID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDatatypeid() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.DATATYPEID);
	}

	/**
	 * An uncommented item
	 */
	public void setSourcetypeid(java.lang.Integer value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.SOURCETYPEID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getSourcetypeid() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.SOURCETYPEID);
	}

	/**
	 * An uncommented item
	 */
	public void setCreateTime(java.sql.Timestamp value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.CREATE_TIME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getCreateTime() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.CREATE_TIME);
	}

	/**
	 * An uncommented item
	 */
	public void setAlterTime(java.sql.Timestamp value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.ALTER_TIME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getAlterTime() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.ALTER_TIME);
	}

	/**
	 * An uncommented item
	 */
	public void setPrecision(java.lang.Short value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.PRECISION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getPrecision() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.PRECISION);
	}

	/**
	 * An uncommented item
	 */
	public void setOrigin(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.ORIGIN, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getOrigin() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.ORIGIN);
	}

	/**
	 * An uncommented item
	 */
	public void setRemarks(java.lang.String value) {
		setValue(org.jooq.util.db2.syscat.tables.Sequences.REMARKS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getRemarks() {
		return getValue(org.jooq.util.db2.syscat.tables.Sequences.REMARKS);
	}

	/**
	 * Create a detached SequencesRecord
	 */
	public SequencesRecord() {
		super(org.jooq.util.db2.syscat.tables.Sequences.SEQUENCES);
	}
}
