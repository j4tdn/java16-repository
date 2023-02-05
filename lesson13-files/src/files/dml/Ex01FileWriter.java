package files.dml;

import java.io.File;
import java.util.List;

import utils.FileUtils;

/*
 * Ghi du lieu vao file
 * 
 *  + Input: String, List<String>, File
 *  + Output: void 
 */

public class Ex01FileWriter {
	private static final String pathname = "text\\data\\content.txt";

	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> lines = List.of(
				"1. Le Van Teo",
				"2. John Smith",
				"3. Susan",
				"4. Hoang Nam"
				);
		FileUtils.writeLines(file, lines);
		
		System.out.println("\n ... *** Finished *** ...");
	}
}
