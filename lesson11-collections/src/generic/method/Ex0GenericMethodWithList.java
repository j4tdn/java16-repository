package generic.method;

import java.util.Arrays;
import java.util.List;
/*
 * Sau khi mình xử lý dữ liệu xong, kết quả có thể trả về List<Double>, List<String>, List<Item>;
 * 
 * --> người dùng muốn in ra dữ liệu từ các mảng 
 * 
 * yêu cầu: chỉ được phép in ra các mảng là một số Integer, Double, Long
 * Idea --> Tìm 1 super type of Integer, Long, Double
 * 
 * sau đó giở hạn E bởi super type
 */
public class Ex0GenericMethodWithList {
	public static void main(String[] args) {
		//new ArrayList<>();
		//	--> java.util.ArrayList --> array with dynamic size
		
		//Arrays.asList
		//--> java.util.Arrays.ArrayList --> array with fixed size
		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("hello", "halla", "hollo");
		List<Integer> iList = Arrays.asList(1, 2, 3, 4);
		
		printList("dList", dList);
		//printList("sList", sList); ERROR --> string not extends Number
		printList("iList", iList);
	}
	//<E> --> no limitation
	//<E extends Number> --> limit by Number (Number or sub types of Number) 
	//<E CharSequence> --> limit by CharSequence (CharSequence or sub types of CharSequencs)
	private static <E extends Number> void printList(String prefix, List<E> array) {
		System.out.print(prefix + " --> ");
		for (E item: array) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
