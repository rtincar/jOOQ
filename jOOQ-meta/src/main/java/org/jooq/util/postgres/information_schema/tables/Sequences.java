/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Sequences extends org.jooq.impl.TableImpl<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord> {

	private static final long serialVersionUID = -1902710118;

	/**
	 * The singleton instance of sequences
	 */
	public static final org.jooq.util.postgres.information_schema.tables.Sequences SEQUENCES = new org.jooq.util.postgres.information_schema.tables.Sequences();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord> __RECORD_TYPE = org.jooq.util.postgres.information_schema.tables.records.SequencesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.String> SEQUENCE_CATALOG = createField("sequence_catalog", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.String> SEQUENCE_SCHEMA = createField("sequence_schema", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.String> SEQUENCE_NAME = createField("sequence_name", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.Integer> MAXIMUM_VALUE = createField("maximum_value", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.Integer> MINIMUM_VALUE = createField("minimum_value", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.Integer> INCREMENT = createField("increment", org.jooq.impl.SQLDataType.INTEGER, SEQUENCES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.SequencesRecord, java.lang.String> CYCLE_OPTION = createField("cycle_option", org.jooq.impl.SQLDataType.VARCHAR, SEQUENCES);

	/**
	 * No further instances allowed
	 */
	private Sequences() {
		super("sequences", org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
