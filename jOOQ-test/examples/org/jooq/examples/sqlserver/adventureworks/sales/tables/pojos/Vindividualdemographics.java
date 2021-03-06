/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vIndividualDemographics", schema = "Sales")
public class Vindividualdemographics implements java.io.Serializable {

	private static final long serialVersionUID = -2018531893;

	private java.lang.Integer    customerid;
	private java.math.BigDecimal totalpurchaseytd;
	private java.sql.Timestamp   datefirstpurchase;
	private java.sql.Timestamp   birthdate;
	private java.lang.String     maritalstatus;
	private java.lang.String     yearlyincome;
	private java.lang.String     gender;
	private java.lang.Integer    totalchildren;
	private java.lang.Integer    numberchildrenathome;
	private java.lang.String     education;
	private java.lang.String     occupation;
	private java.lang.Boolean    homeownerflag;
	private java.lang.Integer    numbercarsowned;

	@javax.persistence.Column(name = "CustomerID")
	public java.lang.Integer getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(java.lang.Integer customerid) {
		this.customerid = customerid;
	}

	@javax.persistence.Column(name = "TotalPurchaseYTD")
	public java.math.BigDecimal getTotalpurchaseytd() {
		return this.totalpurchaseytd;
	}

	public void setTotalpurchaseytd(java.math.BigDecimal totalpurchaseytd) {
		this.totalpurchaseytd = totalpurchaseytd;
	}

	@javax.persistence.Column(name = "DateFirstPurchase")
	public java.sql.Timestamp getDatefirstpurchase() {
		return this.datefirstpurchase;
	}

	public void setDatefirstpurchase(java.sql.Timestamp datefirstpurchase) {
		this.datefirstpurchase = datefirstpurchase;
	}

	@javax.persistence.Column(name = "BirthDate")
	public java.sql.Timestamp getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(java.sql.Timestamp birthdate) {
		this.birthdate = birthdate;
	}

	@javax.persistence.Column(name = "MaritalStatus")
	public java.lang.String getMaritalstatus() {
		return this.maritalstatus;
	}

	public void setMaritalstatus(java.lang.String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	@javax.persistence.Column(name = "YearlyIncome")
	public java.lang.String getYearlyincome() {
		return this.yearlyincome;
	}

	public void setYearlyincome(java.lang.String yearlyincome) {
		this.yearlyincome = yearlyincome;
	}

	@javax.persistence.Column(name = "Gender")
	public java.lang.String getGender() {
		return this.gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	@javax.persistence.Column(name = "TotalChildren")
	public java.lang.Integer getTotalchildren() {
		return this.totalchildren;
	}

	public void setTotalchildren(java.lang.Integer totalchildren) {
		this.totalchildren = totalchildren;
	}

	@javax.persistence.Column(name = "NumberChildrenAtHome")
	public java.lang.Integer getNumberchildrenathome() {
		return this.numberchildrenathome;
	}

	public void setNumberchildrenathome(java.lang.Integer numberchildrenathome) {
		this.numberchildrenathome = numberchildrenathome;
	}

	@javax.persistence.Column(name = "Education")
	public java.lang.String getEducation() {
		return this.education;
	}

	public void setEducation(java.lang.String education) {
		this.education = education;
	}

	@javax.persistence.Column(name = "Occupation")
	public java.lang.String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(java.lang.String occupation) {
		this.occupation = occupation;
	}

	@javax.persistence.Column(name = "HomeOwnerFlag")
	public java.lang.Boolean getHomeownerflag() {
		return this.homeownerflag;
	}

	public void setHomeownerflag(java.lang.Boolean homeownerflag) {
		this.homeownerflag = homeownerflag;
	}

	@javax.persistence.Column(name = "NumberCarsOwned")
	public java.lang.Integer getNumbercarsowned() {
		return this.numbercarsowned;
	}

	public void setNumbercarsowned(java.lang.Integer numbercarsowned) {
		this.numbercarsowned = numbercarsowned;
	}
}
