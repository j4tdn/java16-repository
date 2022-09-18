package fix;

/**
 * lcm: bcnn 
 * gcd: ucln
 * 
 * @author DucTrung đầu result=bcnn cua 2,3 
 * sau result=bcnn cua result ,4
 */

public class Ex03 {
	public static void main(String[] args) {
		int[] elements = { 2, 3, 4, 5 };
		// tích các số chia UCLN
		System.out.println(getLeastCommonMultiple(elements));
	}

	private static int getLeastCommonMultiple(int[] elements) {
		if (elements.length == 0) {
			throw new IllegalArgumentException("At least 1 element");
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
		while (a != b) {// 20 8=>4
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;// return b; vì a-b
	}

}
