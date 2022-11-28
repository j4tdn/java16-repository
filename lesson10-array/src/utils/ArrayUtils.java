package utils;

import java.util.Arrays;

public class ArrayUtils {
	private ArrayUtils() {

	}

	public static void prinf(String prefix, int[] input) {
		System.out.println(prefix + "-->" + Arrays.toString((input)));
	}
}
