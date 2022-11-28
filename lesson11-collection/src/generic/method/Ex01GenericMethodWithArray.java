package generic.method;

import java.util.Arrays;

public class Ex01GenericMethodWithArray {
	public static void main(String[] args) {
		Integer[] interger = {1,2,3,4,5,6};
		String[] strings = {"a",  "b", "c", "d"};
		Double[] double1 = {1.1,1.2,1.3,2.5};
		printf(interger);
		printf(strings);
		printf(double1);
		System.out.println("???????????????????????????");                                                                                                                                                                                                                   ;
		printft2(strings);
		printft2(double1);
		
	}
	private static <E> void printf(E[] list) {
		Arrays
		.
		asList(list)
		.
		stream()
		.
		forEach(o -> System.out.print(o + " "));
		System.out.println();
	}

	private static <E> void printft2(E[] e) {
		for (Object object : e) {
			System.out.print(object  + " ");
		}
		System.out.println();
	}
	
//	private static void printft(Object[] e) {
//		for (Object object : e) {
//			System.out.println(object);
//		}
//		System.out.println();
//	}

}
