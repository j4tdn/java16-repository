package ex03;

import java.util.Random;
import java.util.Scanner;

public class SaddleElement {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("nhap chieu dai:");
		int m = ip.nextInt();
		System.out.println("nhap chieu rong:");

		int n = ip.nextInt();
		int[][] Saddle = new int[m][n];

		int min = 0;
		int max = 0;
		int[][] index = new int[m][n];

		for (int i = 0; i < Saddle.length; i++) {
			for (int j = 0; j < Saddle[0].length; j++) {
				Saddle[i][j] = rd.nextInt(99);
				System.out.print(Saddle[i][j] + " ");
			}
			System.out.println(" ");
		}

		for (int i = 0; i < m; i++) {
			min = Saddle[i][0];
			for (int j = 0; j < m; j++) {
				if (min >= Saddle[i][j]) {
					min = Saddle[i][j];
					index[0][0] = i;
					index[0][1] = j;
				}
				j = index[0][1];
				max = Saddle[0][j];
				for (int k = 0; k < m; k++) {
					if (max <= Saddle[k][j]) {
						max = Saddle[i][j];
						index[1][0] = k;
						index[1][1] = j;

					}
				}
				if (min == max) {
					if (index[0][0] == index[1][0] && index[0][1] == index[1][1]) {
						System.out.print("\nSaddle point in the matrix is at index: (" + index[0][0] + ", "
								+ index[0][1] + ") : " + max + "\n");
					}
				}

			}

		}
	}
}
