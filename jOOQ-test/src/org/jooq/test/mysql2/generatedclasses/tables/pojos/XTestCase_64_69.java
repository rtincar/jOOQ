/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_64_69", schema = "test2")
public class XTestCase_64_69 implements java.io.Serializable {

	private static final long serialVersionUID = 1559308317;

	private java.lang.Integer id;
	private java.lang.Integer unusedId;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "UNUSED_ID")
	public java.lang.Integer getUnusedId() {
		return this.unusedId;
	}

	public void setUnusedId(java.lang.Integer unusedId) {
		this.unusedId = unusedId;
	}
}
