package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {
	private static Connection conn = null;

	private DbConnection() {

	}

	public static Connection getConnection() {
		if (conn == null) {
			try {
				// B0: Đọc tham số từ file cấu hình
				Properties props = DbProvider.getDbProps();

				// B1: Khai Báo DRIVER(class) đến mysql
				Class.forName(props.getProperty("DRIVER"));

				// B2: Khai báo thông tin database connection
				conn = DriverManager.getConnection(
						props.getProperty("URL"), 
						props.getProperty("USER"),
						props.getProperty("PASS"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
}
