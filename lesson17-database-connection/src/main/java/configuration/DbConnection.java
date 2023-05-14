package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {
	
	private static Connection conn = null;
	private DbConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() {
		if(conn == null) {
			
			try {
				//B0: đọc tham số từ db-config.properties
				Properties props = DbProvider.getDbProps();
				//B1: khai báo DRIVER(Class) đến MySql
				Class.forName(props.getProperty("DRIVER"));
				//B2: khai báo thông tin database connection
				conn =DriverManager.getConnection(
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
	public static void main(String[] args) {
		Connection c1 = getConnection();
		System.out.println(c1);
	}
	
}
