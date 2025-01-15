package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDBExample {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/StudentDB";
		String username = "postgres";
		String password = "root";

		try {
			// Load MySQL JDBC Driver
			Class.forName("org.postgresql.Driver");

			// Establish Connection
			Connection conn = DriverManager.getConnection(url, username, password);

			// Insert Query
			String sql = "INSERT INTO Student (id, name, age) VALUES (2, 'J Doe', 21)";
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);

			System.out.println("Data inserted successfully!");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
