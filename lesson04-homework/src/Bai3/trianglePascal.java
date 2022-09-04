package Bai3;

import java.util.Scanner;

public class trianglePascal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("\n\nNhập n: ");
		int h = sc.nextInt();
		int[][] a = new int[h + 1][h + 2];
		for (int i = 0; i <= h; i++) {
			a[i][0] = 1;
			a[i][i + 1] = 1;
			for (int j = 1; j <= i; j++) {
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}
		for (int i = 0; i <= h; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
