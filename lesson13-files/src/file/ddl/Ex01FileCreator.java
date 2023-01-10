package file.ddl;

import java.io.File;
import java.io.IOException;

import util.FileUtils;

public class Ex01FileCreator {
	
	// path to current project
	// pathname: file name --> content.txt
	// pathname: path to file name --> text/data/content.txt
	
	// --> path to computer dish
	// pathname: D:/data.content.txt
	
	// * Require: parent folder must existed
	private static String pathname = "text\\data\\content.txt";
	
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		
		System.out.println("file --> " + file.getPath());
		System.out.println("file --> " + file.getAbsolutePath());
		
		System.out.println("\nFinish!!");
	}
	
	
}
