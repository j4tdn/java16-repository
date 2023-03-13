package file.dml;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import utils.FileUtils;

public class Ex01FileWritter {
	private static String pathname = "conten.txt";
	public static void main(String[] args) {
		File file = new File(pathname); 
		List<String> lines = List.of(
				"1. Le Van Teo",
				"2. John Smith",
				"3. Susan",
				"4. Hoang Nam");
		
		if(file.exists()) {
			// ghi file
			try {
				Files.write(file.toPath(), lines);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Finished");
		FileUtils.open(file);
			
	}
	

}
