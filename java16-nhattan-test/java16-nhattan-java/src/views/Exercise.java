package views;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import utils.FileUtils;

public class Exercise {
	private static String pathnameIn = "storage\\data\\input.txt";
	
	private static String pathnameOut = "storage\\data\\output.txt";
	
	public static void main(String[] args) {
		File file = new File(pathnameIn);
		
		// có thể dụng hàm có sẵn Files.readAllLines từ java
		// hàm này là vì lúc học a hướng dẫn từ đầu cho các bạn quen thôi
		// chứ dùng của Java có sẵn cho khỏe
		List<String> lines = FileUtils.read(file);
		
		lines.remove(0);
		
		// cách làm ngắn gọi, được đó em
		List<String> result = lines.stream()
								.map(Exercise::getNumbers)
								.flatMap(Collection::stream)
								.sorted()
								.map(t -> t.toString())
								.collect(Collectors.toList());
		
		File output = FileUtils.createFile(pathnameOut);
		FileUtils.writeLines(output, result);
	}
	
	private static List<Integer> getNumbers(String str) {
		String[] numbersAsStr = str.split("[a-zA-z]+");

		return Arrays.stream(numbersAsStr)
				.dropWhile(s -> s.isEmpty())
				.map(Integer::parseInt)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}
}
