package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEmployeeDemo {

	public static void main(String[] args) {
		// step 1
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
//			String query = "select * from employee";
			String query = "select emp_id, emp_name, emp_salary, dept_name from employee e inner join department d on e.dept_id = d.dept_id";
			// boolean result = stmt.execute(query) - DDL
			// int rowsAffected = stmt.executeUpdate(query) - DML
			// ResultSet rs = stmt.executeQuery(query) - select
			ResultSet rs = stmt.executeQuery(query);
			// traverse the rs and take out/print the data
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2)+ "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
			}
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
