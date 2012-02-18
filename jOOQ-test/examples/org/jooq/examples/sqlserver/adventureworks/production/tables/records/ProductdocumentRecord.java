/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductDocument", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductID", "DocumentID"})
})
public class ProductdocumentRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord> {

	private static final long serialVersionUID = 1550378312;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductDocument_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.PRODUCTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductDocument_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID")
	public java.lang.Integer getProductid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.PRODUCTID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductDocument_Document_DocumentID
	 * FOREIGN KEY (DocumentID)
	 * REFERENCES Production.Document (DocumentID)
	 * </pre></code>
	 */
	public void setDocumentid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.DOCUMENTID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductDocument_Document_DocumentID
	 * FOREIGN KEY (DocumentID)
	 * REFERENCES Production.Document (DocumentID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "DocumentID")
	public java.lang.Integer getDocumentid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.DOCUMENTID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.MODIFIEDDATE);
	}

	/**
	 * Create a detached ProductdocumentRecord
	 */
	public ProductdocumentRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT);
	}
}
