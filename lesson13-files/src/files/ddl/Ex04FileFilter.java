package files.ddl;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import files.utils.FileUtils;

public class Ex04FileFilter {
	private static String dirpath = "C:\\Users\\WIN 10\\Downloads";
	public static void main(String[] args) {
		File dir = new File(dirpath);
		if (dir.exists()) {
			File[] imageFiles = dir.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File file) {
					return FileUtils.isFile(file, ".pdf") || FileUtils.isFile(file, ".jpg");
				}
			});			
			Arrays.asList(imageFiles).forEach(System.out::println);
			Arrays.asList(imageFiles).forEach(FileUtils::delete);
		} else {
			System.out.println("Dir : " + dir.getName() + " not existed") ;
		}
	}
}
