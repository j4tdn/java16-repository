package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreator {
	public static void main(String[] args) {
		try {
			boolean isSuccess = creator("readme.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean creator(String pathname) throws IOException {
		File file = new File(pathname);
		return file.createNewFile();
	}
}
