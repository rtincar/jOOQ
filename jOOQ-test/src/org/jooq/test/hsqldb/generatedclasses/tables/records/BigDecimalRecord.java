/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class BigDecimalRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord> {

	private static final long serialVersionUID = 1451309006;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setOther(java.math.BigInteger value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL.OTHER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigInteger getOther() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL.OTHER);
	}

	/**
	 * Create a detached BigDecimalRecord
	 */
	public BigDecimalRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL);
	}
}
