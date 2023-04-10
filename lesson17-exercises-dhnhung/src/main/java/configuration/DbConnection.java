package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.swing.Popup;

public class DbConnection {
	private static Connection conn = null;
	
	public DbConnection() {
	}

	public static Connection getConnection() {
		if(conn == null) {
			try {
				//B0: tham số từ file cấu hình
				Properties props = DbProvider.getDbProps();
				// B1: Khai báo DRIVER đến mysql
				Class.forName(props.getProperty("DRIVER"));
				
				// B1: Khai báo thông tin Database connection
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
	
	public static void main(String[] args) {
		Connection c1 = getConnection();
		System.out.println("c1--> " + c1);
		
	}

}
