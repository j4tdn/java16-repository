package files.dml;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

import util.FileUtils;

/*
 * Ghi dữ liệu vào file txt
 *  + Input: String, List<String>, File
 *  + Output: void
 */

public class Ex01FileWriter {
	private static final String pathname = "text\\data\\content.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> lines = List.of(
				"1. Le Van A",
				"2. John Smith",
				"3. Susan",
				"4. Hoang Nam"
				);
		
		FileUtils.writeLine(file, lines);
		System.out.println("...Finish...");
		
	}

}
