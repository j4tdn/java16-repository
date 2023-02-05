package files.dml;

import java.io.File;
import java.util.List;

import utils.FileUtils;

/*
 * Ghi dữ liệu vào file txt
 * + Input: String, List<String>
 * 
 */

public class Ex01FileWriter {

	private static final String pathname ="text\\data\\content.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> lines = List.of(
				"1. Le van A",
				"2. Duong Minh Duc",
				"3. Phan van long",
				"4. Le van luyen"
				);
				
	   // FileUtils.write(file, lines);
		FileUtils.open(file);
	}
}
