package datastructure;

public class Ex12Swapint {
	public static void main(String[] args) {
		int a = 22;
		int b = 66;
		// swap in main method
		//int temporary = a;
		//a = b;
		//b = temporary;
		
		//a = a + b;
		//b = a - b;
		//a = a - b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		// create separate method to swap
		swap(a, b);
	}
	private static void swap(int first, int second) {
		int temporary = first;
		first = second;
		second = temporary;
	}

}
