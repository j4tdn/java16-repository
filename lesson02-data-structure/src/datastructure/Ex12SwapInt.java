package datastructure;

import bean.CustomInteger;

public class Ex12SwapInt {
	public static void main(String[] args) {
		CustomInteger nA = new CustomInteger(22);
		CustomInteger nB = new CustomInteger(66);
		// swap in main method
		//int temporary = a;
		//a = b;
		//b = temporary;
		//a = a + b;
		//b = a - b;
		//a = a - b;
		swap(nA, nB);
		System.out.println("a: " + nA);
		System.out.println("b: " + nB);
		
		// create separate method to swap
	}
	private static void swap(CustomInteger first, CustomInteger second) {
		int tmp = first.value;
		first.value = second.value;
		second.value = tmp;
	}
}
