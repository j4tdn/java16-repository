package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		// Tim tong 2 so, 3 so, n so - nguyen
		System.out.println("sum2: " + sum(4, 6));
		System.out.println("sum2: " + sum(4, 6, 8));
		System.out.println("sum2: " + sum(1, 2, 3, 4));
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
