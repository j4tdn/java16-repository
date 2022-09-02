package exercise03_PascalTriangle;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int[][] array = new int[n + 1][n + 2];
		for (int i = 0; i <= n; i++) {
			array[i][0] = 1;
			array[i][i + 1] = 1;
			for (int j = 1; j <= i; j++) {
				array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
			}
		}
		
		for(int i = 0; i<=n ;i++) {
			for (int j = 0; j <= i+1; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
