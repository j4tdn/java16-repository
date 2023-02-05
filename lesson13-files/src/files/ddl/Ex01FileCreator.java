package files.ddl;

import java.io.File;

import utils.FileUtils;

public class Ex01FileCreator {
	
	// pathname: filename
	// pathname: path to file name -> data/content.txt
	
	// --> path to computer disc
	// pathname: d:/data/content.txt
	private static String pathname = "text\\data\\content.txt";
	public static void main(String[] args) {

		File file = FileUtils.createFile(pathname);
	    //FileUtils.delete(pathname);
		System.out.println("file -> " + file.getPath());
		System.out.println("file --> " + file.getParentFile());
		System.out.println("Finished");
	}
}
