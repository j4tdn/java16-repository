package colection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypeDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(15);
		list.add(25);
		list.add("abc");
		list.remove(0)
		//double each value in list
		for(Object s:list) {
			System.out.println(Integer.parseInt(s.toString()) * 2);
		}
		//Frpm JDK 1.5
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		
	}

}
