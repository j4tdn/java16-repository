package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07FileWriterFinally {
	public static void main(String[] args) {
		File file = createFile("data.txt");
		writeFile(file);
		System.out.println("Finished...");
	}

	private static boolean writeFile(File file) {
		FileWriter fw = null;
		try {
			// open file
			fw = new FileWriter(file);
			// write file
			fw.write("Item 01 \n");
			fw.write("Item 02 \n");
			fw.write("Item 03 \n");
			fw.write("Item 04 \n");
			fw.write("Item 05 \n");
			fw.write("Item 06 \n");
			fw.write(5 / 0);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// block code here is always executed despite our handling exception
			close(fw);
		}
		return true;
	}

	private static void close(FileWriter fw) {
		// close file
		try {
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static File createFile(String pathName) {
		File file = new File(pathName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return file;
	}
}
