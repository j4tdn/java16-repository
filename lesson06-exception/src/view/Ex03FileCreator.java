package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreator {
	public static void main(String[] args) {
		try {
			boolean isSucces = createFile("readme.txt");
			System.out.println("isussec" + isSucces);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static boolean createFile(String path) throws IOException {
		File file = new File(path);
		return file.createNewFile();
		
	}

}
