package file.ddl;

import java.io.File;

public class Ex02DirCreator {
	private static String dirpath = "root";
	public static void main(String[] args) {
		File dir = new File(dirpath);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println(">> Directory " + dir.getPath()
			+ "is created -->" + (isSuccess? "successful" : "fail"));
		}
	}

}
