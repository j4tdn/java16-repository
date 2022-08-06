package datastructure;

import bean.Integer2;

public class Ex12SwapInterger {

	public static void main(String[] args) {
		Integer2 a = new Integer2(22);
		Integer2 b = new Integer2(66);
		System.out.println("a: " + a + " b: " + b);
		swap(a, b);
		System.out.println("a: " + a + " b: " + b);
	}
	
	private static void swap(Integer2 a, Integer2 b) {
		int c = a.number;
		a.number = b.number;
		b.number = c;
	}
}
