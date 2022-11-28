package colection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class Ex02ArrayListStringType {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<String>();
		sequences.add("A1");
		sequences.add("B2");
		sequences.add("C3");
		sequences.add("D4");
		System.out.println(sequences.size());
		loop(sequences);
		
		sequences.set(1, "B99");
		loop(sequences);
		sequences.remove(0);
		loop(sequences);
		sequences.add("E5");
		sequences.add("F6");
		sequences.add("G7");
		loop(sequences);
		
		removeif(sequences, e -> e.compareTo("C") < 0);
		System.out.println("============");
		loop(sequences);
		System.out.println(sequences.contains("D4"));
	}
	private static void loop(List<String > s) {
		for(String ss:s) {
			System.out.println(ss +"");
		}
		System.out.println();
	}
	private static boolean removeif(List<String> s, condition c) {
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			String e = i.next();
			if(c.test(e)) {
				i.remove();
			}
			
		}
		return true;
	}
	interface condition{
		boolean test(String s);
	}

}
