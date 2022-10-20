package view;

import java.util.Arrays;


public class Ex01 {
	//private static String RegexPattern = "[A-Za-z\\p{L}\\s]+";
	
	public static void main(String[] args) {
		String s = null;

		s = "hello world";
		System.out.println(s);
		System.out.println("==================");
		s.chars().forEach(o->System.out.println((char)o + " "));
		System.out.println("==================");
		Arrays.asList(s.trim().replace("[\\s]+", " ").split("\\s")).forEach(System.out::println);
		System.out.println("==================");
		StringBuilder tmp = new StringBuilder(s);
		tmp.reverse().chars().forEach(o->System.out.println((char)o + " "));
		System.out.println("==================");
		Arrays.asList(s.trim().replace("[\\s]+", " ").split("\\s"))
		.forEach(o->System.out.println(new StringBuilder(o).reverse()));
	}
	
	
	
}
