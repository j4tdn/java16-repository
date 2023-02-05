package files.dml;

import java.io.File;
import java.util.List;
import util.FileUtils;

/*
 * Doc du lieu tu file
 * + input: file
 * + output: List<String>
 * 		   : List<String> --> List<T>
 */
public class Ex03FileReader {

	private static final String pathname = "text\\trader\\list.txt";

	public static void main(String[] args) {
		File file = new File(pathname);

		List<String> lines = FileUtils.read(file);
		lines.forEach(System.out::println);
	}
}
