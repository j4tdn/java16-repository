package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07FileWriterFinally {
	public static void main(String[] args) {
		File file = createFile("data.txt");

		writeFile(file);
		System.out.println("finish ...");
	}

	private static boolean writeFile(File file) {
		FileWriter fw = null;
		try {
			// open file
			fw = new FileWriter(file);

			// write file
			fw.write("Item 01\n");
			fw.write("Item 02\n");
			fw.write("Item 03\n");
			fw.write("Item 04\n");
			// ...
			fw.write("Item k-1\n");
			fw.write("Item k\n");
			// ...
			fw.write("Item 999\n");
			// save and close

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			close(fw);
			//block code luôn đc thưc thi
			//dù try block có bị exception hay không
		}

		return true;
	}

	private static void close(FileWriter fw) {
		try {
			fw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private static File createFile(String partname) {
		File file = new File(partname);
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
