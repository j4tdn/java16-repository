package file.ddl;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	
	//require: parent folder must existed 
	
	private static String pathname = "text\\data\\content.txt";  
	public static void main(String[] args) {
		File file = FileUtils.createrFile(pathname);
		
		System.out.println("File --> " + file.getPath());
		System.out.println("File --> " + file.getAbsolutePath());
		System.out.println("\n... Finished ... ");
	}
}
