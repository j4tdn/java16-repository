package generic.method;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		List<Double> dList = Arrays.asList(1d,2d,3d,4d);
		List<Integer> iList = Arrays.asList(2,4,4,2);
		List<String> sList = Arrays.asList("hello", "hallo");
		
		printListWildCard("dList", dList);
		printListWildCard("iList", iList);
		//printListGeneric("sList", sList);
	}
	
	private static void printListWildCard(String prefix ,List<? extends Number> objects) {
		System.out.println(prefix + "--> ");
		for (Number object:objects) {
			System.out.println(object + " ");
		}
		System.out.println("\n");
	}
	// <E> --> no limitation
	// <E extends Number> --> limit by number(number or sub types of Number)
	// <E extends CharSequence> --> limit by CharSequence( CharSequence or sub types of CharSequence)
	
	private static <E extends Number> void printListGeneric(String prefix ,List<E> objects) {
		System.out.println(prefix + "--> ");
		for (E object:objects) {
			System.out.println(object + " ");
		}
		System.out.println("\n");
	}
}
