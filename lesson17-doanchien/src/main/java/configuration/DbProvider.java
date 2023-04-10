package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DbProvider {
	private static String path = "db-config.properties";

	public static Properties getDbProps() {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(path)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return props;
	}
	
}
