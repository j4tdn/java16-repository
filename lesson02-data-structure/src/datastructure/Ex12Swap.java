package datastructure;

public class Ex12Swap {
	public static void main(String[] args) {
		int a = 22;
		int b = 66;
		// swap in main method
		int tmp = a;
		//a = b;
		//b = tmp;
		//a = a + b;
		//b = a - b;
		//a = a - b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		// create separate method to swap
	}

	private static void swap(int first, int second) {
		int tmp = first;
		first = second;
		second = tmp;

	}
}
