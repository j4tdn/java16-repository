package utils;

import java.util.Arrays;

import common.Item;

public class ArrayUtils {
	public ArrayUtils() {

	}

	public static void prinf(String prefix, int[] input) {
		System.out.println(prefix + "-->" + Arrays.toString(input));
	}

	public static void prinf(String prefix, String[] input) {
		System.out.println(prefix + "-->" + Arrays.toString(input));
	}
	public static void prinf(String prefix, Item[] input) {
		System.out.println(prefix + "-->" + Arrays.toString(input));
	}
}
