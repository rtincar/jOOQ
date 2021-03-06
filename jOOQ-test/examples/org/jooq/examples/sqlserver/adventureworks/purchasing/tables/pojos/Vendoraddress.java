/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "VendorAddress", schema = "Purchasing", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"VendorID", "AddressID"})
})
public class Vendoraddress implements java.io.Serializable {

	private static final long serialVersionUID = 904355992;

	private java.lang.Integer  vendorid;
	private java.lang.Integer  addressid;
	private java.lang.Integer  addresstypeid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Column(name = "VendorID")
	public java.lang.Integer getVendorid() {
		return this.vendorid;
	}

	public void setVendorid(java.lang.Integer vendorid) {
		this.vendorid = vendorid;
	}

	@javax.persistence.Column(name = "AddressID")
	public java.lang.Integer getAddressid() {
		return this.addressid;
	}

	public void setAddressid(java.lang.Integer addressid) {
		this.addressid = addressid;
	}

	@javax.persistence.Column(name = "AddressTypeID")
	public java.lang.Integer getAddresstypeid() {
		return this.addresstypeid;
	}

	public void setAddresstypeid(java.lang.Integer addresstypeid) {
		this.addresstypeid = addresstypeid;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
