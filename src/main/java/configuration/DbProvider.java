package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DbProvider {
	private static String path = "db-config.properties";
	public static Properties getDbProps() {
		Properties props = new Properties();
		try {
			
			props.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
	}

}
