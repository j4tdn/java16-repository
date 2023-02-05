package files.dml;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWriter {
/*
 * Ghi dữ liệu vào file txt
 * 
 * + Input: String, List<String>, File
 * + Output: void
 * 
 */
	
	private static final String pathname = "text\\data\\content.txt";
	
	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> lines = List.of(
				"1. Le Van M",
				"2. John Smith",
				"3. Susan",
				"4. Thanh Minh"
				);				
		
		FileUtils.writeLines(file, lines);
		System.out.println("Finish!!!");
	}
}
