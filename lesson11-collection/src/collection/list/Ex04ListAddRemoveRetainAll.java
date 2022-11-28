package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04ListAddRemoveRetainAll {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		List<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("F");
		
		List<String> listAddAll = new ArrayList<>(list);
		listAddAll.addAll(list2);
		printf( "Hop ", listAddAll);
		
		List<String> listRemoveAll = new ArrayList<>(list);
		listRemoveAll.removeAll(list2);
		printf( "Hieu ", listRemoveAll);
		
		List<String> listRetainAll = new ArrayList<>(list);
		listRetainAll.retainAll(list2);
		printf( "Giao ", listRetainAll);
		
	}
	private static void printf(String prefix, List<String> list) {
		System.out.print(prefix + " --> ");
		list.forEach(o -> System.out.print(o + " "));
		System.out.println();
	}
}
