package generic.method;

import java.util.Arrays;
import java.util.List;

/*Sau khi mình xử lý dữ liệu xong thì kết quả trả về có thể là:
*List<Double>, List<String>, List<Item>, List<Integer>;
*
*--> người dùng muốn in ra dữ liệu từ các mảng đó
*
*Yêu cầu: Chỉ được in ra các mảng là số Integer, Double, Long
*
*Idea --> tìm 1 super type of Integer, Double, Long
*
* sau đó giới hạn E bơi 
*/
public class Ex02GenericMethodWithList {

	public static void main(String[] args) {
		// new ArrayList<>() --> java.util.ArrayList --> array with dynamic size
		//Arrays.asList() --> java.util.Arrays.ArrayList --> array with fixed size
		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("hello");
		List<Integer> iList = Arrays.asList(1);
		
		printList("dList", dList);
		//printList("sList", sList);
		printList("iList", iList);
		

	}
	// <E> --> no limitation
	// <E extends Number> --> limit by Number
	// <E extends CharSequence> --> limit by Charsequence
	private static <E extends Number> void printList(String s, List<E> o)
	{
		System.out.println(s + " ----> ");
		for(E so : o)
		{
			System.out.print(so + " ");
		}
		System.out.println("\n");
	}

}
