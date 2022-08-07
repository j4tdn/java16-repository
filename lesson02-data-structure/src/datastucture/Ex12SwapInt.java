package datastucture;

public class Ex12SwapInt {
	public static void main(String[] args) {
		Integer a = new Integer(22);
		Integer b = new Integer(66);

		// Swap in main method
		System.out.println("Result: ");
//		int temp = a;
//		a = b;
//		b = temp;
//		a = a + b;
//		b = a - b;
//		a = a - b;
		// Create separate method to swap
		swap(a, b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	private static void swap(Integer first, Integer second) {
		first += second;
		second = first - second;
		first -= second;
	}
}
