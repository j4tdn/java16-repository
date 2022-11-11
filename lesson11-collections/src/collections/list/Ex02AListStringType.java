package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AListStringType {
	public static void main(String[] args) {
		// interface: list-->
		// implementation : ArrayList & LinkList

		List<String> sequences = new ArrayList<>();
		sequences.add("A1"); // index=0;
		sequences.add("B2");
		sequences.add("C3");
		sequences.add("D4");
		System.out.println("size: " + sequences.size());
		loop(sequences);

		sequences.set(1, "B99");

		System.out.println("element[1] --> " + sequences.get(1));

		sequences.remove(0);// by index
		sequences.remove("D4");
		loop(sequences);// B99--C3

		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6");
		loop(sequences);

		removeIf(sequences, item -> item.compareTo("C") < 0);
		System.out.println("==========================");
		loop(sequences);

		sequences.removeIf(s -> s.compareTo("F") < 0);
		loop(sequences);

		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		loop(sequences);
		
		// Duyệt từng phần tử trong sequences
				// kiểm tra nếu có phần tử nào sequences[i].equals("A2") --> true
				// else --> false
		System.out.println("is A2 existed --> " + sequences.contains("A2"));
		sequences.remove("A2");
		System.out.println("is A2 existed --> " + sequences.contains("A2"));

		// sequences.remove("D4")
		// sequences.contains("D4")
	}

	private static boolean removeIf(List<String> elements, Condition c) {
		Iterator<String> iterator = elements.iterator();
		while (iterator.hasNext()) {
			String each = iterator.next();
			// if(each.compareTo("F")<0) {
			// test(each)--> strategy method
			if (c.test(each)) {
				iterator.remove();
			}

		}
		return true;
	}

	private static void loop(List<String> elements) {
		System.out.println("--------------------------");
		for (String element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}

interface Condition {
	boolean test(String element);
}
