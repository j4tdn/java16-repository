package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02ListStringType {
	public static void main(String[] args) {
		List<String> sequences = new ArrayList<>();
		
		sequences.add("E1");
		sequences.add("F3");
		sequences.add("A3");
		sequences.add("F3");
		
		System.out.println(sequences.size());
		loop(sequences);
		
		sequences.removeIf(o->o.compareTo("E") > 0);
		loop(sequences);
		
		
		
	}
	
	private static void loop(List<String> list) {
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		System.out.println("=====================");
		
		
	}
}
