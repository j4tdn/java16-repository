package ex01_ispowerof;

public class Main {
	public static void main(String[] args) {
		System.out.println(isPower(2, 8));
		System.out.println(isPower(8, 2));
		System.out.println(isPower(3, 13));
		System.out.println(isPower(3, 27));
		System.out.println(isPower(12, 14));
	}

	public static boolean isPower(int a, int b) {
		if (a <= 0 && b <= 0) {
			return false;
		}
		double n = a > b ? (Math.log(a) / Math.log(b)) : (Math.log(b) / Math.log(a));
		return Math.ceil(n) == Math.floor(n);
	}

}
