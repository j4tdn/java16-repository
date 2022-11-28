package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeDemo {

	public static void main(String[] args) {
		// Before JDK 1.5
		// raw type --> KDL can 1 generic type
		// --> minh khong khai bao generic type
		// --> raw type --> tu hieu Object
		
		List list = new ArrayList();
		list.add(15);
		list.add(20);
		list.add("abc");
		
		// double each value in list 
		for (Object object: list) {
			System.out.println(Integer.parseInt(object.toString()) * 2);
		}
		
		// From JDK 1.5

	}

}