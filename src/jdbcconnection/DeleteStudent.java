package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/StudentDB";
		String user = "postgres";
		String password = "root";

		String deleteQuery = "DELETE FROM students WHERE id = ?";

		try (Connection connection = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {

			preparedStatement.setInt(1, 1); // Student ID to delete

			int rowsDeleted = preparedStatement.executeUpdate();
			System.out.println(rowsDeleted + " student(s) deleted successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
