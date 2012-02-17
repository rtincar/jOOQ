
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.oracle.test.tables;

import org.jooq.mp.oracle.test.tables.records.XTestCase71Record;
import org.jooq.mp.oracle.test.Test;
import org.jooq.mp.oracle.test.Keys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.mp.oracle.test.TestFactory;
import static org.jooq.mp.oracle.test.tables.XTestCase71.__X_TEST_CASE_71;

import org.jooq.Record;
import org.jooq.Result;
import org.junit.Test;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class TestXTestCase71 {

	@Test
	public void testXTestCase71 () {
		Connection conn = null;
		String userName = "TEST";
		String password = "TEST";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			TestFactory create = new TestFactory(conn);

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-unittest-testXTestCase71-test@
			// write your own tests, just set DISABLE to ENABLE in the comment above
			// future generation will not erase your code ;)
			Result<Record> result = create.select().from(__X_TEST_CASE_71).limit(1).fetch();
			for (Record r : result) {
                 java.lang.Long id = r.getValue(__X_TEST_CASE_71.ID);
                   java.lang.Long testCase6469Id = r.getValue(__X_TEST_CASE_71.TEST_CASE_64_69_ID);
				System.out.println(
                     "id : "+ id +
                       "testCase6469Id : "+ testCase6469Id +
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
