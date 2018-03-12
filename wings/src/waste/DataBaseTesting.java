package waste;

import java.sql.SQLException;

public class DataBaseTesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(Db.getDb("SELECT state  from address  where address_type ='A' and   cust_id  ='DS0000000068'", 1));
	}
}
