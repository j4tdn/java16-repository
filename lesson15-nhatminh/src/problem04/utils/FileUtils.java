package problem04.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class FileUtils {
	private FileUtils() {
	}

	public static List<String> readFile(Path path) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	public static void close(AutoCloseable... autoCloseables) {
		Arrays.stream(autoCloseables).forEach(t -> {
			try {
				t.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

}
