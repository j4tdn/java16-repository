package utils;

import java.util.List;

public class PrintUtils {

	public PrintUtils() {
		// TODO Auto-generated constructor stub
	}
	public static <T> void print(String prefix, List<T> list)
	{
		System.out.println("\n" + prefix);
		System.out.println("==__>> --------------- <<__==");
		
		list.forEach(System.out::println);
		System.out.println("==__>> --------------- <<__==");
	}
	public static <T> void print(String prefix, T item)
	{
		System.out.println("\n" + prefix);
		System.out.println("==__>> --------------- <<__==");
		
		System.out.println(item);
		System.out.println("==__>> --------------- <<__==");
	}
}
