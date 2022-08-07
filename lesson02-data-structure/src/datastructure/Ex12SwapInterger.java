package datastructure;

public class Ex12SwapInterger {
	public static void main(String[] args) {
		Integer a = 22; // H1
		Integer b = 66; // H2
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		// create separate method to swap
	}
	// Integer frist = a;
	// Integer second = b;
	// JAVA pass by VALUE at stack
	// khong the thay doi gia tri cua bien o stack truyen vao
	private static void swap(Integer first, Integer second) {
		Integer temporary = first;
		first = second;
		temporary = second;
	}
}
