/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "StoreContact", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"CustomerID", "ContactID"})
})
public class Storecontact implements java.io.Serializable {

	private static final long serialVersionUID = -1489695580;

	private java.lang.Integer  customerid;
	private java.lang.Integer  contactid;
	private java.lang.Integer  contacttypeid;
	private java.lang.String   rowguid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Column(name = "CustomerID")
	public java.lang.Integer getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(java.lang.Integer customerid) {
		this.customerid = customerid;
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
