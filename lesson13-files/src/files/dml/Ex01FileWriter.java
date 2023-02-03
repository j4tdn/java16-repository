package files.dml;

import java.io.File;
import java.util.List;

import files.utils.FileUtils;
/*
 * Ghi du lieu vao file txt
 * + Input: String, List<String>, File
 * + Output: void
 */

public class Ex01FileWriter {
	private static final String pathname = "context.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> lines = List.of(
			"1. Hi Leo",
			"2. John Smith",
			"3. Jasmine Tran",
			"4. Lala Lee"
		);
				
		FileUtils.writeLines(file, lines);
	}
}
