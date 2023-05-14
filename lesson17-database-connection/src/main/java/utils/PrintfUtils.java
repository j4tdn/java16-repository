package utils;

import java.util.List;


public class PrintfUtils {
	private PrintfUtils() {
		
	}
	public static <E> void generate(String text, List<E> elements) {
		System.out.println(text);
		elements.forEach(ele -> System.out.println(ele));
	}
	public static <E> void generate(String text, E elements) {
		System.out.println(text + elements);
	}

}
