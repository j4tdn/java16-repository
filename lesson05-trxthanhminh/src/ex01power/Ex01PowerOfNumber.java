package ex01power;

public class Ex01PowerOfNumber {
	public static void main(String[] args) {
		
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(10, 3));
	}
	
	private static boolean isPowerOf(int a, int b) {
		int x = a/b;
		int y = a%b;
		if (y == 1) {
			return false;
		}
		else {
			x = x/b;
			y = x&b;
			return true;
		}
	}
}
