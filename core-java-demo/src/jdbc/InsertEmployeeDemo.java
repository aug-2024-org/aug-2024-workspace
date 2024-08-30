package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployeeDemo {

	public static void main(String[] args) {
		// step 1 : Load the driver (this is not required in newer versions of JDBC)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// step 2 : Establish connection to the Database
		// format - "jdbc:oracle:thin:@<ipaddress>:<portnumber>:<SID>"
		String connectionUrl = "jdbc:oracle:thin:@database-1.ckocq7g7ox5w.us-east-2.rds.amazonaws.com:1521:orcl"; // protocol, ipaddress, port
		String userName = "admin";
		String password = "system2024";
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connectionUrl, userName, password);
			System.out.println("Connection Established...");
			// step 3 : Create a statement and execute it
			Statement stmt = conn.createStatement();
			String query = "insert into admin.employee values(109, 'Mary', 35000.0, 502)";
			int rowsAffected = stmt.executeUpdate(query); // 1 H, 1 C, 1 E || 100H, 100C, 100E
			System.out.println(rowsAffected + " rows inserted");
			// step 4 : handle the exception
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// step 5 : close the connection
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
