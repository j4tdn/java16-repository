package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {

	private static Connection conn;

	private DbConnection() {
	}

	public static Connection getConnection() {
		if (conn == null) {

			// B0: Đọc tham số file cấu hình
			Properties props = DbProvider.getDbProps();

			try {
				// B1: Khai báo Driver đến MySQL
				Class.forName(props.getProperty("DRIVER"));

				// B2: Khai báo thông tin database connection
				conn = DriverManager.getConnection(props.getProperty("URL"), 
												   props.getProperty("USER"),
												   props.getProperty("PASS"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
