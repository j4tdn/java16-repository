package exam;

public class ex01PowerOf {
	public static void main(String[] args) {
		if (isPowerOf(2, 10) == false) {
			System.out.println("false");
		} else
			System.out.println("true");
	}

	private static boolean isPowerOf(int a, int b) {
		int temp = 0;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		while (a != b) {
			if (a % b == 0) {
				return false;
			}
			a /= b;
		}
		return true;
	}
}
