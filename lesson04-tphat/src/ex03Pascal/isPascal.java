package ex03Pascal;

import java.util.Scanner;

public class isPascal {
	public static int isPascal(int r, int c) {
		if (r == 0 || r == c) {
			return 1;
		} else {
			return isPascal(r - 1, c - 1) + isPascal(r, c - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		for (int row = 1; row <= n + 1; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(isPascal(col, row) + " ");
			}
			System.out.println("");
		}
	}
}
