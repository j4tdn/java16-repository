package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {
	private static Connection conn =null;
	
	public DbConnection() {
	}
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
				Properties props = DbProvider.getDbProps();
				Class.forName(props.getProperty("DRIVER"));
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
	
//	public static void main(String[] args) {
//		Connection c1 = getConnection();
//		System.out.println(c1);
//	}
}
