package waste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Db {
	
	
	@Test
	public static String  getDb(String query,int column) throws  ClassNotFoundException, SQLException {	
	String dbUrl = "jdbc:postgresql://192.168.0.32/Base_4.8.0_2";					
	String username = "postgres";	
   	String password = "password";	
   	String myName=null;
	String query1 =query;// "select acc_no  from dep_mast where acc_no  like'002%' and prd_id=278 order by acc_no desc limit 1";	
    Class.forName("org.postgresql.Driver");			
	Connection con = DriverManager.getConnection(dbUrl,username,password);
   Statement stmt = con.createStatement();					
   ResultSet rs= stmt.executeQuery(query1);
	while (rs.next()){
        		 myName = rs.getString(column);								        
               	
                	
        }	
	con.close();			

		return myName; 	
}
}
