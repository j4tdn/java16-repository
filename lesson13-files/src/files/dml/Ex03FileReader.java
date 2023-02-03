package files.dml;

import java.io.File;
import java.util.List;

import files.utils.FileUtils;

/*
 * Doc du lieu tu file
 * + Input: file
 * + Output: List<String>
 */

public class Ex03FileReader {
	private static String pathname = "text\\trader\\list.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> list = FileUtils.read(file);
		list.forEach(System.out::println);
	}
}
