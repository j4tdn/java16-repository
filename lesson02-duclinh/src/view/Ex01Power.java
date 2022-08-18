package view;

import java.util.Scanner;

public class Ex01Power {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		do {
			System.out.println("nhập số: ");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));
		int n = Integer.parseInt(numberAsText);

		boolean result = isPowerOfTwo(n);
		System.out.println(n + " luỹ thừa của 2 là: " + result);

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
