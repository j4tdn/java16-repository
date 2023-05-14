package utils;

import java.util.List;

public class PrintfUtils {
	private PrintfUtils() {
		// TODO Auto-generated constructor stub
	}
	public static <T> void printf(String prefix, List<T> list) {
		System.out.println(prefix);
		
		System.out.println("==__>> ------------------<<__==");
		list.forEach(t -> System.out.println(t));
		System.out.println("==__>> ------------------<<__==");
	}
	public static <T> void printf(String prefix, T item) {
		System.out.println(prefix);
		
		System.out.println("==__>> ------------------<<__==");
		System.out.println(item);
		System.out.println("==__>> ------------------<<__==");
	}

}
