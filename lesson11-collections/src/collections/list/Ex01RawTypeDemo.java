package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeDemo {
	public static void main(String[] args) {
		// before jdk 1.5
		// raw type --> KDL cần một generic type
		// --> mình không khai báo generictype
		// --> raw type --> tự hiểu Object
		List list = new ArrayList<>();

		// RUNTIME error(not good)
		list.add(15);
		list.add(25);
		list.add("abc");

		// double each value in list
		for (Object object : list) {
			System.out.println(Integer.parseInt(object.toString()) * 2);
		}

		// from jdk 1.5
		// List<E> ==> E: generic type
		// COMPIPE time error
		List<Integer> number = new ArrayList<>();
		number.add(15);
		number.add(25);
	}
}
