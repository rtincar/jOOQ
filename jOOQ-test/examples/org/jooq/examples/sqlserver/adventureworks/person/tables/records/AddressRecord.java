/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Address", schema = "Person")
public class AddressRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressRecord> {

	private static final long serialVersionUID = -2082331920;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setAddressid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.ADDRESSID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "AddressID", unique = true)
	public java.lang.Integer getAddressid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.ADDRESSID);
	}

	/**
	 * An uncommented item
	 */
	public void setAddressline1(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.ADDRESSLINE1, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "AddressLine1")
	public java.lang.String getAddressline1() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.ADDRESSLINE1);
	}

	/**
	 * An uncommented item
	 */
	public void setAddressline2(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.ADDRESSLINE2, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "AddressLine2")
	public java.lang.String getAddressline2() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.ADDRESSLINE2);
	}

	/**
	 * An uncommented item
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.CITY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "City")
	public java.lang.String getCity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.CITY);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_Address_StateProvince_StateProvinceID
	 * FOREIGN KEY (StateProvinceID)
	 * REFERENCES Person.StateProvince (StateProvinceID)
	 * </pre></code>
	 */
	public void setStateprovinceid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.STATEPROVINCEID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_Address_StateProvince_StateProvinceID
	 * FOREIGN KEY (StateProvinceID)
	 * REFERENCES Person.StateProvince (StateProvinceID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "StateProvinceID")
	public java.lang.Integer getStateprovinceid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.STATEPROVINCEID);
	}

	/**
	 * An uncommented item
	 */
	public void setPostalcode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.POSTALCODE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PostalCode")
	public java.lang.String getPostalcode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.POSTALCODE);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS.MODIFIEDDATE);
	}

	/**
	 * Create a detached AddressRecord
	 */
	public AddressRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.person.tables.Address.ADDRESS);
	}
}
