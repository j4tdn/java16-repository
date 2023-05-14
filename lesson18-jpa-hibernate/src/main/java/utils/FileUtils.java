package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FileUtils {
	private FileUtils() {
	}

	public static <T> List<T> readLines(String fpath, Function<String, T> func) {
		List<T> result = new ArrayList<T>();
		try {
			List<String> lines = Files.readAllLines(Paths.get(fpath));
			for (String line : lines) {
				result.add(func.apply(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
