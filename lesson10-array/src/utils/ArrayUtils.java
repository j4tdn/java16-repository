package utils;

import java.util.Arrays;

import common.Item;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void printf(String prefix, int[] objects) {
		System.out.println(prefix + " --> " + Arrays.toString(objects));
	}
	
	public static void printf(String prefix, String[] objects) {
		System.out.println(prefix + " --> " + Arrays.toString(objects));
	}
	
	public static void printf(String prefix, Item[] objects) {
		for (Item item : objects) {
			System.out.println(item);
		}
	}
}
