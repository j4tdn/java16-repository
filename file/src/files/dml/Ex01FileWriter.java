package files.dml;
/*
 * Ghi dữ liệu vào file txt
 * + Input: String, List<String>, file
 * + Output: void
 */

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class Ex01FileWriter {
	private static final String pathname = "text\\data\\content.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> lines = List.of(
				"1. Le Van Teo",
				"2. John Smith",
				"3. Susan");
		if(file.exists()) {
			//ghi file
			try {
				Files.write(file.toPath(),lines);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("...***Finish***...");
	}

}
