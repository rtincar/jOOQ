/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "BillOfMaterials", schema = "Production")
public class Billofmaterials implements java.io.Serializable {

	private static final long serialVersionUID = -1058553956;

	private java.lang.Integer    billofmaterialsid;
	private java.lang.Integer    productassemblyid;
	private java.lang.Integer    componentid;
	private java.sql.Timestamp   startdate;
	private java.sql.Timestamp   enddate;
	private java.lang.String     unitmeasurecode;
	private java.lang.Short      bomlevel;
	private java.math.BigDecimal perassemblyqty;
	private java.sql.Timestamp   modifieddate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "BillOfMaterialsID", unique = true)
	public java.lang.Integer getBillofmaterialsid() {
		return this.billofmaterialsid;
	}

	public void setBillofmaterialsid(java.lang.Integer billofmaterialsid) {
		this.billofmaterialsid = billofmaterialsid;
	}

	@javax.persistence.Column(name = "ProductAssemblyID")
	public java.lang.Integer getProductassemblyid() {
		return this.productassemblyid;
	}

	public void setProductassemblyid(java.lang.Integer productassemblyid) {
		this.productassemblyid = productassemblyid;
	}

	@javax.persistence.Column(name = "ComponentID")
	public java.lang.Integer getComponentid() {
		return this.componentid;
	}

	public void setComponentid(java.lang.Integer componentid) {
		this.componentid = componentid;
	}

	@javax.persistence.Column(name = "StartDate")
	public java.sql.Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(java.sql.Timestamp startdate) {
		this.startdate = startdate;
	}

	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEnddate() {
		return this.enddate;
	}

	public void setEnddate(java.sql.Timestamp enddate) {
		this.enddate = enddate;
	}

	@javax.persistence.Column(name = "UnitMeasureCode")
	public java.lang.String getUnitmeasurecode() {
		return this.unitmeasurecode;
	}

	public void setUnitmeasurecode(java.lang.String unitmeasurecode) {
		this.unitmeasurecode = unitmeasurecode;
	}

	@javax.persistence.Column(name = "BOMLevel")
	public java.lang.Short getBomlevel() {
		return this.bomlevel;
	}

	public void setBomlevel(java.lang.Short bomlevel) {
		this.bomlevel = bomlevel;
	}

	@javax.persistence.Column(name = "PerAssemblyQty")
	public java.math.BigDecimal getPerassemblyqty() {
		return this.perassemblyqty;
	}

	public void setPerassemblyqty(java.math.BigDecimal perassemblyqty) {
		this.perassemblyqty = perassemblyqty;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
