import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/employees_database";
		try {
			Connection connection = DriverManager.getConnection(url, "root", "1234");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
			int salaryTotal = 0;
			while (resultSet.next()) {
				// System.out.println(resultSet.getString("name"));
				salaryTotal = salaryTotal + resultSet.getInt("salary");
				//salaryTotal = salaryTotal + Integer.parseInt(resultSet.getString("salary"));
				
			}
			System.out.println(salaryTotal);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
