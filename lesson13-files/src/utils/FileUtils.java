package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
	private FileUtils() {

	}

	// text\\data\\content.txt
	public static File createFile(String pathname) {
		File file = new File(pathname);
		if (!file.exists()) {
			// ....
			createDir(file.getParent());
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println(">>file " + file.getName() + "is created -->" + (isSuccess ? "successful" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(">>file " + file.getName() + "already existed !");
		}
		System.out.println("--finish--");

		return file;
	}

	public static boolean delete(String pathname) {
		File file = new File(pathname);
		boolean isDeleted = false;
		if (file.exists()) {
			isDeleted = file.delete();
			System.out.println(">> file '" + file.getName() + "'is delete !!!");
		}

		return isDeleted;
	}

	public static boolean delete(File file) {
		boolean isDeleted = file.delete();

		System.out.println(">> file '" + file.getName() + "'is delete !!!");

		return isDeleted;
	}

	public static File createDir(String dirpath) {
		File dir = new File(dirpath);
		if (!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(
					">> Directory " + dir.getParent() + "' is created --> " + (isSuccess ? "successful" : "fail"));
		} else {
			System.out.println(">> Directory " + dir.getParent() + "' already existed --> ");
		}

		return dir;
	}
	
	public static Path rename(Path path) {
		String filename = path.toString();
		return Paths.get(System.currentTimeMillis()
				+ "_l13_"
				+ filename.charAt(0)
				+ filename.charAt(filename.length()-1)
				+ filename.substring(filename.lastIndexOf(".")));
	}

}
