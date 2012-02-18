/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOLEANS", schema = "TEST")
public class TBooleansRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = 1302763064;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setOneZero(org.jooq.test.oracle.generatedclasses.test.enums.Boolean_10 value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.ONE_ZERO, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ONE_ZERO")
	public org.jooq.test.oracle.generatedclasses.test.enums.Boolean_10 getOneZero() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.ONE_ZERO);
	}

	/**
	 * An uncommented item
	 */
	public void setTrueFalseLc(org.jooq.test.oracle.generatedclasses.test.enums.BooleanTrueFalseLc value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_LC, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_LC")
	public org.jooq.test.oracle.generatedclasses.test.enums.BooleanTrueFalseLc getTrueFalseLc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_LC);
	}

	/**
	 * An uncommented item
	 */
	public void setTrueFalseUc(org.jooq.test.oracle.generatedclasses.test.enums.BooleanTrueFalseUc value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_UC, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_UC")
	public org.jooq.test.oracle.generatedclasses.test.enums.BooleanTrueFalseUc getTrueFalseUc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_UC);
	}

	/**
	 * An uncommented item
	 */
	public void setYesNoLc(org.jooq.test.oracle.generatedclasses.test.enums.BooleanYesNoLc value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.YES_NO_LC, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "YES_NO_LC")
	public org.jooq.test.oracle.generatedclasses.test.enums.BooleanYesNoLc getYesNoLc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.YES_NO_LC);
	}

	/**
	 * An uncommented item
	 */
	public void setYesNoUc(org.jooq.test.oracle.generatedclasses.test.enums.BooleanYesNoUc value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.YES_NO_UC, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "YES_NO_UC")
	public org.jooq.test.oracle.generatedclasses.test.enums.BooleanYesNoUc getYesNoUc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.YES_NO_UC);
	}

	/**
	 * An uncommented item
	 */
	public void setYNLc(org.jooq.test.oracle.generatedclasses.test.enums.BooleanYnLc value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.Y_N_LC, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Y_N_LC")
	public org.jooq.test.oracle.generatedclasses.test.enums.BooleanYnLc getYNLc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.Y_N_LC);
	}

	/**
	 * An uncommented item
	 */
	public void setYNUc(org.jooq.test.oracle.generatedclasses.test.enums.BooleanYnUc value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.Y_N_UC, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Y_N_UC")
	public org.jooq.test.oracle.generatedclasses.test.enums.BooleanYnUc getYNUc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.Y_N_UC);
	}

	/**
	 * An uncommented item
	 */
	public void setVcBoolean(java.lang.Boolean value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.VC_BOOLEAN, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "VC_BOOLEAN")
	public java.lang.Boolean getVcBoolean() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.VC_BOOLEAN);
	}

	/**
	 * An uncommented item
	 */
	public void setCBoolean(java.lang.Boolean value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.C_BOOLEAN, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "C_BOOLEAN")
	public java.lang.Boolean getCBoolean() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.C_BOOLEAN);
	}

	/**
	 * An uncommented item
	 */
	public void setNBoolean(java.lang.Boolean value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.N_BOOLEAN, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "N_BOOLEAN")
	public java.lang.Boolean getNBoolean() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.N_BOOLEAN);
	}

	/**
	 * Create a detached TBooleansRecord
	 */
	public TBooleansRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS);
	}
}
