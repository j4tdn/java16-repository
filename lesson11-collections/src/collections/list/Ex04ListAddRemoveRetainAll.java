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
		list2.add("a");
		list2.add("E");
		list2.add("F");

		List<String> listAddAll = new ArrayList<>(list1);
		listAddAll.addAll(list2);
		printf("Hop", listAddAll);

		List<String> listRemoveAll = new ArrayList<>(list1);
		listAddAll.removeAll(list2);
		printf("Hieu", listRemoveAll);

		List<String> listRetainAll = new ArrayList<>(list1);
		listAddAll.retainAll(list2);
		printf("Giao", listRetainAll);

	}

	private static void printf(String prefit, List<String> elements) {
		System.out.print(prefit + " --> ");
		for (String element : elements) {
			System.out.print(element + " ");
		}
	}

}
