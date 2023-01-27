package file.dml;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import utils.FileUtils;
/**
 * Ghi dữ liệu vào file txt
 * 
 * + Input: String , List<String> , file
 * + Output: void
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
		
		FileUtils.writeLines(file, lines);
		
		System.out.println(".... *** Finished *** ...");
	}
}
