package datastructure;

import bean.Number;

public class Ex12SwapInt {
	public static void swap(Number a, Number b) {
		int temp = a.num;
		a.num = b.num;
		b.num = temp;
		System.out.println("a = "+a.num);
		System.out.println("b = "+b.num);
	}
	
	public static void main(String[] args) {
		Number a = new Number(5);
		Number b = new Number(7);
		swap(a, b);
		System.out.println("a = "+a.num);
		System.out.println("b = "+b.num);
	}
}
