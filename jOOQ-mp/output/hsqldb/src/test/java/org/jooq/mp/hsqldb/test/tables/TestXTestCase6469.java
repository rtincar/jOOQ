
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.hsqldb.test.tables;

import org.jooq.mp.hsqldb.test.tables.records.XTestCase6469Record;
import org.jooq.mp.hsqldb.test.Test;
import org.jooq.mp.hsqldb.test.Keys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.mp.hsqldb.test.TestFactory;
import static org.jooq.mp.hsqldb.test.tables.XTestCase6469.__X_TEST_CASE_64_69;

import org.jooq.Record;
import org.jooq.Result;
import org.junit.Test;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class TestXTestCase6469 {

	@Test
	public void testXTestCase6469 () {
		Connection conn = null;
		String userName = "sa";
		String password = "";
		String url = "jdbc:hsqldb:hsql://localhost";

		try {
			Class.forName("org.hsqldb.jdbcDriver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			TestFactory create = new TestFactory(conn);

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-unittest-testXTestCase6469-test@
			// write your own tests, just set DISABLE to ENABLE in the comment above
			// future generation will not erase your code ;)
			Result<Record> result = create.select().from(__X_TEST_CASE_64_69).limit(1).fetch();
			for (Record r : result) {
                 java.lang.Integer id = r.getValue(__X_TEST_CASE_64_69.ID);
                   java.lang.Integer unusedId = r.getValue(__X_TEST_CASE_64_69.UNUSED_ID);
				System.out.println(
                     "id : "+ id +
                       "unusedId : "+ unusedId +
                    ""
					);
//MP-MANAGED-UPDATABLE-ENDING
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
    
//MP-MANAGED-ADDED-AREA-BEGINNING @implementation@
//MP-MANAGED-ADDED-AREA-ENDING @implementation@	

}
