package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DbProvider {
	private static String path="./src/main/resources/db-config.properties";
	public static Properties getDpProps() {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File(path)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}
