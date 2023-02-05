package utils;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	private FileUtils() {
		
	}
	public static File create(String pathname) {
		File file = new File(pathname);
		if(!file.exists()) {
			createDir(file.getParent());
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("file" + file.getName() + "is created --> "
				+ (isSuccess ? " successfull" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("file " + file.getName() + " already existed !");
		}
		return file;
	}
	public static boolean delete(String pathname) {
		File file = new File(pathname);
		boolean isdeleted = false;
		if(file.exists()) {
			isdeleted = file.delete();
			System.out.println("File " + isdeleted
					+ " is deleted");			
		}
		return isdeleted;
				
	}
	public static boolean delete(File file) {
		boolean isdeleted = file.delete();
		System.out.println("File '" + file.getName() +" ' is deleted");
		return isdeleted;
	}
	public static File createDir(String dirpath) {
		File dir = new File(dirpath);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(">> Directory " + dir.getPath()
			+ "is created -->" + (isSuccess? "successful" : "fail"));
		}
		else {
			System.out.println(">> Directory '" + dir.getPath()+
					"' already existed.....");
		}
		return dir;
	}

}
