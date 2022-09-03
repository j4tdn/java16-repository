package polymorphism.method;

public class Ex01Overloading {
	// tìm tổng 2 số , 3 số , n số nguyên.
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
	}

	private static float sum(float a, float b) {
		return a + b;
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sum(int a, int b, int c) {
		return a + b + c;
	}

	private static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	private static int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
