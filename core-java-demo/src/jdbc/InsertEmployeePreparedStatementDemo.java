package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployeePreparedStatementDemo {
	// 3 tyopes of statements
	// 1.Statement
	// 2.PreparedStatement
	// 3.CallableStatement

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
		String connectionUrl = "jdbc:oracle:thin:@database-1.ckocq7g7ox5w.us-east-2.rds.amazonaws.com:1521:orcl"; // protocol,
																													// ipaddress																							// port
		String userName = "admin";
		String password = "system2024";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(connectionUrl, userName, password);
			System.out.println("Connection Established...");
			// step 3 : Create a prepared statement and execute it
			String query = "insert into admin.employee values(?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query); // 1 H, 1 C || 1 H, 1 C
			pstmt.setInt(1, 110);
			pstmt.setString(2, "Micheal Jackson");
			pstmt.setDouble(3, 34000.0);
			pstmt.setInt(4, 502);
			
			int rowsAffected = pstmt.executeUpdate(); // 1 H, 1 E || 100H, 100E
			// step 4 : handle the exception
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
