package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02AlistStringType {
	// interface: List --> dynamic array
	// implementation: ArrayList & LinkList
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		sequences.add("A1");
		sequences.add("B1");
		sequences.add("C3");
		sequences.add("C3");
		System.out.println("size: "+ sequences.size());
		loop(sequences);
		
		sequences.set(1, "b99");
		System.out.println("element[1]: " +sequences.get(1));
		sequences.remove(0); // by index;
		sequences.remove("b99"); // value;
		loop(sequences);
		
		sequences.add("A1");
		sequences.add("A2");
		sequences.add("A3");
		
		//Duyệt từng phần tử trong sequences
		//kiểm tra nếu có phần tử nào sequences[i].equal("A2) --> true
		//else -->false
		System.out.println("Is A2 existed --> "+ sequences.contains("A2"));
		sequences.remove("A2");
		System.out.println("Is A2 existed -->" + sequences.contains("A2"));
		
		
		sequences.add("E4");
		sequences.add("F5");
		sequences.add("G6");
		loop(sequences);
		removeIf(sequences, item -> item.compareTo("G")< 0);
		loop(sequences);
		
		
	}
	// ConcurrentModificationException
	//-->Khi 1 phằn 
	private static void loop(List<String> elements) {
		System.out.println("-------------");
		for(String element: elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}
	// ConcurrentModificationExeptopn 
	//--> Khi 1 phần tử đang được thao tác/xử lý bởi 1 process
	// --> Khong thể đưuocj truy cập bởi process khác
	// strategy pattern
	// condition c= c1;
		private static boolean removeIf(List<String> elements, Condition c) {
			boolean removed = false;
			Iterator<String> iterator = elements.iterator();
			while(iterator.hasNext()) {
				//each.compareTo("F" < 0)
				//test.(each) -->strategy method
				if(c.test(iterator.next())) {
					iterator.remove();
					removed = true;
				}
			}
			return removed;
		}
}
@FunctionalInterface
interface Condition{
	boolean test(String element);
}
