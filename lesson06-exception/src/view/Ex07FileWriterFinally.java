package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07FileWriterFinally {
	public static void main(String[] args) {
		File file = createFile("data.txt");

		writeFile(file);

		System.out.println("Finish ...");
	}

	private static boolean writeFile(File file) {
		FileWriter fw = null;
		try {
			// open
			fw = new FileWriter(file);
			// write file
			fw.write("Item 01\n");
			fw.write("Item 02\n");
			fw.write("Item 03\n");
			fw.write("Item 04\n");
			fw.write("Item 05\n");
			// ...
			fw.write("Item k - 1\n");
			fw.write(5 / 0); // error happened
			fw.write("Item k\n");
			// ...
			fw.write("Item 999\n");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// save and close
			close(fw);
		}

		return true;
	}

	private static void close(FileWriter fw) {
		try {
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static File createFile(String pathname) {
		File file = new File(pathname);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
}
