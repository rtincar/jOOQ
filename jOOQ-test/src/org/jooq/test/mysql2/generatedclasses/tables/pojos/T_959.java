/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_959", schema = "test2")
public class T_959 implements java.io.Serializable {

	private static final long serialVersionUID = -1347387041;

	private org.jooq.test.mysql2.generatedclasses.enums.T_959JavaKeywords javaKeywords;

	@javax.persistence.Column(name = "java_keywords")
	public org.jooq.test.mysql2.generatedclasses.enums.T_959JavaKeywords getJavaKeywords() {
		return this.javaKeywords;
	}

	public void setJavaKeywords(org.jooq.test.mysql2.generatedclasses.enums.T_959JavaKeywords javaKeywords) {
		this.javaKeywords = javaKeywords;
	}
}
