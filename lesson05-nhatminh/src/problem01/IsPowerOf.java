package problem01;

import java.util.Scanner;

public class IsPowerOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so test case: ");
		int Try = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= Try; i++) {
			System.out.println("Test case " + i + ":");
			System.out.print("\tNhap so a: ");
			int a = Integer.parseInt(sc.nextLine());
			System.out.print("\tNhap so b: ");
			int b = Integer.parseInt(sc.nextLine());
			System.out.printf("\t(%d, %d)->%b\n", a, b, isPowerOf(a, b));
		}
		System.out.println("Done!");
	}

	public static boolean isPowerOf(int a, int b) {
		// SET |a|: higher number, |b|: smaller number
		if (Math.abs(b) > Math.abs(a)) {
			a += b;
			b = a - b;
			a -= b;
		}
		// If b equals to 0
		if (b == 0)
			if (a == 0)
				return true;
			else
				return false;
		// If b equals to 1
		// Because if 0 appears so a=1 b=0 and b can't equals to 1
		if (b == 1)
			return true;
		// If b equals to -1
		if (b == -1)
			if (a == 1 || a == -1)
				return true;
			else
				return false;
		// b will be divide until b==a (if true)
		while (a != b && a % b == 0)
			a /= b;
		if (a != b)
			return false;
		return true;
	}
}
