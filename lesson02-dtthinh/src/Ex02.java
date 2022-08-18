import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		int a, b, c, d;
		a = new Random().nextInt(10);
		System.out.println("Số thứ nhất là : " + a);
		b = new Random().nextInt(10);
		System.out.println("Số thứ hai là : " + b);
		c = new Random().nextInt(10);
		System.out.println("Số thứ ba là : " + c);
		d = new Random().nextInt(10);
		System.out.println("Số thứ tư là : " + d);
		long sum = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.println(
				"S=" + a + "! +" + b + "! +" + c + "! +" + d + "! " + "= " + sum);

	}
	
	private static long factorial(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact ;
	}

}