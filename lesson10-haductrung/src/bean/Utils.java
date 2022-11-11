package bean;

import java.util.Arrays;



public class Utils {
	private Utils() {
		
	}
	
	public static void printf(String prefix, int[] input) {
		System.out.println(prefix + "\n" + Arrays.toString(input));
	}
	
	public static void printf(String prefix, String[] input) {
		System.out.println(prefix + "\n" + Arrays.toString(input));
	}
	
	public static void printf(String prefix, Item[] input) {
		System.out.println(prefix + "\n" + Arrays.toString(input));
	}
}
