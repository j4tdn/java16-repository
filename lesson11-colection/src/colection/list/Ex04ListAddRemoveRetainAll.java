package colection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04ListAddRemoveRetainAll {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		list2.add("F");
		
		List<String> listAddAll = new ArrayList<String>(list1);
		listAddAll.addAll(list2);
		printf(" hop",listAddAll);
		
		List<String> listRemoveAll = new ArrayList<String>(list1);
		listRemoveAll.removeAll(list2);
		printf(" hieu",listRemoveAll);
		
		List<String> listRetainAll = new ArrayList<String>(list1);
		listRetainAll.retainAll(list2);
		printf(" giao",listRetainAll);
	}
	private static void printf(String prefix, List<String> elements) {
		System.out.println(prefix + "--->");
		for(String element: elements) {
			System.out.println(element +" ");
		}
	}

}
