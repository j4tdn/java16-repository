package view;

/**
 * Bài 1: Viết chương trình kiểm tra 1 số có phải là lũy thừa của 2 hay không
 */

public class Ex01PowerOf2 {
	public static void main(String[] args) {
		isPowerOf2(4);
		System.out.println(isPowerOf2(0));
	}

	public static boolean isPowerOf2(int number) {
		if (number == 0) {
			return false;
		}

		if (number == 1) {
			return true;
		}

		while (true) {
			if (number == 2) {
				break;
			}
			if (isOdd(number)) {
				return false;
			}
			number = number / 2;
		}

		return true;
	}

	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}
