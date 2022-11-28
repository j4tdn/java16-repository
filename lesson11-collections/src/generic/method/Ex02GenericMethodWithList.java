package generic.method;

import java.util.Arrays;
import java.util.List;

/**
 * Sau khi mình xử lí dữ liệu xong, kết quả có thể trả về
 * List<Double>, List<String[], Item[], Integer[]
 * 
 * --> Người dùng muốn in ra dữ liệu từ các cái mảng đó
 * 
 * Yêu cầu: Chỉ được phép in ra các mảng là số Integer, Double, Long
 * Idea --> Tìm 1 super type of Integer/Long/Double
 * 		sau đó giới hạn E bởi super type --> Number
 */

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		// new ArrayList<>();
		// --> java.util.ArrayList --> array with dynamic size
		
		// Arrays.asList()
		// --> java.util.Arrays.ArrayList --> array with fixed size
		// Can't remove, add
		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("hello", "hallo", "hollo");
		List<Integer> iList = Arrays.asList(2, 4, 4, 2);
		printListWildCard("dList", dList);
		// printListGeneric("sList", sList);
		printListWildCard("iList", iList);
	}	
	
	private static void printListWildCard(String prefix, List<? extends Number> objects) {
		System.out.println(prefix + " ---> ");
		for (Number object: objects) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
	
	// <E> --> no limitation
	// <E extends Number> -->limit by Number (Number or sub types of Number)
	// <E extends CharSequence> --> limit by CharSequence (CharSequence or sub types of CharSequence)
	private static <E extends Number> void printListGeneric(String prefix, List<E> objects) {
		System.out.println(prefix + " ---> ");
		for (E object: objects) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
}
