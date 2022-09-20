package view;

public class Ex07Fraction {
	public static void main(String[] args) {
		int a = 800;
		int b = 10000;
		System.out.println("phan so toi gian cua " + a + "/" + b);
		System.out.println(fraction(a, b));
		
	}
	
	public static String fraction(int numerator, int denominator) {
		int k = gcd(numerator, denominator);
		System.out.println("k = " + k);
		
		return numerator/k + " / " + denominator/k ;
	}
	
	public static int gcd(int a, int b) {
		if( a== b) return a;
		else return a > b ? gcd(a-b,b) : gcd(a, b-a);
		

	}

}
