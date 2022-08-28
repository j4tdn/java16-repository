package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		// tìm tổng 2 số, 3 số, n số - nguyên
		System.out.println("sum 2: " + sum(4, 6));
		System.out.println("sum 3: " + sum(11, 12, 13));
		System.out.println("sum 4: " + sum(1, 2, 3, 9));
		System.out.println("sum n: " + sum(12, 13, 14, 16));
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
	private static int sum(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		return sum;
	}
}
