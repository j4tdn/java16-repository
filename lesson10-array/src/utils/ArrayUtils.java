package utils;

import java.util.Arrays;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
public static void printf(String prefix, int[] input) {
	System.out.println(prefix + " --> " +Arrays.toString(input));
}
}
