package files.ddl;

import java.io.File;
import java.util.Arrays;

import utils.FileUtils;

public class Ex04FileFilter {
	private static String dirpath = "D:\\HK1";
	public static void main(String[] args) {
		File dir = new File(dirpath);
		if(dir.exists()) {
			File[] pdfFiles = dir.listFiles(file -> FileUtils.isFile(file,"pdf"));
			Arrays.stream(pdfFiles).forEach(FileUtils::deleteFile); 
//			Arrays.stream(dir.listFiles(file -> FileUtils.isFile(file, "pdf")))
//					.forEach(FileUtils::deleteFile);
		}else {
			System.out.println("dir '" + dir.getName() + "' not exist...");
		}
	}

}
