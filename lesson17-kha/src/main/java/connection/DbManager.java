package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
	private static Connection connection;

	private DbManager() {
	};

	public static Connection getConnection() {
		if (connection == null) {

			Properties props = DbProvider.getProps();
			try {
				// 1. Provide driver
				Class.forName(props.getProperty("DRIVER"));
				// 2. Provide database Info
				connection = DriverManager.getConnection(props.getProperty("URL"), props.getProperty("USERNAME"),
						props.getProperty("PASSWORD"));
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
