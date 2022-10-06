package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05AddRemove {
	public static void main(String[] args) {
		List<Integer> listA = Arrays.asList(1,2,3,5,5,6);
		List<Integer> listB = Arrays.asList(1,5,7,8,5,9,6);
		//add
		List<Integer> addList = new ArrayList<>(listA);
		addList.addAll(listB);
		
		System.out.println(addList);
		
		List<Integer> romoveAll = new ArrayList<>(listA);
		romoveAll.removeAll(listB);
		
		System.out.println(romoveAll);
	}

}
