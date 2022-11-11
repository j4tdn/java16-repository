package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AListStringType {
	// interface: List --> dynamic array
	// implementation: ArrayList & LinkList
	
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("A1");	// index = 0
		sequences.add("B2");
		sequences.add("C3");
		sequences.add("D4");
		System.out.println("size: " + sequences.size());
		loop(sequences);
		sequences.set(1, "B99");
		System.out.println("element[1] --> " + sequences.get(1));
		
		sequences.remove(0); // by index
		sequences.remove("D4"); // by value
		loop(sequences); // B99, C3
		
		sequences.add("E5");
		sequences.add("F6");
		sequences.add("G4");
		loop(sequences);
		
		// removeIf(sequences, item -> item.compareTo("C") < 0);
		System.out.println("======================");
		loop(sequences);
		
		System.out.println("======================");
		sequences.removeIf(s -> s.compareTo("E") < 0);
		loop(sequences);
		
		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		loop(sequences);
		
		// Duyệt từng phần tử trong sequences
		// kiểm tra nếu có phần tử nào sequences[i].equals("A2") --> true
		// else --> fale
		
		System.out.println("Is A2 existed --> " + sequences.contains("A2"));
		sequences.remove("A2");
		System.out.println("Is A2 existed --> " + sequences.contains("A2"));
		
		// sequences.remove("D4");
		// sequences.contains("D4");
		
	}
	// ConcurrentModificatikonException
	// --> khi 1 phần tử đang được thao tác/xử lý bởi 1 process
	// --> không thể truy cập được bởi process khác
	// strategy pattern
	// Condition c = c1;
	
	private static boolean removeIf(List<String> elements, Condition c) {
		boolean removed = true;
		Iterator<String> iterator = elements.iterator();
		while (iterator.hasNext()) {
			String each = iterator.next();
			// each.compareTo("F") < 0
			// test(each) --> Strategy method
			if (c.test(iterator.next())) {
				iterator.remove();
				removed = true;
			}
		}
		return removed;
	}
	
	// Capacity  --> length of elementData
	// size      --> non-null element in elements
	// ArrayList --> size
	private static void loop(List<String> elements) {
		System.out.print("--------> ");
		for (String element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}

interface Condition{
	boolean test(String elements);
}
