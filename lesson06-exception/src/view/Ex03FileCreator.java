package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreator {

	public static void main(String[] args) {
		try {
			boolean isSuccess = createFile("readme.txt");
			System.out.println("isSuccess --> " + isSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Finish...");

	}

	private static boolean createFile(String pathname) throws IOException {
		File file = new File(pathname);
		return file.createNewFile();
	}

}
