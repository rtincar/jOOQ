/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_725_LOB_TEST", schema = "TEST")
public class T_725_LOB_TEST extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST> {

	private static final long serialVersionUID = -873098775;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true)
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setLOB(byte[] value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.LOB, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LOB")
	public byte[] getLOB() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST.LOB);
	}

	/**
	 * Create a detached T_725_LOB_TEST
	 */
	public T_725_LOB_TEST() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST);
	}
}
