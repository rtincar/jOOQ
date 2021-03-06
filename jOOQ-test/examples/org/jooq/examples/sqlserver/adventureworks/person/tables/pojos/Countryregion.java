/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "CountryRegion", schema = "Person")
public class Countryregion implements java.io.Serializable {

	private static final long serialVersionUID = 334941412;

	private java.lang.String   countryregioncode;
	private java.lang.String   name;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "CountryRegionCode", unique = true)
	public java.lang.String getCountryregioncode() {
		return this.countryregioncode;
	}

	public void setCountryregioncode(java.lang.String countryregioncode) {
		this.countryregioncode = countryregioncode;
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
