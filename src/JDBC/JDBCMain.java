/**
 * @author Rustom Trayvilla
 * @since June 27, 2025
 * @version 1.0
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Purpose of this class is to connect
 * java to sql using JDBC
 */
public class JDBCMain {

	public static void main(String[] args) {
		String address = "jdbc:mysql://localhost:3306/detectives";
		String user = "tray0019";
		String pass = "2025";
		String script = "select * from detective";
		
		/*
		 * Method for Database Connectivity
		 */
		try(Connection con = DriverManager.getConnection(address,user,pass);
		PreparedStatement statement = con.prepareStatement(script);
		ResultSet result = statement.executeQuery()){
			
			/*
			 * Print table columns
			 */
			System.out.printf("%-15s%-15s%-15s%n",
					("Detective ID"),
					("FirstName"),
					("LastName"));
			
			/*
			 * Print results
			 */
			while(result.next()) {
				System.out.printf("%-15s%-15s%-15s%n",
						result.getInt("detectiveID"),
						result.getString("detectiveFNAME"),
						result.getString("detectiveLNAME"));
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
