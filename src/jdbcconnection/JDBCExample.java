package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/TestDB";
		String user = "postgres";
		String password = "root";

		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			System.out.println("Connected to the database!");

			// 1. Insert data into 'departments' table
			String insertDepartment = "INSERT INTO departments (name) VALUES (?)";
			try (PreparedStatement deptStmt = connection.prepareStatement(insertDepartment)) {
//				deptStmt.setString(1, "Computer Science");
//				deptStmt.executeUpdate();
//				deptStmt.setString(1, "Mathematics");
//				deptStmt.executeUpdate();
				deptStmt.setString(1, "IT");
				deptStmt.executeUpdate();
				deptStmt.setString(1, "Physics");
				deptStmt.executeUpdate();
				System.out.println("Departments inserted successfully!");
			}

			// 2. Insert data into 'students' table with a foreign key reference
			String insertStudent = "INSERT INTO students (name, age, department_id) VALUES (?, ?, ?)";
			try (PreparedStatement studentStmt = connection.prepareStatement(insertStudent)) {
//				studentStmt.setString(1, "John Doe");
//				studentStmt.setInt(2, 20);
//				studentStmt.setInt(3, 1); // department_id = 1 (Computer Science)
//				studentStmt.executeUpdate();
//
//				studentStmt.setString(1, "Jane Smith");
//				studentStmt.setInt(2, 22);
//				studentStmt.setInt(3, 2); // department_id = 2 (Mathematics)
//				studentStmt.executeUpdate();

				studentStmt.setString(1, "Tom S");
				studentStmt.setInt(2, 21);
				studentStmt.setInt(3, 3); // department_id = 3 (IT)
				studentStmt.executeUpdate();
				
				studentStmt.setString(1, "Tim");
				studentStmt.setInt(2, 19);
				studentStmt.setInt(3, 4); // department_id = 4 (Physics)
				studentStmt.executeUpdate();
				
				System.out.println("Students inserted successfully!");
			}

			// 3. Fetch data using a JOIN query
			String fetchQuery = "SELECT s.id, s.name, s.age, d.name AS department_name " + "FROM students s "
					+ "JOIN departments d ON s.department_id = d.id";
			try (PreparedStatement fetchStmt = connection.prepareStatement(fetchQuery);
					ResultSet resultSet = fetchStmt.executeQuery()) {

				System.out.println("Students and their Departments:");
				while (resultSet.next()) {
					int studentId = resultSet.getInt("id");
					String studentName = resultSet.getString("name");
					int studentAge = resultSet.getInt("age");
					String departmentName = resultSet.getString("department_name");

					System.out.println("ID: " + studentId + ", Name: " + studentName + ", Age: " + studentAge
							+ ", Department: " + departmentName);
				}
			}

		} catch (SQLException e) {
			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
