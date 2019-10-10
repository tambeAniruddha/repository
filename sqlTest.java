package scripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String query = "select *  from employee";

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionUrl = "jdbc:sqlserver://localhost;database=AdventureWorks2012;" ; 
		Connection con = DriverManager.getConnection(connectionUrl,"dbms","11@@ATc.");  
		
	   //Create Statement Object		
 	   Statement stmt = con.createStatement();	
 	   
 	   // Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);
		
	   // While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String myName = rs.getString(1);								        
                    String myAge = rs.getString(2);					                               
                    System. out.println(myName+"  "+myAge);		
            }		
	   // closing DB Connection		
	    con.close();	
		
	}

}
