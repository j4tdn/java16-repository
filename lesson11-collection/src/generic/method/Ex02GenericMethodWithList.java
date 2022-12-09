package generic.method;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {

		List<Double> dlist = Arrays.asList(1d,2d,3d);
		List<String> slist = Arrays.asList("a","b","c");
		List<Integer> ilist = Arrays.asList(1,1,4);
		printListGenerc("double", dlist); 
		printListGenercChar("String", slist);
		printListGenerc("integer", ilist); 
		
		
	}
	private static <Element extends Number> void printListGenerc(String prefix, List<Element> listE) {
		System.out.println(prefix + " -->");
		for (Element item : listE) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}
	private static <Element extends CharSequence> void printListGenercChar(String prefix, List<Element> listE) {
		System.out.println(prefix + " -->");
		for (Element item : listE) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}
	private static void printListWildCard(String prefix, List<? extends Number> listE) {
		System.out.println(prefix + " -->");
		for (Number item : listE) {
			System.out.print(item + " ");
		}
		System.out.println("\n");
	}

}
