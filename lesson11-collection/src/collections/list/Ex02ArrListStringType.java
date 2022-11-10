package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//@Funtionna 
interface Condition{
	boolean test(String element);
		
	}

public class Ex02ArrListStringType {
	
	//interface : List
	
	//implementasion : 
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<String>();
		sequences.add("A1");
		sequences.add("b2");
		sequences.add("c3");
		sequences.add("d4");
		loop(sequences);
		sequences.set(1, "b99");
		System.out.println("sequeense[1] ===>"+sequences.get(1));
		sequences.remove(0);//by index
		loop(sequences);
		sequences.remove("c3");//by  value
		loop(sequences);
		sequences.add("e4");
		sequences.add("f5");
		sequences.add("g6");
		loop(sequences);
		System.out.println("");
		
	}
	private static void loop(List<String> elements) {
		System.out.println("----------");
		for (String element : elements) {
			System.out.println(element);
		}
	}
	private static void removeIf2(List<String> elements, Condition c) {
		Iterator<String> iteration = elements.iterator();
		while(iteration.hasNext()) {
			if(c.test(iteration.next())) {
				iteration.remove();
				
			}
		}
		
	}
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
