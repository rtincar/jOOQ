/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_triggers", schema = "test2")
public class TTriggers implements java.io.Serializable {

	private static final long serialVersionUID = -2517163;

	private java.lang.Integer idGenerated;
	private java.lang.Integer id;
	private java.lang.Integer counter;

	@javax.persistence.Id
	@javax.persistence.Column(name = "id_generated", unique = true)
	public java.lang.Integer getIdGenerated() {
		return this.idGenerated;
	}

	public void setIdGenerated(java.lang.Integer idGenerated) {
		this.idGenerated = idGenerated;
	}

	@javax.persistence.Column(name = "id")
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "counter")
	public java.lang.Integer getCounter() {
		return this.counter;
	}

	public void setCounter(java.lang.Integer counter) {
		this.counter = counter;
	}
}
