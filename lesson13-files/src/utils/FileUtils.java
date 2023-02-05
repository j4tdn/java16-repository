package utils;

import java.io.File;

public class FileUtils {
	private FileUtils() {
		
	}
	public static boolean delete(File file) {
		boolean isDeleted = file.delete();
		System.out.println("");
		return isDeleted;
	}
}
