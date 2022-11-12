package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AListStringType {
	// interface: List
	// implementation: ArrayList & LinkList
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("A1");// index = 0
		sequences.add("B2");// index = 1
		sequences.add("C3");// index = 2
		sequences.add("D4");// index = 3
		System.out.println("size: " + sequences.size());
		loop(sequences);

		sequences.set(1, "B99");
		System.out.println("elements[1] --> " + sequences.get(1));

		sequences.remove(0); // By index
		sequences.remove("D4");// By value
		loop(sequences);

		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6"); // B99, C3, E4, F5, G6

		loop(sequences);
		Condition c1 = element -> element.compareTo("F") < 0;
//		removeIf(sequences, c1);
		sequences.removeIf(c -> c.compareTo("F") < 0);
		System.out.println("==After removeIf==");
		loop(sequences);

		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		loop(sequences);

		// Duyệt từng phần tử trong sequences
		// Kiểm tra nếu có phần tử nào sequences[i].equals("A2") --> true
		// else --> false
		System.out.println("Is A2 existed --> " + sequences.contains("A2"));
		sequences.remove("A2");
		System.out.println("Is A2 existed --> " + sequences.contains("A2"));
//		sequences.contains("D4");
	}

	// ConcurrentModificationException
	// --> Khi 1 phần tử đang được thao tác/xử lý bới 1 process
	// --> Không thể được truy cập bởi process khác
	// Strategy method
	// Condition c = c1;
	private static boolean removeIf(List<String> elements, Condition c) {
		Iterator<String> iterator = elements.iterator();
		while (iterator.hasNext()) {
			String each = iterator.next();
			if (c.test(each))
				iterator.remove();
		}
		return true;
	}

	private static void loop(List<String> elements) {
		System.out.print("------->");
		for (String element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}

// Strategy -> interface, abstract class

interface Condition {
	boolean test(String element);
}