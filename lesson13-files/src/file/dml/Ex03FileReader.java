package file.dml;

import java.io.File;
import java.util.List;

import utils.FileUtils;

/*
 * Đọc dữ liệu từ file
 * + Input: file
 * + Output: List<String>
 *           List<String> => List<T>
 */

public class Ex03FileReader {
	private static final String pathname = "text\\list.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		
		List<String> lines = FileUtils.read(file);
		
		lines.forEach(System.out::println);
		
	}

}
