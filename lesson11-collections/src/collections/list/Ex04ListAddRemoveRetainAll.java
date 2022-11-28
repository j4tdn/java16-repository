package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04ListAddRemoveRetainAll {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");

		List<String> list2 = new ArrayList<>();
		list1.add("D");
		list1.add("E");
		list1.add("F");
		
		List<String> listAddAll = new ArrayList<>(list1);
		listAddAll.addAll(list2);
		printf("Hop", listAddAll);
		
		List<String> listRemoveAll = new ArrayList<>(list1);
		listRemoveAll.removeAll(list2);
		printf("Hieu", listRemoveAll);
		
		List<String> listRetainAll = new ArrayList<>(list1);
		listRetainAll.retainAll(list2);
		printf("Giao", listRetainAll);
	}
	
	private static void printf(String prefix, List<String> elements) {
		System.out.println(prefix + "------>");
		for (String element :elements) {
			System.out.println(element + " ");
		}
		
	}
}
