/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ShipMethod", schema = "Purchasing")
public class Shipmethod implements java.io.Serializable {

	private static final long serialVersionUID = 2016849817;

	private java.lang.Integer    shipmethodid;
	private java.lang.String     name;
	private java.math.BigDecimal shipbase;
	private java.math.BigDecimal shiprate;
	private java.lang.String     rowguid;
	private java.sql.Timestamp   modifieddate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ShipMethodID", unique = true)
	public java.lang.Integer getShipmethodid() {
		return this.shipmethodid;
	}

	public void setShipmethodid(java.lang.Integer shipmethodid) {
		this.shipmethodid = shipmethodid;
	}

	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "ShipBase")
	public java.math.BigDecimal getShipbase() {
		return this.shipbase;
	}

	public void setShipbase(java.math.BigDecimal shipbase) {
		this.shipbase = shipbase;
	}

	@javax.persistence.Column(name = "ShipRate")
	public java.math.BigDecimal getShiprate() {
		return this.shiprate;
	}

	public void setShiprate(java.math.BigDecimal shiprate) {
		this.shiprate = shiprate;
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
