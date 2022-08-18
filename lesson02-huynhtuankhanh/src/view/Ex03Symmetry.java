package view;

import java.util.Scanner;

public class Ex03Symmetry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter symmetrical number:");
		int n = sc.nextInt();
		if (symmetry(n)) {
			System.out.print(n + ": is a symmetric number");
		}else {
			System.out.print(n + ": not a symmetric number");
		}
		
	}
	private static boolean symmetry(int n) {
		int m=0;
		int mtp = n;
		while (n > 0) {
			int x = n % 10;
			n = n / 10;
			m = m * 10 + x;
		}
		if (m == mtp) {
			return true;
		}else {
			return false;
		}
		
	}

}
