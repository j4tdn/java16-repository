package ex02;

public class PowerNumber {
	public static void main(String[] args) {
		int a = 2;
		int b = 8;
		System.out.println(isPowerOf(a, b));
		a = 8;
		b = 2;
		System.out.println(isPowerOf(a, b));
	}

	public static boolean isPowerOf(int a, int b) {
		if (a == 1 || b == 1) {
			return true;
		}
		int tempA = a;
		int tempB = b;
		while (tempA % tempB == 0) {
			tempA = tempA / tempB;
		}
		if (tempA == 1) {
			return true;
		}
		while (tempB % tempA == 0) {
			tempB = tempB / tempA;
		}
		if (tempB == 1) {
			return true;
		}
		return false;
	}
}
