/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ContactCreditCard", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ContactID", "CreditCardID"})
})
public class ContactcreditcardRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactcreditcardRecord> {

	private static final long serialVersionUID = -924548417;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.ContactCreditCard.ContactID]
	 * REFERENCES Contact [Person.Contact.ContactID]
	 * </pre></code>
	 */
	public void setContactid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.CONTACTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.ContactCreditCard.ContactID]
	 * REFERENCES Contact [Person.Contact.ContactID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ContactID")
	public java.lang.Integer getContactid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.CONTACTID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.ContactCreditCard.CreditCardID]
	 * REFERENCES CreditCard [Sales.CreditCard.CreditCardID]
	 * </pre></code>
	 */
	public void setCreditcardid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.CREDITCARDID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.ContactCreditCard.CreditCardID]
	 * REFERENCES CreditCard [Sales.CreditCard.CreditCardID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CreditCardID")
	public java.lang.Integer getCreditcardid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.CREDITCARDID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD.MODIFIEDDATE);
	}

	/**
	 * Create a detached ContactcreditcardRecord
	 */
	public ContactcreditcardRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.Contactcreditcard.CONTACTCREDITCARD);
	}
}
