
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables.records;

import org.jooq.impl.UpdatableRecordImpl;

import org.jooq.mp.oracle.test.tables.VLibrary;
import org.jooq.mp.oracle.test.Test;
import org.jooq.mp.oracle.test.Keys;
import java.sql.*;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class VLibraryRecord extends UpdatableRecordImpl<org.jooq.mp.oracle.test.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 123456789;

//many2many

 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VLibrary.__V_LIBRARY.AUTHOR-test@
	/**
	 * mapping AUTHOR setter
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VLibrary.__V_LIBRARY.AUTHOR, value);
	}
	
	/**
	 * mapping AUTHOR getter
	 */
	public java.lang.String getAuthor() {
		return getValue(org.jooq.mp.oracle.test.tables.VLibrary.__V_LIBRARY.AUTHOR);
	}
	
//MP-MANAGED-UPDATABLE-ENDING
 //MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-record-attribute-org.jooq.mp.oracle.test.tables.VLibrary.__V_LIBRARY.TITLE-test@
	/**
	 * mapping TITLE setter
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.mp.oracle.test.tables.VLibrary.__V_LIBRARY.TITLE, value);
	}
	
	/**
	 * mapping TITLE getter
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.mp.oracle.test.tables.VLibrary.__V_LIBRARY.TITLE);
	}
	
//MP-MANAGED-UPDATABLE-ENDING

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.mp.oracle.test.tables.VLibrary.__V_LIBRARY);
	}

//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@

}
