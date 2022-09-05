package polymorphism;

public class Ex01OverLoading {
	public static void main(String[] args) {
		//tìm tổng 2 số, 3 số, n số (n: integer)
		System.out.println("sum2: " + sum(4,6));
		System.out.println("sum3: " + sum(4,6,10));
		System.out.println("sumn: " + sum(4,6,10,12));
		System.out.println("sum-float-2: " + sum(4.2,6.7));
	}
	
	private static double sum(double a, double b) {
		return a+b;
	}
	
	private static int sum(int a, int b) {
		return a+b;
	}

	private static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	private static int sum(int... numbers) {
		int sum = 0;
		for (int number: numbers) {
			sum += number;
		}
		return sum;
	}
}
