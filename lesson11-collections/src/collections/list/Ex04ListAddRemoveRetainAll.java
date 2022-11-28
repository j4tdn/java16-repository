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
		list2.add("A");
		list2.add("B");
		list2.add("C");
		
		List<String> listAddAll = new ArrayList<>(list1);
		listAddAll.addAll(list2);
		printff("list1", list1);
		printff("list2", list2);
		printff("Hợp", listAddAll);
		System.out.println("====================");
		list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		
		listAddAll = new ArrayList<>(list1);
		listAddAll.removeAll(list2);
		printff("list1", list1);
		printff("list2", list2);
		printff("Hiệu", listAddAll);
		System.out.println("====================");
		list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("F");
		
		listAddAll = new ArrayList<>(list1);
		listAddAll.retainAll(list2);
		printff("list1", list1);
		printff("list2", list2);
		printff("Giao", listAddAll);

	}
	
	private static void printff(String prefix, List<String> elements) {
		System.out.print(prefix + " ---> :");
		for (String string : elements) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

}
