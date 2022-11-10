package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeDemo {
	public static void main(String[] args) {
		// Before JDK 1.5
		//  --> Raw type --> KDL cần một generic type
		// RUNTIME error(not good)
		List list = new ArrayList<>();

		list.add(15);
		list.add(25);
		//list.add("abc");
		
		//double each value in list
		for (Object object: list) {
			System.out.println(Integer.parseInt(object.toString()));
		}
		
		// From JDK 1.5
		// List<E> ==> E ==> generic type
		// Compile time error
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		// numbers.add("hello");

	}
}
