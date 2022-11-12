package utils;

import java.util.Arrays;

import common.Item;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void printf(String prefix, Item[] items) {
		System.out.println(prefix+"-->"+ Arrays.toString(items));
	}
	
}
