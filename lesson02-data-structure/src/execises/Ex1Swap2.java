package execises;

public class Ex1Swap2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		swap(a, b);
	}
	private static void swap(int a, int b) {
		int temporary;
		temporary = a;
		a = b;
		b = temporary;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
