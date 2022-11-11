package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.util.Elements;

public class Ex02AListStringType {
	// interface: list
	// implementation: ArrayList& LinkList
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("a1"); // index = 0
		sequences.add("b2");
		sequences.add("c3");
		sequences.add("d4");
		System.out.println("size: " + sequences.size());
		Loop(sequences);

		sequences.set(1, "b99");
		System.out.println("element[1]: " + sequences.get(1));

		sequences.remove(0); // by index
		sequences.remove("d4"); // by value
		Loop(sequences);

		sequences.add("e4");
		sequences.add("f5");
		sequences.add("g6");
		removeIf(sequences, s -> s.compareTo("e") < 0);
		// sequences.removeIf(s -> s.compareTo("f")<0);
		Loop(sequences);

		sequences.add("a1");
		sequences.add("a2");
		sequences.add("a3");
		Loop(sequences);

		// DUyệt từng phần tử trong sequences
		// kiểm tra nếu có phần tử nào sequences[i].equals("a2") --true
		// else --> false
		System.out.println("Is a2 existed --> " + sequences.contains("a2"));
		sequences.remove("a2");
		System.out.println("Is a2 existed --> " + sequences.contains("a2"));
		// Lưu ý:
		// sequences.remove("d4"); //by value
		// sequences.cotains("d4");
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

	// Capacity --> length of elementData
	// size --> non null elements value
	// ArrayList --> size
	private static void Loop(List<String> elements) {
		System.out.print("-------->");
		for (String element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}

@FunctionalInterface
interface Condition {
	boolean test(String elements);
}