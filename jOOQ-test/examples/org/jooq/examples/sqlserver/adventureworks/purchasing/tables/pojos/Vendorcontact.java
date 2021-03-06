/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "VendorContact", schema = "Purchasing", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"VendorID", "ContactID"})
})
public class Vendorcontact implements java.io.Serializable {

	private static final long serialVersionUID = 1575655116;

	private java.lang.Integer  vendorid;
	private java.lang.Integer  contactid;
	private java.lang.Integer  contacttypeid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Column(name = "VendorID")
	public java.lang.Integer getVendorid() {
		return this.vendorid;
	}

	public void setVendorid(java.lang.Integer vendorid) {
		this.vendorid = vendorid;
	}

	@javax.persistence.Column(name = "ContactID")
	public java.lang.Integer getContactid() {
		return this.contactid;
	}

	public void setContactid(java.lang.Integer contactid) {
		this.contactid = contactid;
	}

	@javax.persistence.Column(name = "ContactTypeID")
	public java.lang.Integer getContacttypeid() {
		return this.contacttypeid;
	}

	public void setContacttypeid(java.lang.Integer contacttypeid) {
		this.contacttypeid = contacttypeid;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
