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
		list2.add("b");
		list2.add("F");
		
		//copy tất cả các element list 1 vào listAddAll
		List<String> listAddAll = new ArrayList<>(list1);
		listAddAll.addAll(list2);		
		printf("hợp",listAddAll);
		List<String> listRemoveAll = new ArrayList<>(list1);
		listRemoveAll.removeAll(list2);		
		printf("hiệu",listRemoveAll);
		List<String> listRetainAll = new ArrayList<>(list1);
		listRetainAll.retainAll(list2);		
		printf("retain",listRetainAll);
		
	}
	
	private static void printf(String prefix,List<String> elements) {
		System.out.println();
		System.out.print(prefix+":"+"---->");
		for(String element:elements) {
			System.out.print(element+" ");
		}
	}
}
