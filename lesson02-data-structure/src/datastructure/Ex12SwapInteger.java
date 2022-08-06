package datastructure;

import bean.CustomInteger;
public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a = 22;
		Integer b = 66;
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	// Integer first = a;
	// Integer second = b;
	// JAVA pass by VALUE at STACK
	// không thể thay đổi giá trị của biến ở STACK truyền vào
	private static void swap(int first, int second) {
		int temporary = first;
		first = second;
		second = temporary;
	}

}
