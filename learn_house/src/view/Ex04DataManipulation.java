package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04DataManipulation {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		elements.add("A");
		elements.add("B");
		elements.add("C");
		elements.add("D");
		
		elements.removeIf(element -> element.compareTo("A") > 0);
		System.out.println("size " + elements.size() );
		System.out.println(elements);
		
 	}

}
