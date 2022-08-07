package datastucture;

import bean.CustomInteger;

public class Ex12SwapSolution {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(22);
		CustomInteger b = new CustomInteger(66);
		// Swap in main method
		System.out.println("Result: ");
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	private static void swap(CustomInteger first, CustomInteger second) {
		first.value += second.value;
		second.value = first.value - second.value;
		first.value -= second.value;
	}
}