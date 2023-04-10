package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {
	private static Connection conn = null;
	
	public DbConnection() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection() {
		if (conn == null) {
			try {
				// B0: Đọc tham số từ file cấu hình
				Properties props = DbProvider.getDbProps();
				
				// B1: Khai báo DRIVER(class) đến mysql
				Class.forName(props.getProperty("DRIVER"));
				
				// B2: Khai báo thông tin database connection
				conn = DriverManager.getConnection(
						props.getProperty("URL"), 
						props.getProperty("USER"),
						props.getProperty("PASS"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
