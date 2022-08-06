package datastructure;

import bean.CustomInteger;

public class Ex12SwapSolution {
	public static void main(String[] args) {
		CustomInteger nA = new CustomInteger(22);
		CustomInteger nB = new CustomInteger(66);
		swap(nA, nB);
		System.out.println("nA: " + nA);
		System.out.println("nB: " + nB);
		// Object#toString getClass().getName()@hẽ
	}
	
	//CustomInteger first = nA;
	//CustomInteger second = nB;
	private static void swap(CustomInteger first, CustomInteger second) {
		int temporary = first.value;
		first.value  = second.value;
		second.value = temporary;
	}
}

