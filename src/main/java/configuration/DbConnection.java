package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {
	private static Connection conn= null;
	private DbConnection() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection() {
		if(conn == null) {
			try {
				Properties props = DbProvider.getDbProps();
				Class.forName(props.getProperty("DRIVER"));
				conn = DriverManager.getConnection(
						props.getProperty("URL"),
						props.getProperty("USER"), props.getProperty("PASS"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	

}
