/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vJobCandidate", schema = "HumanResources")
public class Vjobcandidate implements java.io.Serializable {

	private static final long serialVersionUID = -43852519;

	private java.lang.Integer  jobcandidateid;
	private java.lang.Integer  employeeid;
	private java.lang.String   namePrefix;
	private java.lang.String   nameFirst;
	private java.lang.String   nameMiddle;
	private java.lang.String   nameLast;
	private java.lang.String   nameSuffix;
	private java.lang.String   skills;
	private java.lang.String   addrType;
	private java.lang.String   addrLocCountryregion;
	private java.lang.String   addrLocState;
	private java.lang.String   addrLocCity;
	private java.lang.String   addrPostalcode;
	private java.lang.String   email;
	private java.lang.String   website;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Column(name = "JobCandidateID")
	public java.lang.Integer getJobcandidateid() {
		return this.jobcandidateid;
	}

	public void setJobcandidateid(java.lang.Integer jobcandidateid) {
		this.jobcandidateid = jobcandidateid;
	}

	@javax.persistence.Column(name = "EmployeeID")
	public java.lang.Integer getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(java.lang.Integer employeeid) {
		this.employeeid = employeeid;
	}

	@javax.persistence.Column(name = "Name.Prefix")
	public java.lang.String getNamePrefix() {
		return this.namePrefix;
	}

	public void setNamePrefix(java.lang.String namePrefix) {
		this.namePrefix = namePrefix;
	}

	@javax.persistence.Column(name = "Name.First")
	public java.lang.String getNameFirst() {
		return this.nameFirst;
	}

	public void setNameFirst(java.lang.String nameFirst) {
		this.nameFirst = nameFirst;
	}

	@javax.persistence.Column(name = "Name.Middle")
	public java.lang.String getNameMiddle() {
		return this.nameMiddle;
	}

	public void setNameMiddle(java.lang.String nameMiddle) {
		this.nameMiddle = nameMiddle;
	}

	@javax.persistence.Column(name = "Name.Last")
	public java.lang.String getNameLast() {
		return this.nameLast;
	}

	public void setNameLast(java.lang.String nameLast) {
		this.nameLast = nameLast;
	}

	@javax.persistence.Column(name = "Name.Suffix")
	public java.lang.String getNameSuffix() {
		return this.nameSuffix;
	}

	public void setNameSuffix(java.lang.String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	@javax.persistence.Column(name = "Skills")
	public java.lang.String getSkills() {
		return this.skills;
	}

	public void setSkills(java.lang.String skills) {
		this.skills = skills;
	}

	@javax.persistence.Column(name = "Addr.Type")
	public java.lang.String getAddrType() {
		return this.addrType;
	}

	public void setAddrType(java.lang.String addrType) {
		this.addrType = addrType;
	}

	@javax.persistence.Column(name = "Addr.Loc.CountryRegion")
	public java.lang.String getAddrLocCountryregion() {
		return this.addrLocCountryregion;
	}

	public void setAddrLocCountryregion(java.lang.String addrLocCountryregion) {
		this.addrLocCountryregion = addrLocCountryregion;
	}

	@javax.persistence.Column(name = "Addr.Loc.State")
	public java.lang.String getAddrLocState() {
		return this.addrLocState;
	}

	public void setAddrLocState(java.lang.String addrLocState) {
		this.addrLocState = addrLocState;
	}

	@javax.persistence.Column(name = "Addr.Loc.City")
	public java.lang.String getAddrLocCity() {
		return this.addrLocCity;
	}

	public void setAddrLocCity(java.lang.String addrLocCity) {
		this.addrLocCity = addrLocCity;
	}

	@javax.persistence.Column(name = "Addr.PostalCode")
	public java.lang.String getAddrPostalcode() {
		return this.addrPostalcode;
	}

	public void setAddrPostalcode(java.lang.String addrPostalcode) {
		this.addrPostalcode = addrPostalcode;
	}

	@javax.persistence.Column(name = "EMail")
	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	@javax.persistence.Column(name = "WebSite")
	public java.lang.String getWebsite() {
		return this.website;
	}

	public void setWebsite(java.lang.String website) {
		this.website = website;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
