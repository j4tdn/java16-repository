package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04ListAddRemoveRetainAll {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("D");
		list2.add("E");
		list2.add("F");
		
		List<String> listAddAll = new ArrayList<>(list1);
		listAddAll.addAll(list2);
		printf("hop" ,listAddAll);
		
		List<String> listRemoveAll = new ArrayList<>(list1);
		listRemoveAll.removeAll(list2);
		printf("hieu" ,listAddAll);
		
		List<String> listRetailAll = new ArrayList<>(list1);
		listRetailAll.retainAll(list2);
		printf("giao" ,listAddAll);
		
	}
	
	private static void printf(String prefix , List<String> elements) {
		for(String element: elements) {
			System.out.print(prefix + "-->" + element +" " );
		}
	}
}
