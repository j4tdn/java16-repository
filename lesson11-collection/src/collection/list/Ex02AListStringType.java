package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AListStringType {
	// interface:List
	// implementation : ArrayList and Linked List
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("A1");
		sequences.add("B2");
		sequences.add("C3");
		sequences.add("D4");

		System.out.println("size: " + sequences.size());
		loop(sequences);
		sequences.set(1, "B99");
		System.out.println("element[1] --> " + sequences.get(1));

		sequences.remove(0); // by index
		sequences.remove("D4");
		loop(sequences); // by value B99

		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6");

		sequences.removeIf(c -> c.compareTo("F") < 0);
		loop(sequences);
		// sequences.remove("D4");
		// sequences.contains("D4");

		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		loop(sequences);

		System.out.println("Is A2 Containted --> " + sequences.contains("A2"));
		// List<Item>
		sequences.remove("A2");
		System.out.println("Is A2 Containted --> " + sequences.contains("A2"));
	}

	// element --> length of elements data
	//
	private static void loop(List<String> elements) {
		System.out.println("=================");
		for (String element : elements) {
			System.out.print(element + " ");
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

// capacity --> length of elementData
// size --> non- null elements
interface Condition {
	boolean test(String element);
}