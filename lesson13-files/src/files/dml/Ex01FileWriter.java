package files.dml;

import java.io.File;

import util.FileUtils;

/*
 * Ghi du lieu vao file txt
 * 	+ Input: String, List<String>, File
 * 	+ Output: void
 */
public class Ex01FileWriter {

	private static final String pathname = "text\\data\\content.txt";

	public static void main(String[] args) {
		File file = new File(pathname);
		FileUtils.write(file, null);
		System.out.println("***...Finish...***");
	}
}
