package file.ddl;

import java.io.File;

public class Ex02DirCreator {
	// dir path --> root  --> mkdir, mkdirs
	// dir path --> root\\image --> mkdirs
	
	private static String dirpath = "root\\image";

	public static void main(String[] args) {
		File dir = new File(dirpath);
		
		if (!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(">> Directory '" + dir.getPath() 
					+ "' is created --> " + (isSuccess ? " success " : " fail" ));
		}
		System.out.println("\n...Finish...");
	}
}
