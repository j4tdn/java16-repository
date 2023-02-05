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
		sequences.add("C3");
		System.out.println("size:" + sequences.size());
		loop(sequences);
		
		sequences.set(1, "B99");

		System.out.println("element[1]-->" + sequences.get(1));
		sequences.remove(0); //by index
		sequences.remove("D4"); //by value
		loop(sequences);
		
		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6"); //B99, C3, E4, F5, G6
		//concurrentModificationException 
		//-->khi 1 phần tử đang được thao tác/ xử lý bởi 1 process
		//--> không thể được truy cập bởi process khác
		// strategy pattern 
		// Condition c= c1;
		
		loop(sequences);
		//Duyệt từng phần tử trong sequences
		//Kiểm tra nếu có phần tử nào sequences[i].equals("A2)-->true
		// else-->fase
	}
	// capacity --> length of element
	private static boolean removeIf(List<String> elements, Condition c) {
		boolean removed = false;
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			if (c.test(iterator.next())){
				iterator.remove();
				removed = true;
			}
		}
	return removed;	
	}

	private static void loop(List<String> elements) {

		System.out.println("===========");
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i) + "");
		}
		for (String element : elements) {
			System.out.println(element + " ");

		}
		System.out.println();
	}
}
@FunctionalInterface
interface Condition {
	boolean test(String element);
}
