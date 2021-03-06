/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class CategoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord> {

	private static final long serialVersionUID = -1221034988;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setCategoryId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY.CATEGORY_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Byte getCategoryId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY.CATEGORY_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> fetchFilmCategoryList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY)
			.where(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.CATEGORY_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY.CATEGORY_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY.LAST_UPDATE);
	}

	/**
	 * Create a detached CategoryRecord
	 */
	public CategoryRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY);
	}
}
