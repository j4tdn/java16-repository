package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeDemo {

	public static void main(String[] args) {
		// Before JDK 1.5
		// ray type --> KDL cần một generic type
		// --> mình không khai báo generic type
		// --> raw type --> tự hiểu Object
		//RUNTIME error (not good)
		List list = new ArrayList();
		list.add(25);
		list.add("abc");
		
		//double each value in list
		for (Object object: list) {
			System.out.println(Integer.parseInt(object.toString()) * 2);
		}
		
		// From JDK 1.5
		// List<E> ==> E ==> generic type
		//COMPILE time error
		List<Integer> numbers = new ArrayList<>();
		numbers.add(15);
	}

}
