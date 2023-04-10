package utils;

import java.util.List;

public class PrintfUtils {
	private PrintfUtils() {
		// TODO Auto-generated constructor stub
	}
	public static <E> void generate(String text, List<E> elements) {
		System.out.println("{");
		elements.forEach(System.out::println);
		System.out.println("}");
	}
	public static <E> void generate(String text, E elements) {
		System.out.println(text +"{" + elements + "}");
	}
	

}
