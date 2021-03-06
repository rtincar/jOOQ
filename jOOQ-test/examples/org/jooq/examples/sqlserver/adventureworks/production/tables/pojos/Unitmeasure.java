/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "UnitMeasure", schema = "Production")
public class Unitmeasure implements java.io.Serializable {

	private static final long serialVersionUID = -598568988;

	private java.lang.String   unitmeasurecode;
	private java.lang.String   name;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "UnitMeasureCode", unique = true)
	public java.lang.String getUnitmeasurecode() {
		return this.unitmeasurecode;
	}

	public void setUnitmeasurecode(java.lang.String unitmeasurecode) {
		this.unitmeasurecode = unitmeasurecode;
	}

	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
