package generic.method;

import java.util.Arrays;
import java.util.List;

/*
 * Sau khi mình xử lý dữ liệu xonh, kết quả có thể trả về
 * List<Double>, List<String>, List<Item>, List<Integer>;
 * 
 * --> Người dùng muốn in ra dữ liều từ các mảng đó
 * 
 * ** Yêu cầu chỉ đc phpes in ra các mảng là số
 * Idea --> tìm 2 super type of Integer\long\double
 *  sau đó giới hạn E bởi super type
 */
public class Ex02GenericMothodWithList {
	public static void main(String[] args) {
		//new ArrayList<>()
		//--> java.util.ArrayList --> array with dynamic size
		
		//Array.asList()
		// ->> java.util.Arrays.ArrayList --> array with fixed size
	 List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
	 List<String> sList = Arrays.asList("hello", "hiii", "hollo");
	 List<Integer> iList = Arrays.asList(2, 4, 4, 2);
	 
	 printListGeneric("dList", dList);
	 printListGeneric("sList", sList);
	 printListGeneric("iList", iList);
	 
	 printListGenericNumber("number --> dList", dList);
	 // printListGenericNumber("sList", sList);
	 printListGenericNumber("number --> iList", iList);
	 
	 
	 
	 //printListGenericChar("dList", dList);
	 printListGenericChar("char --> sList", sList);
	 // printListGenericChar("iList", iList);
			 
	}
	
	private static void printListWildCard(String prefix, List<? super Number> elements) {
		System.out.print(prefix + "------> ");
		for(Object element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
	//<E> --> no limitation
	// < Extends Number> --> limit by number (number or sub types of number)
	// < Extends CharSequence> --> limit by CharSequence (CharSequence or sub types of CharSequence)
	
	private static <E extends Number> void printListGenericNumber(String prefix, List<E> elements) {
		System.out.print(prefix + "------> ");
		for(E element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
	private static <E extends CharSequence> void printListGenericChar(String prefix, List<E> elements) {
		System.out.print(prefix + "------> ");
		for(E element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
	
	private static <E> void printListGeneric(String prefix, List<E> elements) {
		System.out.print(prefix + "------> ");
		for(E element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
	
}
