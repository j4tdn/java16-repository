package homework;

public class Ex01Exponentiation {
	public static void main(String[] args) {
		int b = 7;
		if (isPowerOfTwo(b)) {
			System.out.println("a là luỹ thừa của 2");
		}
		else
		System.out.println("a không là luỹ thừa của 2");
	}

	public static boolean isPowerOfTwo(int n) {
		if (0 == n || 1 == n)
			return true;
		int x = n / 2;
		int y = n % 2;
		if (1 == y) return false;
		return isPowerOfTwo(x);
 
	}
}
