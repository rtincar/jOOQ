/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vStateProvinceCountryRegion", schema = "Person")
public class Vstateprovincecountryregion implements java.io.Serializable {

	private static final long serialVersionUID = 842749485;

	private java.lang.Integer stateprovinceid;
	private java.lang.String  stateprovincecode;
	private java.lang.Boolean isonlystateprovinceflag;
	private java.lang.String  stateprovincename;
	private java.lang.Integer territoryid;
	private java.lang.String  countryregioncode;
	private java.lang.String  countryregionname;

	@javax.persistence.Column(name = "StateProvinceID")
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

	@javax.persistence.Column(name = "IsOnlyStateProvinceFlag")
	public java.lang.Boolean getIsonlystateprovinceflag() {
		return this.isonlystateprovinceflag;
	}

	public void setIsonlystateprovinceflag(java.lang.Boolean isonlystateprovinceflag) {
		this.isonlystateprovinceflag = isonlystateprovinceflag;
	}

	@javax.persistence.Column(name = "StateProvinceName")
	public java.lang.String getStateprovincename() {
		return this.stateprovincename;
	}

	public void setStateprovincename(java.lang.String stateprovincename) {
		this.stateprovincename = stateprovincename;
	}

	@javax.persistence.Column(name = "TerritoryID")
	public java.lang.Integer getTerritoryid() {
		return this.territoryid;
	}

	public void setTerritoryid(java.lang.Integer territoryid) {
		this.territoryid = territoryid;
	}

	@javax.persistence.Column(name = "CountryRegionCode")
	public java.lang.String getCountryregioncode() {
		return this.countryregioncode;
	}

	public void setCountryregioncode(java.lang.String countryregioncode) {
		this.countryregioncode = countryregioncode;
	}

	@javax.persistence.Column(name = "CountryRegionName")
	public java.lang.String getCountryregionname() {
		return this.countryregionname;
	}

	public void setCountryregionname(java.lang.String countryregionname) {
		this.countryregionname = countryregionname;
	}
}
