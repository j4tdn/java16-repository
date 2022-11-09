package collection.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ex02AListStringType {
	// interace: List
	// implementation: ArrayList & LinkedList
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("A1");
		sequences.add("B2");
		sequences.add("C3");
		sequences.add("D4");
		
		System.out.println("size: " + sequences.size());
		loop(sequences);
		sequences.set(1, "B99");
		System.out.println("elelments[1]" + sequences.get(1));
		
		sequences.remove(0);
		sequences.remove("D4");
		loop(sequences);
		
		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6");
		loop(sequences);
		
		removeIf(sequences, item -> item.compareTo("C" ) < 0);
		System.out.println("========== After removeIf ====");
		loop(sequences);
		
		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		loop(sequences);
		
		// Duyet tung fan tu trong sequences
		// Kiem tra neu co fan tu nao sequences[i].equals("A2") --> true
		// else -- false
		
		System.out.println("Is A2 existed --> " + sequences.contains("A2"));
		sequences.remove("A2");
		System.out.println("Is A2 existed --> " + sequences.contains("A2")); 
	}
	
	private static void loop(List<String> elements) {
		System.out.print("----------------> ");
		for(String element:elements) {
			System.out.print(element + " ");
		}
		System.out.println();
		
	}
	
	private static boolean removeIf(List<String> elements , Condition c) {
		boolean removed = false;
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			// each.compareTo("F") < 0
			// test(each) --> strategy method
			if(c.test(iterator.next())) {
				iterator.remove();
				removed = true;
			}
		}
		return removed;
	}
	// capacity --> length of elementData
	// size --> non-null elements in elementData
	// ArrayList --> size
}
interface Condition {
	boolean test(String element);
}
