package files.ddl;

import java.io.File;
import files.utils.FileUtils;

public class Ex01FileCreator {
	
	// * path to current project
	// pathname : file name => content.txt 
	// pathname : path to file name => data/content.txt
	// * path to computer disc
	//pathname : D:/data/content.txt
	
	private static String pathname = "text\\data\\context2.txt";
	public static void main(String[] args) {
		FileUtils.delete(pathname);
		File file = FileUtils.createFile(pathname);
		if (file.exists()) {
			
		}
		System.out.println("File.separator => " + File.separator);
	}
}
