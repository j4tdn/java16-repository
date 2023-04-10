package view;

/**
 * 
 * Least Common Multiple = Bội chung nhỏ nhất
 * 
 * Greatest Common Divisor = Ước chung lớn nhất
 *
 */
public class Ex03LCM {
	public static void main(String[] args) {
		// validation
		int[] elements = { 2, 3, 4, 5 };
		System.out.println("LCM: " + getLeastCommonMultiple(elements));
	}

	private static int getLeastCommonMultiple(int[] elements) {
		if (elements.length == 0) {
			throw new IllegalArgumentException("At least 1 elements");
		}
		if (elements.length == 1) {
			return elements[0];
		}
		int result = lcm(elements[0], elements[1]);
		for (int i = 2; i < elements.length; i++) {
			result = lcm(result, elements[i]);
		}
		return result;
	}

	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
