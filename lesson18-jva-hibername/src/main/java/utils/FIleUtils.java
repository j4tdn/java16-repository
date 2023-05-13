package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FIleUtils {
	private FIleUtils() {
	}
	//Function<String, T> func: duyệt từng dòng trong file trả về 1 đối tượng
	public static <T> List<T> readLine(String fpath, Function<String, T> func){
		List<T> result = new ArrayList<>();
		
		try {
			List<String> lines = Files.readAllLines(Paths.get(fpath));
			for (String line:lines) {
				result.add(func.apply(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}