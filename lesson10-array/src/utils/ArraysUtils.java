package utils;

import java.util.Arrays;

public class ArraysUtils {
	private ArraysUtils() {
		
	}
	
	public static void printf(String prefix, int[] input) {
		System.out.println(prefix + " --> " +  Arrays.toString(input));
	}
	

	public static void printf(String prefix, String[] input) {
		System.out.println(prefix + " --> " +  Arrays.toString(input));
	}
	public static void printf(String prefix, Object[] input) {
		System.out.println(prefix + " --> " +  Arrays.toString(input) + "\n");
		System.out.println();
	}

}
