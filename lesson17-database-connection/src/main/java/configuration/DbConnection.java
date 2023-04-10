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
				// B0: Doc tham so tu file cau hinh
				Properties props = DbProvider.getDbProps();
				
				// B1: KHai bao DRIVER den mysql
				Class.forName(props.getProperty("DRIVER"));
				// B2: Khai bao thong tin database connection
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
