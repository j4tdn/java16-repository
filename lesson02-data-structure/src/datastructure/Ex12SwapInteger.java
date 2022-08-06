package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a = 33;
		Integer b = 66;
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// create separate method to swap
	}
	// Integer first = a;
	// Integer second = b;
	// JAVA pass by VALUE at STACK
	// Khong the thay doi gia tri cua bien o STACK truyen vao
	private static void swap(Integer first, Integer second) {
		Integer temporary = first;
		first = second;
		second = temporary;
	}
}
