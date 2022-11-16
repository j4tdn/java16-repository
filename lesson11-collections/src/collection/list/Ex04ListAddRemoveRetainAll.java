package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04ListAddRemoveRetainAll {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(); 
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		List<String> list2 = new ArrayList<>(); 
		list2.add("a");
		list2.add("b");
		list2.add("F");
		
		List<String> listAll = new ArrayList<>(list1); // gán listall = list1
		listAll.addAll(list2);
		prinf("Hợp", listAll);
		
		List<String> listRemoveAll = new ArrayList<>(list1);
		listRemoveAll.removeAll(list2);
		prinf("Hiệu", listRemoveAll);
		
		List<String> listRetainAll = new ArrayList<>(list1);
		listRetainAll.retainAll(list2);
		prinf("Giao", listRetainAll);
		
	}
	
	private static void prinf(String prefix, List<String> elements) {
		System.out.println(prefix + "------> ");
		for(String element : elements) {
			System.out.println(element + " ");
		}
		System.out.println();
	}
}
