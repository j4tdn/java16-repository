package connection;

import java.sql.Connection;
import java.sql.DriverManager;



public class DbConnection {
	private static Connection connection = null;

	public static void main(String[] args) {
		System.out.println("----->" + getConnection());
	}

	public static Connection getConnection() {
		if (connection == null) {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/java16_shopping", "root",
						"trungpro767");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return connection;
	}
}
