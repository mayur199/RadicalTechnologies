package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/StudentDB";
		String user = "postgres";
		String password = "root";

		String insertQuery = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			
			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "Top");
			preparedStatement.setInt(3, 28);

			int rowsInserted = preparedStatement.executeUpdate();
			System.out.println(rowsInserted + " student inserted successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
