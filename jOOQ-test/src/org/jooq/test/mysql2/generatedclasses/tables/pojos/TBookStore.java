/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_book_store", schema = "test2")
public class TBookStore implements java.io.Serializable {

	private static final long serialVersionUID = -81646900;

	private java.lang.String name;

	@javax.persistence.Column(name = "name", unique = true)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
}
