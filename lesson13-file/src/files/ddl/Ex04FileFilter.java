package files.ddl;

import java.io.File;
import java.util.Arrays;

import utils.FileUtils;

public class Ex04FileFilter {
	private static String dirpath = "";
	public static void main(String[] args) {
		File dir = new File(dirpath);
		if(dir.exists()) {
			File [] dpfFiles= dir.listFiles(
			file ->FileUtils.isFile(file,"pdf"));
			Arrays.stream(dpfFiles).forEach(FileUtils::delete);
		}else {
			System.out.println("not exist");
		}
	}

}
