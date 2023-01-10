package file.ddl;

import java.io.File;
import java.util.Arrays;

import util.FileUtils;

public class Ex04FileFilter {
	private static String dirpath = "C:\\Users\\Thanh Nhat\\Downloads";
	
	public static void main(String[] args) {
		File dir = new File(dirpath);
		if (dir.exists()) {
			File[] xmlFiles = dir.listFiles(file -> FileUtils.isFile(file, "xml"));
			Arrays.stream(xmlFiles).forEach(FileUtils::delete);
			
		} else {
			System.out.println("Dir '" + dir.getName() + "'not exits ..." );
		}
	}
}
