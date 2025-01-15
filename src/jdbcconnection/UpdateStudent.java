package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/StudentDB";
		String user = "postgres";
		String password = "root";

		String updateQuery = "UPDATE students SET age = ? ,name = ? WHERE id = ?";

		try (Connection connection = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

			preparedStatement.setInt(1, 17); // New age
			preparedStatement.setString(2, "Samer"); //new name
			preparedStatement.setInt(3, 2); // Student ID

			int rowsUpdated = preparedStatement.executeUpdate();
			System.out.println(rowsUpdated + " student(s) updated successfully.");
		} catch (SQLException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
