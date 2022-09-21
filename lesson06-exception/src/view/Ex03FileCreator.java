package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreator {

	public static void main(String[] args) {
		try {
			System.out.println(createFile("createFile"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean createFile(String path) throws IOException {
		File f = new File(path);
		return f.createNewFile();
	}

}
