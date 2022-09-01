package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		
		// Tìm tổng 2 số, 3 số, n số - nguyên, thực
				System.out.println("sum2: " + sum(4, 6));
				System.out.println("sum3: " + sum(4, 6, 8));
				System.out.println("sumn: " + sum(1, 2, 3, 4));
	}
	private static int sum(int a,int b) {
		return a+b;
	}
	private static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	private static int sum(int... number) {
		int sum = 0;
		for (int i : number) {
			sum =sum +i;
		}
		return sum;
		
	}
}
