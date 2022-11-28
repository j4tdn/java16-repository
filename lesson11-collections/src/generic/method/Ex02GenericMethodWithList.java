package generic.method;

import java.util.Arrays;
import java.util.List;

/*
 * Sau khi mình xử lý dữ liệu xong thì kết quả có thế trả về 
 * List<Double>, List<String>, List<Item>, List<Integer>
 * 
 * --> người dùng muốn in ra dữ liệu từ các cái mảng đó 
 * 
 * Yêu cầu chỉ được phép in ra các mảng là số: Integer, Double, Long
 * Idea --> tìm 1 cái super type of Integer Double Long
 * Sau đó giới hạn E bởi super type --> Number
 */

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		
		// new ArrayList<>() --> import từ java.util.ArrayList
		// --> array with dynamic size
		
		// Arrays.asList() --> import từ java.util.Array.ArrayList
		// --> array  with fixed size
		
		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("hello", "bello", "moshi");
		List<Integer> iList = Arrays.asList(2, 4, 3, 4);
		
		printListGeneric("dList", dList);
		// printlistGeneric("sList", sList);
		printListGeneric("iList", iList);
		
		printListWildCard("dList", dList);
		// printlistGeneric("sList", sList);
		printListWildCard("iList", iList);
		
	}
	
	private static void printListWildCard(String prefix, List<? extends Number> objects)  {
		System.out.print(prefix + " ---> ");
		for (Number object : objects) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
	
	// <E> -- no limitation
	// <E extend Number> --> limit by Number (Number or sub types of Number)
	// <E extend CharSequence> --> limit charSequence (CharSequence of sub types of CharSequence
	private static <E extends Number> void printListGeneric(String prefix, List<E> objects)  {
		System.out.print(prefix + " ---> ");
		for (Object object : objects) {
			System.out.print(object + " ");
		}
		System.out.println("\n");
	}
}
