package datastructure;

public class Ex12SwapInt {

	public static void main(String[] args) {
		int a = 22;
		int b = 66;
		// swap in main method
//		int temporaty = a;
//		a = b;
//		b = temporaty;
		// create separate method to swap
//		a = (a + b);
//		b = a - b;
//		a = a- b;
		swap(a, b);
		System.out.println("a HD= " + a);
		System.out.println("b HD= " + b);
	}
	private static void swap(int first, int second) {
		int temporary = first;
		first = second;
		second = temporary;
	}

}
