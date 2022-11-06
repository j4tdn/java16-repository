package utils;

import java.util.Arrays;

import common.Item;

public class ArrayUtils {
	private ArrayUtils() {

	}

	public static void printf(String prefix, int[] input) {
		System.out.println(prefix + " --> " + Arrays.toString(input));
	}
	public static void printf(String prefix, String[] input) {
		System.out.println(prefix + " --> " + Arrays.toString(input));
	}
	public static void printf(String prefix, Item[] items) {
		System.out.println(prefix + " --> " + Arrays.toString(items));
	}
}
