package utils;

import java.util.List;

public class PrintUtils {
	
	public PrintUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static <T> void print(String prefix, List<T> list) {
		System.out.println("\n" + prefix);
		
		System.out.println("==_>> ------------------ <<_==");
		
		list.forEach(System.out::println);
		
		System.out.println("==_>> ------------------ <<_==\n");
	}
}
