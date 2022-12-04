package generic.method;

import java.util.Arrays;
import java.util.List;

//Sau khi xử lý dữ liệu xong, kết quả có thể trả về
//Double[], String[], Item[], Integer[]

//Người dùng muốn in ra dữ liệu từ các mảng đó
//Chỉ in ra list các số (Double, Integer, Long)
//Idea --> Tìm 1 super type of Integer/Long/Double
//Sau đó giới hạn E bởi super type
public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		// new ArrayList<>()
		// --> java.util.ArrayList --> array with dynamic size

		// Arrays.asList()
		// --> java.util.Arrays.ArrayList --> array with fixed size
		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("Hello", "Hallo", "Hollo");
		List<Integer> iList = Arrays.asList(2, 4, 4, 2);

		printListGeneric("dList", dList);
//		printListGeneric("sList", sList);
		printListGeneric("iList", iList);
		printListWildCard("dList", dList);
		printListWildCard("iList", iList);
//		dList.add(123d);
//		dList.forEach(d -> System.out.print(d + " "));
	}

	private static void printListWildCard(String prefix, List<? extends Number> objects) {
		System.out.print(prefix + " --> ");
		for (Number object : objects)
			System.out.print(object + " ");
		System.out.println("\n");
	}

	// <E> --> No limitation
	// <E extends Number> --> Limit by Number (Number or sub types of Number)
	private static <E extends Number> void printListGeneric(String prefix, List<E> objects) {
		System.out.print(prefix + " --> ");
		for (E object : objects)
			System.out.print(object + " ");
		System.out.println("\n");
	}
//	private static <E extends CharSequence> void printListGeneric(String prefix, List<E> objects) {
//		System.out.print(prefix + " --> ");
//		for (E object : objects)
//			System.out.print(object + " ");
//		System.out.println("\n");
//	}

//	private static void printList(String prefix, List<Object> objects) {
//		System.out.print(prefix + " --> ");
//		for (Object object : objects)
//			System.out.print(object + " ");
//		System.out.println("\n");
//	}
}
