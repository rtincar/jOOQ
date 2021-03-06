/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Culture", schema = "Production")
public class CultureRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.CultureRecord> {

	private static final long serialVersionUID = -988396411;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setCultureid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.CULTURE.CULTUREID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "CultureID", unique = true)
	public java.lang.String getCultureid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.CULTURE.CULTUREID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.CULTURE.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.CULTURE.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.CULTURE.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.CULTURE.MODIFIEDDATE);
	}

	/**
	 * Create a detached CultureRecord
	 */
	public CultureRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.CULTURE);
	}
}
