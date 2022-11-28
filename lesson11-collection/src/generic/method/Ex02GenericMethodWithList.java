package generic.method;

import java.util.Arrays;
import java.util.List;

/*
 * Sau khi mình xử lý dữ liệu xong, kết quả có thể trả về 
 * List<Double>,List<String>,List<Item>,List<Integer>
 * 
 * -->Người dùng muốn in ra dữ liệu từ mảng đó 
 * 
 * *Yêu cầu : CHỉ được phép in ra các mảng la số Integer, Double , Long 
 *  Idea --> Tìm 1 super type of Integer/Long/Double 
 *  
 */
public class Ex02GenericMethodWithList {
	public static void main(String[] args) {

		// new ArrayList<>()
		// --> java.util.ArrayList --> array with dynamic type

		// Array.asList()
		// -->java.util.ArrayList --> array with fixed size

		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("hello", "hallo", "hollo");
		List<Integer> iList = Arrays.asList(2, 4, 4, 2);

		printList("dList", dList);
		// printList("sList", sList);
		printList("iList", iList);

		printListWildCard("iList", iList);

	}

	private static <E extends Number> void printListWildCard(String prefix, List<? extends Number> objects) {
		System.out.print(prefix + " --> ");
		for (Number item : objects) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}

	// <E> --> no limitation
	// <E extend Number> --> limit by number (Number or sub types of Number)
	// <E extend CharSequence> --> limit by CharSequence (CharSequence or sub types
	// of CharSequence)

	private static <E extends Number> void printList(String prefix, List<E> objects) {
		System.out.print(prefix + " --> ");
		for (E item : objects) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}

}