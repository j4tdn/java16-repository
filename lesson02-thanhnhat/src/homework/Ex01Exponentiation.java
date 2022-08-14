package homework;

public class Ex01Exponentiation {
	public static void main(String[] args) {
		int[] numbers = { 2, 0, 4, 8, 12, 66, 45, 128, 100 };
		for (int number : numbers) {
			// 1st way
			System.out.println(number + " => " + isPowerOfTwo(number));
			// System.out.println(b + " => " + isPowerOf(2,n));

		}

	}
	/*
	 * // 2nd way //* b is power of a ==> a^n = b ==> conditon (b>0, n is integer)
	 * private static boolean isPowerOf(int a, int b) { if (b<=0) { return false; }
	 * double n = Math.log(b)/Math.log(a); return Math.ceil(n) == Math.floor(n); }
	 */

	private static boolean isPowerOfTwo(int number) {
		if (number <= 0) {
			return false;
		}
		while (number != 1) {
			if (number % 2 != 0) {
				return false;
			}
			number /= 2;
		}
		return true;

	}
}
