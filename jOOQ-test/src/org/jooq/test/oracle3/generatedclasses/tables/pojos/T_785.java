/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_785", schema = "TEST")
public class T_785 implements java.io.Serializable {

	private static final long serialVersionUID = 1087981877;

	private java.lang.Integer ID;
	private java.lang.String  NAME;
	private java.lang.String  VALUE;

	@javax.persistence.Column(name = "ID")
	public java.lang.Integer getID() {
		return this.ID;
	}

	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "NAME")
	public java.lang.String getNAME() {
		return this.NAME;
	}

	public void setNAME(java.lang.String NAME) {
		this.NAME = NAME;
	}

	@javax.persistence.Column(name = "VALUE")
	public java.lang.String getVALUE() {
		return this.VALUE;
	}

	public void setVALUE(java.lang.String VALUE) {
		this.VALUE = VALUE;
	}
}
