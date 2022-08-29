package polymorphism.method;

public class Ex01Overloading {
	public static void main(String[] args) {
		int a = 10;
		int b = 5 ;
		int c = 20;
		int d = 30;
	}
	private static int sum(int a,int b) {
		return a+b;
	}
	private static int sum(int a,int b,int c) {
		return a+b+c;
	}
	private static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	private static int sum(int... number) {
		int sum = 0;
		for (int i : number) {
			sum =sum +i;
		}
		return sum;
		
	}
}
