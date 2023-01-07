package generic.method;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		// new ArrayList<>()
		// => java.util.ArrayList => array with dynamic size

		// Arrays.asList()
		// => java.util.Arrays.ArrayList => array with fixed size

		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d); // fixed size => unaddable
//		dList.add(123d); // throws UnsupportedOperationException (*)
		List<String> sList = Arrays.asList("Hello", "Hallo", "Hollo");
		List<Integer> iList = Arrays.asList(2, 4, 4, 2);

//		Note : List<Object) is NOT the base class of the List<Double>, List<String>,...
//		although Object is the base class of Double, String, Intger,...
//		Hence we must use generic type with List.
		printList("dList", dList);
		printList("sList", sList);
		printList("iList", iList);
		
//		System.out.println("=====================");
//		printListWildcard("dList", dList);
//		printList("sList", sList);
//		printListWildcard("iList", iList);
	}
	
	private static <E> void printList(String prefix, List<E> list) {
		System.out.print(prefix + ": ");
		for (E item : list) {
			System.out.print(item + "   ");
		}
		System.out.println();
	}
	
	private static void printListWildcard(String prefix, List<? extends Number> list) {
		System.out.print(prefix + ": ");
		for (Number item : list) {
			System.out.print(item + "   ");
		}
		System.out.println();
	}
}
