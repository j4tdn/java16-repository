package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeDemo {
	public static void main(String[] args) {
		// before JDK 1.5
		// raw type --> KDl cần một generic type
		// --> mình không khai báo generic type
		// --> raw type --> tự hiểu Object
		
		// RUNTIME error (not good)
		List list =  new ArrayList();
		list.add(15);
		list.add(25);
		list.add("abc");
		
		// double each value in list
		for (Object object : list) {
			System.out.println(Integer.parseInt(object.toString()) * 2);
		}
		
		// from JDK 1.5
		// List<E> ==> E ==> generic type
		// COMPIPE time error 
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(10);
		// numbers.add("hello");
		
	}
}
