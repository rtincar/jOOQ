/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vSalesPersonSalesByFiscalYears", schema = "Sales")
public class Vsalespersonsalesbyfiscalyears implements java.io.Serializable {

	private static final long serialVersionUID = 1366660413;

	private java.lang.Integer    salespersonid;
	private java.lang.String     fullname;
	private java.lang.String     title;
	private java.lang.String     salesterritory;
	private java.math.BigDecimal __2002;
	private java.math.BigDecimal __2003;
	private java.math.BigDecimal __2004;

	@javax.persistence.Column(name = "SalesPersonID")
	public java.lang.Integer getSalespersonid() {
		return this.salespersonid;
	}

	public void setSalespersonid(java.lang.Integer salespersonid) {
		this.salespersonid = salespersonid;
	}

	@javax.persistence.Column(name = "FullName")
	public java.lang.String getFullname() {
		return this.fullname;
	}

	public void setFullname(java.lang.String fullname) {
		this.fullname = fullname;
	}

	@javax.persistence.Column(name = "Title")
	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	@javax.persistence.Column(name = "SalesTerritory")
	public java.lang.String getSalesterritory() {
		return this.salesterritory;
	}

	public void setSalesterritory(java.lang.String salesterritory) {
		this.salesterritory = salesterritory;
	}

	@javax.persistence.Column(name = "2002")
	public java.math.BigDecimal get__2002() {
		return this.__2002;
	}

	public void set__2002(java.math.BigDecimal __2002) {
		this.__2002 = __2002;
	}

	@javax.persistence.Column(name = "2003")
	public java.math.BigDecimal get__2003() {
		return this.__2003;
	}

	public void set__2003(java.math.BigDecimal __2003) {
		this.__2003 = __2003;
	}

	@javax.persistence.Column(name = "2004")
	public java.math.BigDecimal get__2004() {
		return this.__2004;
	}

	public void set__2004(java.math.BigDecimal __2004) {
		this.__2004 = __2004;
	}
}
