package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	// src/main/resources --> classpath
	
	private static String path = "db-config.properties";
	
	public static Properties getDbProps() {
		Properties props = new Properties();
		
		
		try {
			File file = new File (path);
			props.load(new FileInputStream(new File(path)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return props;
	}
}
