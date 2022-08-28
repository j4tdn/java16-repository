package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		// Tìm tổng 2 số, 3 số, n số nguyên
		System.out.println("sum2: " + sum(4, 6));
		System.out.println("sum3: " + sum(4, 6, 8));
		System.out.println("sum4: " + sum(1, 2, 3, 4));

	}
	
	private static float sum(float a, float b) {
		return a + b;
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	private static int sum3Numbers(int a, int b, int c) {
		return a + b + c;
	}
	
	private static int sum4Numbers(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	private static int sum(int[] numbers) {
		int sum=0;
		for(int number: numbers) {
			sum += number;
		}
		return sum;
	}
}
