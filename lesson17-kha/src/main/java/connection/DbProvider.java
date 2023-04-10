package connection;

import java.io.File;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DbProvider {
	public static String CONFIG_PATH = "config.properties";

	public static Properties getProps() {
		Properties props = new Properties();
		try {
			InputStream is = new FileInputStream(new File(CONFIG_PATH));
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}
