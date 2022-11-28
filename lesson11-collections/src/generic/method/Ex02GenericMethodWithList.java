package generic.method;

import java.util.Arrays;
import java.util.List;

/*
 * Sau khi mình xử lý dữ liệu xong, kết quả có thể trả về kiểu List<Double>, List<Integer>, List<String>
 * --> Người dùng muốn in ra dữ liệu từ các mảng đó
 * 
 * - Yêu cầu: chỉ được phép in ra các mảng là số: Integer, Double, Long
 * Idea: Tìm 1 super type of Integer, Long, Double sau đó giới hạn E bởi super type
 */

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		// new ArrayList<>() --> Java.Util.ArrayList --> array with dynamic size
		// Arrays.asList() --> Java.Util.Array.ArraysList --> array with fixed size --> Không thêm không xoá
		List<Double> dList = Arrays.asList(1d,2d,3d,4d);
		List<String> sList = Arrays.asList("hello", "halla", "hollo");
		List<Integer> iList = Arrays.asList(2,4,4,2);
		//printListWildCard("dList", dList);
		//printListWildCard("sList", sList);
		//printListWildCard("iList", iList);
		
		printListGenerics("sList", sList);
		
	}
	// E -> no limitation
	// <E extends Number> --> limit by Number (Number or sub type of Number)
	// <E extends CharSequence> limit by CharSequence (CharSequence or sub type of CharSequence)
	
	//private static void printListWildCard(String prefix, List<? super Integer> objects) {
		//System.out.print(prefix + " --> ");
		//for (Number object: objects) {
		//	System.out.print(object + " ");
		//}
		//System.out.println("\n");
	//}
	private static <E extends CharSequence> void printListGenerics(String prefix, List<E> objects) {
		System.out.print(prefix + " --> ");
		for (E object: objects) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
	
	private static<E> void printListGeneric(String prefix, List<E> objects) {
		System.out.print(prefix + " --> ");
		for (E object: objects) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
	// List<Object> là KDL list, List<Object> bắt buộc truyền tham số kiểu Object vào 
	/*
	 * private static void printList(String prefix, List<Object> objects) {
		System.out.print(prefix + " ");
		for (Object object: objects) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
	 */
	
}
