package utils;

import java.util.List;

public class PrintUtils {
	private PrintUtils() {
		
	}
	
	public static <T> void print(String prefix, List<T> list) {
		System.out.println(prefix);
		list.forEach(System.out::println);
	}
	
	public static <T> void print(String prefix, T item) {
		System.out.println(prefix);
		System.out.println(item);
	}
	
	public static <T> void executeAndPrint(String prefix, Runnable runnable) {
		System.out.println("\n" + prefix);
		System.out.println("==__ >> ------------ << __==");
		runnable.run();
		System.out.println("==__ >> ------------ << __==\n");
	}
}
