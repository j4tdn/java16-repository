package file.dml;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

import utils.FileUtils;
/*
 * ghi dữ liệu vào file
 * 
 * input: String; List<String>; file
 * 
 * output: void
 */

public class Ex01FileWriter {
	private static final String pathname ="text\\data\\content.txt";
	
	public static void main(String[] args) {
		File file = new File(pathname);
		List<String> lines = List.of(
				"1. le",
				"2. john",
				"3. Susan",
				"4. Hoang"
				);
		
		if(file.exists()) {
			//nếu file tồn tại thì ghi file
			try {//StandardOpenOption.APPEND: ghi thêm ở dưới khi load lại
				Files.write(file.toPath(), lines,StandardOpenOption.APPEND);
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println("---finish---");
		FileUtils.open(file);//chạy xong rồi mở file ra xem xét
	
	
	///dùng FileUtils
	    FileUtils.writeLines(file, lines);
		System.out.println("---finish---");
	}
	


}
