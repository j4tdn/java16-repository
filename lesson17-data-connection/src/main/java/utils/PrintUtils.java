package utils;

import java.util.Collection;

public class PrintUtils {
	private PrintUtils() {
		
	}
	
	public static <E> void generate(String prefix, E e) {
		System.out.println(prefix + " {");
		System.out.println(e);
		System.out.println("}");
	}
	
	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + " {");
		collection.forEach(System.out::println);
		System.out.println("}");
	}
}
