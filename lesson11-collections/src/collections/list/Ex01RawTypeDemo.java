package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeDemo {
	public static void main(String[] args) {
		//before = JDK 1.5
		//raw type-->kiểu dữ liệu càn 1 kiểu generic type
		//--> mình không khai báo generic type
		//-->raw type --> tự hiểu object
		
		//RUN TIME ERROR
		List list = new ArrayList<>();
		list.add(15);
		list.add(25);
		list.add("abc");
		
		//double each value in list
		for(Object object: list) {
			System.out.println(Integer.parseInt(object.toString())*2);
		}
		
		//From JDK 1.5
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		//numbers.add("hello");
	}

}
