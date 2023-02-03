package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		// TÌm tổng 2 số, 2 số , n số nguyên
		System.out.println("sum:" + sum2(4, 6));
		System.out.println("sum:" + sum3(4, 6, 8));
	}

	private static int sum2(int a, int b) {
		return a + b;
	}

	private static int sum3(int a, int b, int c) {
		return a + b + c;
	}

	@SuppressWarnings("unused")
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}