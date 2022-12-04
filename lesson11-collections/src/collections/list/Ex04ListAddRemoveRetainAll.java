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
		printf("Hợp", listAddAll);

		List<String> listRemoveAll = new ArrayList<>(list1);
		listRemoveAll.removeAll(list2);
		printf("Hiệu", listRemoveAll);

		List<String> listRetainAll = new ArrayList<>(list1);
		listRetainAll.retainAll(list2);
		printf("Giao", listRetainAll);
	}

	private static void printf(String prefix, List<String> elements) {
		System.out.print(prefix + " --> ");
		elements.forEach(e -> System.out.print(e + " "));
		System.out.println();
	}
}
