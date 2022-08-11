package homework;

import java.util.Scanner;

public class Ex03CheckNumberSymmetry {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số cần kiểm tra: ");
		int n = scanner.nextInt();
		int c = symmetricalNum(n);
		if (c == 1)
			System.out.println(n + " là số đối xứng");
		else
			System.out.println(n + " không phải là số đối xứng");
	}

	private static int reverseNum(int n) {
		int r = 0;
		while (n > 0) {
			r = r * 10 + n % 10;
			n /= 10;
		}
		return r;
	}

	private static int symmetricalNum(int n) {
		int s = 0;
		if (reverseNum(n) == n)
			s = 1;
		return s;
	}
}
