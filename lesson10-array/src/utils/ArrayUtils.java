package utils;

import java.util.Arrays;

import common.Item;

public class ArrayUtils {
	//khi một hàm không quan tâm đến đối tượng đang gọi, chỉ quan tâm đến đối tượng truyền vào cho static
	private ArrayUtils() {
		
	}
	
	public static void printf(String prefix,int[] input) {
		System.out.println(prefix + " --> " + Arrays.toString(input));
	}
	
	public static void printf(String prefix, String[] intput) {
		System.out.println(prefix + "-->" + Arrays.toString(intput));
	}
	
	public static void printf(String prefix, Item[] intput) {
		System.out.println(prefix + "-->" + Arrays.toString(intput));
	}
}