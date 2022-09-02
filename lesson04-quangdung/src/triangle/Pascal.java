package triangle;

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n = ");
		int n = sc.nextInt();
		tgPascal(n);
	}

	private static void tgPascal(int n) {
		int[][] a = new int[n+2][n+2];
		int row, col;
		for (row = 0; row < n+2; row++) {
			a[row][0] = 1;
			for (col = 1; col <= row; col++) {
				a[row][col] = a[row - 1][col - 1] + a[row - 1][col];
			}
		}
		for (row = 0; row < n+2; row++) {
			for (col = 0; col <= row; col++) {
				System.out.print(a[row][col] + "\t");
			}
			System.out.println();

		}

	}
}
