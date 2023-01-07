package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreator {
	public static void main(String[] args) throws Exception {
		try {
			boolean isSuccess = createFile("readme.md");
			System.out.println(isSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean createFile(String pathname) throws Exception {
		File file = new File(pathname);
		if (pathname != null) {
			return file.createNewFile();
		}
		else throw new Exception("Hello");
	}
}
