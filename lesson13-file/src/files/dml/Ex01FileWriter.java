package files.dml;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import utils.FileUtils;

/*
 *  ghi dữ liệu  vào file txt
 *  
 *  + Input: String,List<String>,File
 *  + Output: void  
 */
public class Ex01FileWriter {
	public static String pathname ="text\\data\\content.txt";
	public static void main(String[] args) { 
		File file = new File(pathname);
		List<String> lines = List.of(
					"1. le van teo",
					"2. john Smirh",
					"3. Susan;",
					"4. hoang nam"
				);
		
		FileUtils.writeLines(file, lines);
		
		System.out.println("*...Finish...***");
	}
}
