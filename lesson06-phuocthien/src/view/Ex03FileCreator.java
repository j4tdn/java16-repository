package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreator {
	public static void main(String[] args) {
		try {
			boolean isSuccess = createFile("readme.txt");
			System.out.println("status : "+isSuccess);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static boolean createFile(String path) throws IOException {
		File file = new File(path);
		return file.createNewFile();
		
		
	}

}
