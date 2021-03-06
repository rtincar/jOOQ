/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vProductModelInstructions", schema = "Production")
public class Vproductmodelinstructions implements java.io.Serializable {

	private static final long serialVersionUID = -1395569860;

	private java.lang.Integer    productmodelid;
	private java.lang.String     name;
	private java.lang.String     instructions;
	private java.lang.Integer    locationid;
	private java.math.BigDecimal setuphours;
	private java.math.BigDecimal machinehours;
	private java.math.BigDecimal laborhours;
	private java.lang.Integer    lotsize;
	private java.lang.String     step;
	private java.lang.String     rowguid;
	private java.sql.Timestamp   modifieddate;

	@javax.persistence.Column(name = "ProductModelID")
	public java.lang.Integer getProductmodelid() {
		return this.productmodelid;
	}

	public void setProductmodelid(java.lang.Integer productmodelid) {
		this.productmodelid = productmodelid;
	}

	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "Instructions")
	public java.lang.String getInstructions() {
		return this.instructions;
	}

	public void setInstructions(java.lang.String instructions) {
		this.instructions = instructions;
	}

	@javax.persistence.Column(name = "LocationID")
	public java.lang.Integer getLocationid() {
		return this.locationid;
	}

	public void setLocationid(java.lang.Integer locationid) {
		this.locationid = locationid;
	}

	@javax.persistence.Column(name = "SetupHours")
	public java.math.BigDecimal getSetuphours() {
		return this.setuphours;
	}

	public void setSetuphours(java.math.BigDecimal setuphours) {
		this.setuphours = setuphours;
	}

	@javax.persistence.Column(name = "MachineHours")
	public java.math.BigDecimal getMachinehours() {
		return this.machinehours;
	}

	public void setMachinehours(java.math.BigDecimal machinehours) {
		this.machinehours = machinehours;
	}

	@javax.persistence.Column(name = "LaborHours")
	public java.math.BigDecimal getLaborhours() {
		return this.laborhours;
	}

	public void setLaborhours(java.math.BigDecimal laborhours) {
		this.laborhours = laborhours;
	}

	@javax.persistence.Column(name = "LotSize")
	public java.lang.Integer getLotsize() {
		return this.lotsize;
	}

	public void setLotsize(java.lang.Integer lotsize) {
		this.lotsize = lotsize;
	}

	@javax.persistence.Column(name = "Step")
	public java.lang.String getStep() {
		return this.step;
	}

	public void setStep(java.lang.String step) {
		this.step = step;
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
