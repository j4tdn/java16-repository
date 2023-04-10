package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Dbpropeties {
	private static String path = "dbconfig.propeties";
	public static Properties getDbproProperties() {
		Properties props = new Properties();
		InputStream is;
		try {
			is = new FileInputStream(new File(path));
			System.out.println(1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return props;
	}

}
