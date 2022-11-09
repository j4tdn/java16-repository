package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AListStringType {
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
		System.out.println("elements[1] --> " + sequences.get(1));
		// Lúc compile get thuộc List lúc runtime get chuyển đế vùng nhớ heap của
		// ArrayList
		sequences.set(1, "B9");

		sequences.remove(0);
		sequences.remove("D4");

		loop(sequences);
		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6");

		loop(sequences);
		sequences.removeIf(s -> s.compareTo("C") > 0);
		loop(sequences);
		
		
//		sequences.remove("D4");
//		sequences.contains("D4");
		// Duyệt từng phần tử trong sequences
		// Kiểm tra nếu có phần tử nào sequences[i].equals("A2") -->true
		//else --> false
		System.out.println("Is A2 existed " + sequences.contains("A2"));

	}

	// ConcurrenModificationException
	// --> Khi 1 phần tử đang được thao tác/xử lí bởi 1 process
	// --> Không thể được truy cập bởi process khác
	// strategy pattern
	// Condition c = c1
	private static boolean removeIf(List<String> elements, Condition c) {
		boolean removed = false;
		final Iterator<String> iterator = elements.iterator();
		while (iterator.hasNext()) {
			if (c.test(iterator.next())) {
				iterator.remove();
				removed = true;
			}
		}
		return removed;
	}

	// capacity --> length of elementData
	// size --> non-null elements in elementData
	// ArrayList --> size
	private static void loop(List<String> elements) {
		System.out.print("-----------> ");
//		for(String element: elements)
//		{
//			System.out.print(element + " ");
//		}
		for (int i = 0; i < elements.size(); i++) {
			System.out.print(elements.get(i) + " ");
		}
		System.out.println();
		System.out.println();
	}
}

@FunctionalInterface
interface Condition {
	boolean test(String elements);
}
