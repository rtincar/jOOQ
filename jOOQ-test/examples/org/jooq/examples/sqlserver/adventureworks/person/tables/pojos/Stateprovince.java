/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "StateProvince", schema = "Person")
public class Stateprovince implements java.io.Serializable {

	private static final long serialVersionUID = 321624949;

	private java.lang.Integer  stateprovinceid;
	private java.lang.String   stateprovincecode;
	private java.lang.String   countryregioncode;
	private java.lang.Boolean  isonlystateprovinceflag;
	private java.lang.String   name;
	private java.lang.Integer  territoryid;
	private java.lang.String   rowguid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "StateProvinceID", unique = true)
	public java.lang.Integer getStateprovinceid() {
		return this.stateprovinceid;
	}

	public void setStateprovinceid(java.lang.Integer stateprovinceid) {
		this.stateprovinceid = stateprovinceid;
	}

	@javax.persistence.Column(name = "StateProvinceCode")
	public java.lang.String getStateprovincecode() {
		return this.stateprovincecode;
	}

	public void setStateprovincecode(java.lang.String stateprovincecode) {
		this.stateprovincecode = stateprovincecode;
	}

	@javax.persistence.Column(name = "CountryRegionCode")
	public java.lang.String getCountryregioncode() {
		return this.countryregioncode;
	}

	public void setCountryregioncode(java.lang.String countryregioncode) {
		this.countryregioncode = countryregioncode;
	}

	@javax.persistence.Column(name = "IsOnlyStateProvinceFlag")
	public java.lang.Boolean getIsonlystateprovinceflag() {
		return this.isonlystateprovinceflag;
	}

	public void setIsonlystateprovinceflag(java.lang.Boolean isonlystateprovinceflag) {
		this.isonlystateprovinceflag = isonlystateprovinceflag;
	}

	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "TerritoryID")
	public java.lang.Integer getTerritoryid() {
		return this.territoryid;
	}

	public void setTerritoryid(java.lang.Integer territoryid) {
		this.territoryid = territoryid;
	}

	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return this.rowguid;
	}

	public void setRowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
