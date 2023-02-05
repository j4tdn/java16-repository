package file.dml;

import java.io.File;
import java.util.List;

import utils.FileUtils;

/*
 * Ghi dữ liệu vào file txt
 * + Input: String, List<String>, File
 * + Output: void
 */

public class Ex01FileWriter {
	private static final String pathname = "content.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> lines = List.of(
				"1. Le Van Teo",
				"2. John Smith",
				"3. Susan");
	
		FileUtils.writeLines(file, lines);
	}

}
