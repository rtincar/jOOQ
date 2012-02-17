
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.derby.test.tables;

import org.jooq.mp.derby.test.tables.records.T65821Record;
import org.jooq.mp.derby.test.Test;
import org.jooq.mp.derby.test.Keys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.mp.derby.test.TestFactory;
import static org.jooq.mp.derby.test.tables.T65821.__T_658_21;

import org.jooq.Record;
import org.jooq.Result;
import org.junit.Test;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class TestT65821 {

	@Test
	public void testT65821 () {
		Connection conn = null;
		String userName = "TEST";
		String password = "TEST";
		String url = "jdbc:derby://localhost:1527/test;create=true";

		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			TestFactory create = new TestFactory(conn);

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-unittest-testT65821-test@
			// write your own tests, just set DISABLE to ENABLE in the comment above
			// future generation will not erase your code ;)
			Result<Record> result = create.select().from(__T_658_21).limit(1).fetch();
			for (Record r : result) {
                 java.lang.Integer id = r.getValue(__T_658_21.ID);
				System.out.println(
                     "id : "+ id +
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
