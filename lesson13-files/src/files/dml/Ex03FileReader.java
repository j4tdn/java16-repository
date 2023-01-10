package files.dml;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import util.FileUtils;

/*
 * Đọc dữ liệu từ file
 * + Input: file
 * + Output: List<String> 
 */

public class Ex03FileReader {
	private static final String pathname = "text\\trader\\list.txt";
	public static void main(String[] args) {
		
		File file = new File(pathname);
		
		List<String> lines = FileUtils.read(file);
		
		lines.forEach(System.out::println);
		

	}
}
