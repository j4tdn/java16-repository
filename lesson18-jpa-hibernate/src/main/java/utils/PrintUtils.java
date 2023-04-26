package utils;

import java.util.List;

public class PrintUtils {
	private PrintUtils() {
	}
	
	public static <T> void print(String prefix, List<T> list) {
		System.out.println("\n" + prefix);
		System.out.println("==__>> --------------------- <<__==");
		
		list.forEach(System.out::println);
		
		System.out.println("==__>> --------------------- <<__==\n");
	}
	
	public static <T> void print(String prefix, T item) {
		System.out.println("\n" + prefix);
		System.out.println("==__>> --------------------- <<__==");
		
		System.out.println(item);
		
		System.out.println("==__>> --------------------- <<__==\n");
	}
	
}
