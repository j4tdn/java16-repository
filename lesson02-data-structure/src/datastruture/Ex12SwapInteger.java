package datastruture;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		Integer a = 22;
		Integer b = 66;
		swap(a, b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
	// int first = a;
	// int second = b;
	// Java: pass by VALUE at STACK
	// không thể thay đổi giá trị của cái biến ở STACK truyền vào
	private static void swap(Integer first, Integer second) {
		Integer temp = first;
		first = second;
		second = temp;
	}
}
