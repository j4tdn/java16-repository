package utils;

import java.util.List;

public class PrintUtils {

	private PrintUtils() {
		
	}
	
	public static <T> void print(String prefix, List<T> list) {
		System.out.println(prefix);
		
		System.out.println("==__>> ---------");
		list.forEach(System.out::println);
		
		System.out.println("====__<<--------");
	}
}
