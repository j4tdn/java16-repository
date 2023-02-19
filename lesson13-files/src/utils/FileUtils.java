package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
private FileUtils() {
	
}
//text\\data\\content.txt
public static File createFile(String pathname) {
	File file = new File(pathname);
	if (!file.exists()) {
	File parent =	file.getParentFile();
		if(!file.exists()) {
			creaDir(file.getParent());
		}
		try {
			boolean isSuccess = file.createNewFile();
		System.out.println(">> File'" + file.getName()
				+ "'is created -->" 
				+(isSuccess ? "successful" : "fail"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} else {
		System.out.println(">> File" + file.getName()
					+ "' already existed !");
	
	}
	return file;
}
public static File creaDir(String dirpath) {
	File dir = new File(dirpath);
	if (!dir.exists()) {
		boolean isSuccess = dir.mkdirs();
		System.out.println(
				">> Directory' " + dir.getPath()
				+ "'is created --> " 
				+ (isSuccess ? "successful":"fail"));

	}else {
		System.out.println(
				">> Directory' " + dir.getPath()
				+"'already existed ...");
		
	}
	return dir;
}
public static boolean delete(File file) {
	 boolean isDeleted = file.delete();
	 
	 System.out.println(">> File'"+ file.getName()
			 		+ "' is Deleted !!!");
	 
	 return isDeleted;
}
}
