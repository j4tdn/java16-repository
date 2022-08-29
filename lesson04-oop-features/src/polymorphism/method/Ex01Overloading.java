package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		// Tìm tổng 2, 3, n số
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println("Sum 2: " + sum(4, 6));
		System.out.println("Sum 3: " + sum(4, 6, 8));
		System.out.println("Sum n: " + sum(1,2,3,4));
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
	
	private static int sum(int... numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
		
	}
}

