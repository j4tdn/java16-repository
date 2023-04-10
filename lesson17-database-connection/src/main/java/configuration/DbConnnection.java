package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import bean.ItemGroup;
import service.ItemgGroupService;

public class DbConnnection {
	private static Connection conn = null;
	
	private DbConnnection() {
		
	}
	public static Connection getConnection() {
		
			if(conn == null) {
				try {
					Properties props = Dbpropeties.getDbproProperties();
					Class.forName(props.getProperty("DRIVER"));
					  DriverManager.getConnection(
							  props.getProperty("URL"),
							  props.getProperty("USER"),
							  props.getProperty("PASS"));
					 
				} catch (Exception e) {
					// TODO: handle exception
				}
			  
			}
		
		return conn;
	}
	

}
