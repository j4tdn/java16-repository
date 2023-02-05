package files.ddl;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;


public class Ex01FileCreator {
	
	private static String pathname = "text\\data\\content.txt";
	
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		System.out.println("File--> " + file.getPath());
		System.out.println("File--> " + file.getAbsolutePath());
		System.out.println("Finish!!");
		//FileUtils.deleteFile(pathname);
		
		
		
	}

}
