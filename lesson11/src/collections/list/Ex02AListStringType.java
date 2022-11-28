package collections.list;

import java.util.ArrayList;
import java.util.*;

public class Ex02AListStringType {
	//interface: List
	// implementation: ArrayList & LinkList
	
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("A1"); // index = 0 
		sequences.add("B2");
		sequences.add("C3");
		sequences.add("C3");
		System.out.println("size: " + sequences.size());
		loop(sequences);
		
		sequences.set(1, "B99");
		System.out.println("Elements[1] --> " + sequences.get(1));
		
		sequences.remove(0);  // by index
		sequences.remove("D4");  // by value
		loop(sequences); // B99, C3
		
		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6");  // B99, C3, E4, F5, G6
		
		loop(sequences);
		
		removeIf(sequences, item -> item.compareTo("C") < 0 );
		System.out.println("=== After removeIf ===");
		loop(sequences);
		
		System.out.println("=== After removeIf 02 ===");
		sequences.removeIf(s -> s.compareTo("F") < 0 );
		loop(sequences);
		
		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		loop(sequences);
		
		// Duyet tung phan tu trong sequences
		// Kiem tra neu co phan tu nao sequences[i].equals("A2") --> true
		// else --> false
		
		System.out.println("Is A2 existed --> " + sequences.contains("A2"));
		sequences.remove("A2");
		System.out.println("Is A2 existed --> " + sequences.contains("A2"));
	}
	
	// capacity --> length of elementData
	// size --> not null elements in elementData
	// ArrayList --> size
	
	private static boolean removeIf(List<String> elements, Condition c) {
		boolean removed = false;
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			// each,comoareTo("F") < 0
			// test(each) --> strategy method
			if(c.test(iterator.next())) {
				iterator.remove();
				removed = true;
			}
		}
		return removed;
	}
	
	private static void loop(List<String> elements) {
		System.out.println("----------->");
		for(String element: elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}
	
	@FunctionalInterface
	interface Condition {
		boolean test(String elements);
	}
}
