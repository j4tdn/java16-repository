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
				Properties props = DbProvider.getDbProps();
				
				// B1 : Khai báo DRIVER đến mysql
				Class.forName(props.getProperty("DRIVER"));
				conn = DriverManager.getConnection(
						props.getProperty("URL"),
						props.getProperty("USER"),
						props.getProperty("PASS"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			// B2 : Khai báo thông tin database connection

		}
		return conn;
	}

	public static void main(String[] args) {
		Connection c1 = getConnection();
		System.out.println("c1 ---> "+c1);
	}

}
