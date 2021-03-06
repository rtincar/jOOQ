/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.u_author_type;

/**
 * This class is generated by jOOQ.
 */
public class GetBooks extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1545914589;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord> SELF = createParameter("SELF", org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.U_AUTHOR_TYPE.getDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord> BOOK1 = createParameter("BOOK1", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord> BOOK2 = createParameter("BOOK2", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord> BOOKS = createParameter("BOOKS", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public GetBooks() {
		super(org.jooq.SQLDialect.ORACLE, "GET_BOOKS", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType.U_AUTHOR_TYPE);

		addInOutParameter(SELF);
		addOutParameter(BOOK1);
		addOutParameter(BOOK2);
		addOutParameter(BOOKS);
	}

	/**
	 * Set the <code>SELF</code> parameter to the routine
	 */
	public void setSelf(org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord value) {
		setValue(SELF, value);
	}

	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAuthorTypeRecord getSelf() {
		return getValue(SELF);
	}

	public org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord getBook1() {
		return getValue(BOOK1);
	}

	public org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord getBook2() {
		return getValue(BOOK2);
	}

	public org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord getBooks() {
		return getValue(BOOKS);
	}
}
