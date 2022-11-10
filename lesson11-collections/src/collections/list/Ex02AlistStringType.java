package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AlistStringType {
	// interface: List
	// implementation: ArrayList & LinkList
	public static void main(String[] args) {
		List<String> squences = new ArrayList<>();
		squences.add("A1"); // index = 0
		squences.add("B2");
		squences.add("C3");
		squences.add("D4");
		System.out.println("size: " + squences.size());
		loop(squences);

		squences.set(1, "B99");
		System.out.println("elements[1] --> " + squences.get(1));

		squences.remove(0); // by index
		squences.remove("D4"); // by value
		squences.add("E4");
		squences.add("F5");
		squences.add("G6");

		squences.removeIf(s -> s.compareTo("F") < 0);
		loop(squences);

		squences.add("A1");
		squences.add("A2");
		squences.add("A3");
		loop(squences);
		
		// Duyệt từng phần tử trong sequences
		// Kiểm tra nếu có phần từ nào sequences[i].equals("A2") --> true
		// else --> false
		System.out.println("Is A2 existed --> " + squences.contains("A2"));
		squences.remove("A2");
		System.out.println("Is A2 existed --> " + squences.contains("A2"));

	}

	// capacity --> length of elementData
	// size --> non-null elements in elementData
	// ArrayList --> size
	private static void loop(List<String> elements) {
		System.out.print("-----------> ");
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

@FunctionalInterface
interface Condition {
	boolean test(String element);
}