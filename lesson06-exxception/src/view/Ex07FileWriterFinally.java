package view;

import java.io.File;
import java.io.IOException;

public class Ex07FileWriterFinally {
	public static void main(String[] args) {

	}
	
	private static File createFile(String pathname) throws IOException {
		File file = new File(pathname);
		if (!file.exists()) {
			file.createNewFile();
			
		}
		return file;
	}
}
