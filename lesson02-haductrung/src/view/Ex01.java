package view;

public class Ex01 {
	public static void main(String[] args) {
		int a = 812;
		if (isPowerOfTwo(a) == true) {
			System.out.println(a + " la luy thua cua 2");
		} else {
			System.out.println(a + " khong phai la luy thua cua 2");
		}

	}

	public static boolean isPowerOfTwo(int n) {
		if (0 == n || 1 == n)
			return true;
		int x = n / 2;
		int y = n % 2;
		if (1 == y)
			return false;
		return isPowerOfTwo(x);
	}

}
