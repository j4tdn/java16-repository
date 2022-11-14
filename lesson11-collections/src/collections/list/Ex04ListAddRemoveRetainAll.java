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
		list2.add("D");
		list2.add("E");
		list2.add("F");
		
		List<String> listAddAll = new ArrayList<>(list1);
		listAddAll.addAll(list2);
		printf("Hợp: ",listAddAll);
		
		
	}
	private static void printf(String prefix, List<String> items) {
		System.out.print(prefix + "--> ");
		for (String item:items) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
