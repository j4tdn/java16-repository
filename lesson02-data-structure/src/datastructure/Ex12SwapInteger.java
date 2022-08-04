package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a = 22; // H1 
		Integer b = 66; // H2 
		swap(a, b);
		System.out.println("a: " + a); // 
		System.out.println("b: " + b); // 
	}

	// Integer first = a;  // H1(22)
	// Integer second = b; // H2(66)
	// JAVA pass by VALUE at STACK
	// không thể thay đổi giá trị của biến ở STACK truyền vào
	private static void swap(Integer first, Integer second) {
		Integer temporary = first;
		first = second;
		second = temporary;
	}
}
