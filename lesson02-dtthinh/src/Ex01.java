import java.util.Scanner;

public class Ex01 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Nhập số cần xét tính lũy thừa của 2: ");
		int num1 = sc.nextInt();
		if (isPowerOfTwo(num1)) {
			System.out.println(num1 + " là lũy thừa của 2.");
		} else {
			System.out.println(num1 + " không phải là lũy thừa của 2.");
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
