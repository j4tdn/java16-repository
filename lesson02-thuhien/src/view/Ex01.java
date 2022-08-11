package view;

public class Ex01 {
	public static void main(String[] args) {
		int number =16;
		if (isPowerOfTwo(number)) {
			System.out.println(number + ":Valid number!");
		} else {
			System.out.println(number + ":Invalid number!");
		}
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 0 || n == 1) {
			return true;
		}
		int x = n / 2;
		int y = n % 2;
		if (y == 1)

			return false;
		return isPowerOfTwo(x);
	}

}
