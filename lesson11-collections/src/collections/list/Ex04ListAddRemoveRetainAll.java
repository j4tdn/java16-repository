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
		printf("Hợp ", listAddAll);
		
		List<String> listRemoveAll = new ArrayList<>(list1);
		listAddAll.removeAll(list2);
		printf("Hiệu ", listRemoveAll);
		
		List<String> listRetailAll = new ArrayList<>(list1);
		listAddAll.retainAll(list2);
		printf("Giao ", listRetailAll);

	}
	public static void printf(String s, List<String> elements)
	{
		System.out.print(s + " -----> ");
		for(String element : elements)
		{
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
}
