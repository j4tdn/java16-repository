package files.ddl;

import java.io.File;

public class Ex02DirCreator {
	// dirpath --> root --> mkdir, mkdirs
	// dirpath --> root\\image -->  mkdirs
	private static String dirpath = "root\\images";
	public static void main(String[] args) {
		File dir = new File(dirpath);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(">> Directory '"+dir.getPath()+ "' is created --> " + (isSuccess ? "success":"fail"));
		}
		System.out.println("\n...***Finished***...");
	}
}