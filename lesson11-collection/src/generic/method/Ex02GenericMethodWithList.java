package generic.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * List<Item>, List<String>
 * 
 * Yeu cau chi duoc phep in ra cac mang la so
 *
 */
public class Ex02GenericMethodWithList {

	public static void main(String[] args) {
		List<Double> dlist = Arrays.asList(1d, 2d, 3d, 4d);
		List<Integer> Ilist = Arrays.asList(1, 2, 3, 4);
		List<String> Slist = Arrays.asList("a", "b", "c", "d");
		printf(Ilist);
		printf(Ilist);
	}

//	private static void printft(List e) {
//		for (Object object : e) {
//			System.out.println(object + " ");
//		}
//		System.out.println();
//	}
//	E extends Number
//	E extends Charsequense
	private static void printf(List<? super Integer> es) {
		for (Object e : es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
