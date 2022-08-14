package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		int a = 22;
		int b = 66;
		
		// Swap in main method
		// int temporary = a;
		// a = b;
		// b = temporary;
		
		a = a + b;
		b = a - b;
		a = a - b;
		swap(a, b);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		// Creat separater method to swap
	}
	private static void swap(int first, int second) {
		int temporary = first;
		first = second;
		second = temporary;
	}
	

}
