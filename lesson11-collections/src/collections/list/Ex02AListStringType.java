package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AListStringType {
	// interface: List --> dynamic array
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
		System.out.println("elements[1] --> " + sequences.get(1));

		sequences.remove(0); // by index
		sequences.remove("D4"); // by value
		loop(sequences); // B99 C3

		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6"); // B99, C3, E4, F5, G6

		loop(sequences);

		removeIf(sequences, items -> items.compareTo("C") < 0);
		System.out.println("=== After removeIf ===");
		loop(sequences);

		System.out.println("=== After removeIf 02 ===");
		sequences.removeIf(s -> s.compareTo("F") < 0);
		loop(sequences);
		
		sequences.add("a1");
		sequences.add("a2");
		sequences.add("a3");
		loop(sequences);
		
		// Duyệt từng phần tử trong sequences
		// Kiểm tra nếu có phần tử nào trong sequences[i].equals("a2") --> true
		// else --> false
		
		System.out.println("Is a2 existed ---> " + sequences.contains("a2"));
		sequences.remove("a2");
		System.out.println("Is a2 existed ---> " + sequences.contains("a2"));


		
		// sequences.remove("D4");
		// sequences.contains("D4");

	}

	// capacity --> length of elementData
	// size --> non-null elements in elementData
	// ArrayList --> size
	private static void loop(List<String> elements) {
		System.out.print("------------------> ");
		for (int i = 0; i < elements.size(); i++) {
			System.out.print(elements.get(i) + " ");
		}
		System.out.println();
	}

	private static boolean removeIf(List<String> elements, Condition c) {
		boolean removed = false;
		Iterator<String> iterator = elements.iterator();
		while (iterator.hasNext()) {
			if (c.test(iterator.next())) {
				iterator.remove();
				removed = true;
			}
		}
		return removed;
	}
}

@FunctionalInterface
interface Condition {
	boolean test(String elements);
}
