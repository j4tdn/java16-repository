package datastructure;

import bean.CustomInteger;

public class Ex12SwapSolution {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a: " + a);
		
		CustomInteger nA = new CustomInteger(22);
		CustomInteger nB = new CustomInteger(66);
		swap(nA, nB);
		System.out.println("nA: " + nA);
		System.out.println("nA: " + nB);
		// Object#toString getClass().getName()@hex
	}
	
	// CustomInteger first = nA;
	// CustomInteger second = nB;
	private static void swap(CustomInteger first, CustomInteger second) {
		int tmp = first.value;
		first.value = second.value;
		second.value = tmp;
	}
}
