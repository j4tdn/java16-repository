package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a = 22;
		Integer b = 66;
		// swap in main method 
		//int temporary = a;
		//a = b;
		//b = temporary;
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		
		// create separate method to swap
	}
	// Integer first = a;
	// Integer second = b;
	// JAVA PASS BY VALUE AT STACK 
	// Không thể thay đổi giá trị của biến ở STACK truyền vào
	private static void swap(Integer first, Integer second) {
		Integer temporary = first;
		first = second;
		second = temporary;
	}
}
