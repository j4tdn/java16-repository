package generic.method;

import java.util.Arrays;
import java.util.List;

/*
 *  Sau khi mình sử lý dữ liệu xong, kết quả có thể trả về
 *  Double[], String[], Item[];
 *  
 *  --> Người dùng muốn in ra dữ liệu từ các mảng đó
 *  
 *  Yêu cầu : Chỉ được in ra các mảng là số Integer, Double, Long
 *  Idea --> Tìm 1 super type ò Integer/ Long / Double
 *  sau đó giới hạn E bởi super type
 */
public class Ex02GenericMethodWithArray {

	public static void main(String[] args) {
		// new ArrayList
		// --> java.util.ArrayList --> array with fixed size

		// Array.asList()
		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("hello", "halla", "hollo");
		List<Integer> iList = Arrays.asList(2, 4, 4, 2);

		printListGeneric("dList", dList);
		//printListGeneric("sList", sList);
		printListGeneric("iList", iList);
		System.out.println();
	}

	// <E> no limitation
	// <E extends Number> --> limit by number (number or sub types of Number
	// <E extends CharSequence> --> limit by CharSequence (CharSequence or sub types of
	private static <E extends Number > void printListGeneric(String prefix, List<E> objects) {
		System.out.println(prefix + "======> ");
		for (E object : objects) {
			System.out.println(object + " ");
		}
		System.out.println("\n");

	}
}
