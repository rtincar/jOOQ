
/**
 * This class is generated by minuteproject 4 jOOQ
 */
package org.jooq.mp.derby.test.tables;

import org.jooq.mp.derby.test.tables.records.TBookToBookStoreRecord;
import org.jooq.mp.derby.test.Test;
import org.jooq.mp.derby.test.Keys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.mp.derby.test.TestFactory;
import static org.jooq.mp.derby.test.tables.TBookToBookStore.__T_BOOK_TO_BOOK_STORE;

import org.jooq.Record;
import org.jooq.Result;
import org.junit.Test;

//MP-MANAGED-ADDED-AREA-BEGINNING @import@
//MP-MANAGED-ADDED-AREA-ENDING @import@

//MP-MANAGED-ADDED-AREA-BEGINNING @class-annotation@
//MP-MANAGED-ADDED-AREA-ENDING @class-annotation@
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.4"},
                            comments = "This class is generated by minuteproject 4 jOOQ")
public class TestTBookToBookStore {

	@Test
	public void testTBookToBookStore () {
		Connection conn = null;
		String userName = "TEST";
		String password = "TEST";
		String url = "jdbc:derby://localhost:1527/test;create=true";

		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			TestFactory create = new TestFactory(conn);

//MP-MANAGED-UPDATABLE-BEGINNING-DISABLE @jooq-unittest-testTBookToBookStore-test@
			// write your own tests, just set DISABLE to ENABLE in the comment above
			// future generation will not erase your code ;)
			Result<Record> result = create.select().from(__T_BOOK_TO_BOOK_STORE).limit(1).fetch();
			for (Record r : result) {
                     java.lang.Integer bookId = r.getValue(__T_BOOK_TO_BOOK_STORE.BOOK_ID);
                   java.lang.String bookStoreName = r.getValue(__T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
				System.out.println(
                         "bookId : "+ bookId +
                       "bookStoreName : "+ bookStoreName +
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
