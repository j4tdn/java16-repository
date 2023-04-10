package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DbProvider {
	
	//src/main/resources --> classpath
	private static String path = "db-config.properties";
	
	public static Properties getDbProps() {
		Properties props = new Properties();
		
		try {
			props.load(new FileInputStream(new File(path)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return props;
	}
}
