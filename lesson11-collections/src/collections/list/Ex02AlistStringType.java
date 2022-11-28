package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AlistStringType {
	// interface: List
	// implementation: ArrayList & LinkList
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("A1"); // index = 0
		sequences.add("B2");
		sequences.add("C3");
		sequences.add("D4");
		System.out.println("size: " + sequences.size());
		loop(sequences);
		
		sequences.set(1, "B99");
		System.out.println("elements[1] -->" + sequences.get(1));
		
		sequences.remove(0);
		loop(sequences); 
		
		sequences.remove("D4");
		loop(sequences); // B99, C3
		
		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6");
		
		removeIf(sequences, item -> item.compareTo("F") < 0);
		//sequences.removeIf(item -> item.compareTo("F") < 0);
		loop(sequences);
		
		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		loop(sequences);
		
		// Duyệt từng phần tử trong sequences
		// Kiểm tra nếu có phầnn tử nào sequences[i].equals("A2") --> true
		// else --> false
		
		System.out.println("Is A2 existed --> " + sequences.contains("A2"));
		sequences.remove("A2");
		System.out.println("Is A2 existed --> " + sequences.contains("A2"));
		
	}
	
	// capacity --> length of elementData
	// size		--> non-null elements in elementData
	// ArrayList --> size
	private static void loop(List<String> elements) {
		System.out.print("-------->");
		for (int i = 0; i < elements.size(); i++) {
			System.out.print(elements.get(i) + " ");
		}
		System.out.println();
	}
	
	private static boolean removeIf(List<String> elements, Condition c) {
		boolean removed = false;
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			// each.compareTo("F") < 0
			// test(each) --> strategy method
			if (c.test(iterator.next())) {
				iterator.remove();
				removed = true;
			}
		}
		return removed;
	}
}

interface Condition {
	boolean test(String element);
}
