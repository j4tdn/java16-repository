package ex03Pascal;

import java.util.Scanner;

public class DrawPascal {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();
		int i, j;

		int a[][] = new int[n + 2][n + 2];
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= i; j++) {

				if (i == j || j == 0) {
					a[i][j] = 1;

					// System.out.println(a[i][j]+"\t" );
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
					// System.out.println(a[i][j]+"\t" );
				}

				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}
	}
}
