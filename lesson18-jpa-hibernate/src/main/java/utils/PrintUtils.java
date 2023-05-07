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
	
	public static <T> void print(String prefix, T item) {
		System.out.println("\n" + prefix);
		
		System.out.println("==_>> ------------------ <<_==");
		
		System.out.println(item);
		
		System.out.println("==_>> ------------------ <<_==\n");
	}
	
	public static <T> void executeAndPrint(String prefix, Runnable runnable) {
		System.out.println("\n" + prefix);
		
		System.out.println("==_>> ------------------ <<_==");
		
		runnable.run();
		
		System.out.println("==_>> ------------------ <<_==\n");
	}
}
