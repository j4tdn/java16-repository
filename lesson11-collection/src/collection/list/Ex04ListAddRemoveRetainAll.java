package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04ListAddRemoveRetainAll {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");

		List<String> list2 = new ArrayList<>();
		list2.add("d");
		list2.add("e");
		list2.add("f");

		List<String> listAddAll = new ArrayList<>(list1);
		listAddAll.addAll(list2);
		prinf("Hop", listAddAll);

		List<String> listRemoveAll = new ArrayList<>(list1);
		listRemoveAll.removeAll(list2);
		prinf("Hieu", listRemoveAll);

		List<String> listRetainAll = new ArrayList<>(list1);
		listRetainAll.retainAll(list2);
		prinf("Giao", listRetainAll);
	}

	private static void prinf(String prefix, List<String> elements) {
		System.out.print(prefix + " --> ");
		for (String element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
