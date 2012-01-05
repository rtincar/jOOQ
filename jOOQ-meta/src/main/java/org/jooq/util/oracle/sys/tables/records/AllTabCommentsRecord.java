/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * Comments on tables and views accessible to the user
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class AllTabCommentsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.oracle.sys.tables.records.AllTabCommentsRecord> {

	private static final long serialVersionUID = -806120450;

	/**
	 * Owner of the object
	 */
	public void setOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS.OWNER, value);
	}

	/**
	 * Owner of the object
	 */
	public java.lang.String getOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS.OWNER);
	}

	/**
	 * Name of the object
	 */
	public void setTableName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS.TABLE_NAME, value);
	}

	/**
	 * Name of the object
	 */
	public java.lang.String getTableName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS.TABLE_NAME);
	}

	/**
	 * Type of the object
	 */
	public void setTableType(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS.TABLE_TYPE, value);
	}

	/**
	 * Type of the object
	 */
	public java.lang.String getTableType() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS.TABLE_TYPE);
	}

	/**
	 * Comment on the object
	 */
	public void setComments(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS.COMMENTS, value);
	}

	/**
	 * Comment on the object
	 */
	public java.lang.String getComments() {
		return getValue(org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS.COMMENTS);
	}

	/**
	 * Create a detached AllTabCommentsRecord
	 */
	public AllTabCommentsRecord() {
		super(org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS);
	}
}
