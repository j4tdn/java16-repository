package file.dml;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import utils.FileUtils;

/*
 * đọc dữ liệu từ file
 * 
 * input: file
 * output: List<String> 
 *       : List<String>-->List<T>
 */

public class Ex03FileReader {
	private static final String pathname ="text\\data\\content.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		
		if(file.exists()) {
			try {
				List<String> lines = Files.readAllLines(file.toPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//c2
		List<String> lines = FileUtils.read(file);
		
		lines.forEach(System.out::println);
		
	}

}
