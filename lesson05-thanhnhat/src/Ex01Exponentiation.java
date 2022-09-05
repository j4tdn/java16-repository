
public class Ex01Exponentiation {
	public static void main(String[] args) {
		System.out.println(isPowerOf(2, 8));
	}

	private static boolean isPowerOf(int a, int b) {
		if (a == 0 || b == 0) {
			return false;
		}
		int number = 0;
		int temp = 0;
		if (a > b) {
			number = b;
			temp = a;
		} else
			number = a;
		temp = b;
		for (int i = 0; i < 20; i++) {
			int sum = 1;
			while (sum <= temp) {
				sum = sum * number;
				if (sum != temp) {
					return false;
				} else
					return true;
			}
		}
		return isPowerOf(a, b);

	}

}
