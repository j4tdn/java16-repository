package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		// Tìm tổng 2 số, 3 số, n số nguyên
		System.out.println("sum2: " +sum(2,4));
		System.out.println("sum3: " +sum(2,4,6));
		System.out.println("sum4: " +sum(2,4,6,8));
	}
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	private static int sum(int... numbers) {
	int sum = 0;
	for (int number: numbers) {
		sum+=number;
	}
	return sum;
	}
	
	

}


