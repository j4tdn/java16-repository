package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeDemo {

	public static void main(String[] args) {
		// Before JDK 1.5
		List list = new ArrayList();
		list.add(15);
		list.add(25);
		list.add("123");
			
		for (Object object : list) {
			System.out.println(Integer.parseInt(object.toString()) * 2);
		}
		
		// From JDL 1.5
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		for (Integer integer : numbers) {
			System.out.println(integer * 2);
		}
		
	}

}
