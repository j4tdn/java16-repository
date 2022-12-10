package polymorphism.methods;

public class Ex01Overloading {
	public static void main(String[] args) {
		// Tìm tổng 2 số, 3 số, n số
		
		System.out.println("sum2: " + sum(5,6));
		System.out.println("sum3: " + sum(5,6,7));
		System.out.println("sum4: " + sum(5,6,1,2));

		
	}
	
	private static float sum(float a, float b) {
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
		for (int number:numbers) {
		sum += number;
		}
		return sum;
	}
	}
