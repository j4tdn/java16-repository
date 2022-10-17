package view;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex03Topic1 {
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		System.out.println(revert(input));
	}
	
	private static String revert(String s) {
		return Arrays.asList(s.trim().replace("[\\s]+", " ").split("\\s"))
				.stream()
				.map(str -> new StringBuffer(str).reverse())
				.collect(Collectors.joining(" "));
		
	} 
}
