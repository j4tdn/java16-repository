package file.ddl;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import utils.FileUtils;

public class Ex04FileFilter {
	private static String dirPath = "C:\\Users\\Admin\\Downloads";
	public static void main(String[] args) {
		File dir = new File(dirPath);
		if(dir.exists()) {
			Arrays.stream(dir.listFiles(file -> FileUtils.isFile(file, "pptx")))
			.forEach(ppt -> FileUtils.delete(ppt));
		}
	}

}
