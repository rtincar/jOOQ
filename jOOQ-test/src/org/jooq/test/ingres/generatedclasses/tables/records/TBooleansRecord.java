/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TBooleansRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = 181865829;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setOneZero(org.jooq.test.ingres.generatedclasses.enums.Boolean_10 value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.ONE_ZERO, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.ingres.generatedclasses.enums.Boolean_10 getOneZero() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.ONE_ZERO);
	}

	/**
	 * An uncommented item
	 */
	public void setTrueFalseLc(org.jooq.test.ingres.generatedclasses.enums.BooleanTrueFalseLc value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.TRUE_FALSE_LC, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.ingres.generatedclasses.enums.BooleanTrueFalseLc getTrueFalseLc() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.TRUE_FALSE_LC);
	}

	/**
	 * An uncommented item
	 */
	public void setTrueFalseUc(org.jooq.test.ingres.generatedclasses.enums.BooleanTrueFalseUc value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.TRUE_FALSE_UC, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.ingres.generatedclasses.enums.BooleanTrueFalseUc getTrueFalseUc() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.TRUE_FALSE_UC);
	}

	/**
	 * An uncommented item
	 */
	public void setYesNoLc(org.jooq.test.ingres.generatedclasses.enums.BooleanYesNoLc value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.YES_NO_LC, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.ingres.generatedclasses.enums.BooleanYesNoLc getYesNoLc() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.YES_NO_LC);
	}

	/**
	 * An uncommented item
	 */
	public void setYesNoUc(org.jooq.test.ingres.generatedclasses.enums.BooleanYesNoUc value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.YES_NO_UC, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.ingres.generatedclasses.enums.BooleanYesNoUc getYesNoUc() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.YES_NO_UC);
	}

	/**
	 * An uncommented item
	 */
	public void setYNLc(org.jooq.test.ingres.generatedclasses.enums.BooleanYnLc value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.Y_N_LC, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.ingres.generatedclasses.enums.BooleanYnLc getYNLc() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.Y_N_LC);
	}

	/**
	 * An uncommented item
	 */
	public void setYNUc(org.jooq.test.ingres.generatedclasses.enums.BooleanYnUc value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.Y_N_UC, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.ingres.generatedclasses.enums.BooleanYnUc getYNUc() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBooleans.Y_N_UC);
	}

	/**
	 * Create a detached TBooleansRecord
	 */
	public TBooleansRecord() {
		super(org.jooq.test.ingres.generatedclasses.tables.TBooleans.T_BOOLEANS);
	}
}
