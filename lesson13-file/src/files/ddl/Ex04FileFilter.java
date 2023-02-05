package files.ddl;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

import utils.FileUtils;

public class Ex04FileFilter {
	private static String dirpath = "D:\\ttt";
	public static void main(String[] args) {
		File dir = new File(dirpath);
		if(dir.exists()) {
			File[] pdfFiles = dir.listFiles(file -> FileUtils.isFile(file,"pdf"));
			Arrays.stream(pdfFiles).forEach(FileUtils::delete); 
		}else {
			System.out.println("Dir '" + dir.getName() + "' not exxist....");
		}
	}
}
