package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import bean.Datarow;

public class FileUtils {
	private FileUtils() {
	}
	
	// Read
	public static List<String> read(File file) {
		List<String> lines = new ArrayList<>();
		if (file.exists()) {
			try {
				lines = Files.readAllLines(file.toPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return lines;
	}
	
	// Write
	public static <T extends Datarow> void write(File file, Collection<T> collection) {
		List<String> lines = collection.stream().map(Datarow::toLine).collect(Collectors.toList());
		writeLine(file, lines);
	}

	public static void writeLine(File file, Iterable<String> lines) {
		if (file.exists()) {
			try {
				Files.write(file.toPath(), lines);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
