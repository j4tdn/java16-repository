package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AlistStringType {

	//interface:List
	//implementation: 
	public static void main(String[] args) {
		
		List<String> sequences = new ArrayList<>();
		sequences.add("a");
		sequences.add("b");
		sequences.add("c");
		sequences.add("d");
		System.out.println("size: "+ sequences.size());
		loop(sequences);
		
		sequences.set(1, "B99");
		System.out.println("elements[1] --> "+sequences.get(1));
		
		sequences.remove(0);
		sequences.remove("d");
		loop(sequences);
		
		sequences.add("f");
		sequences.add("e");
		sequences.add("g");
		loop(sequences);
		
		removeIf(sequences, item -> item.compareTo("c")<0);
		System.out.println("====afterremove====");
		loop(sequences);
		
		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		loop(sequences);
		
		System.out.println("is A2 existed --> " + sequences.contains("A2"));
		sequences.remove("A2");
		System.out.println("is A2 existed --> " + sequences.contains("A2"));
	}
	
	private static boolean removeIf(List<String> elements, Condition c) {
		boolean removed = false;
		Iterator<String> iterator = elements.iterator();
		while (iterator.hasNext()) {
			//each.compareTo("F")<0
			// test (each)
			if (c.test(iterator.next())) {
				iterator.remove();
				removed=true;
			}
		}
		return removed;
	}
	
	private static void loop(List<String> elements) {
		System.out.println("-------------->");
		
		for (String element: elements) {
			System.out.println(element + " ");
		}
		System.out.println();
		
	}
}
@FunctionalInterface
interface Condition {
	boolean test(String element);
}
