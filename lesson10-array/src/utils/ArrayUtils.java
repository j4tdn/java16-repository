package utils;

import java.util.Arrays;

import common.Item;

public class ArrayUtils {
	//class tien ich co ham chức năng không quan tâm đến đối tượng đang gọi 
	private ArrayUtils() {
		
	}
	
	public static void printf(String prefix, int[] intput) {
		System.out.println(prefix + "-->" + Arrays.toString(intput));
	}
	
	public static void printf(String prefix, String[] intput) {
		System.out.println(prefix + "-->" + Arrays.toString(intput));
	}
	
	public static void printf(String prefix, Item[] intput) {
		System.out.println(prefix + "-->" + Arrays.toString(intput));
	}

	


}
