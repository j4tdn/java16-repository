package saddle;

import java.util.Scanner;
import java.util.Random;

public class HorseSaddle {
	public static void main(String[] args) {
		int m = 0;
		int n = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so hang cua ma tran: ");
		m = ip.nextInt();
		System.out.println("Nhap so cot cua ma tran: ");
		n = ip.nextInt();
		int[][] A = new int[m][n];
		input(m, n, A);
		output(m, n, A);
		System.out.println();
		System.out.println("Phan tu yen ngua la: " + checkSaddle(m, n, A));

	}

	private static void input(int m, int n, int[][] A) {
		Random rand = new Random();
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				A[i][j] = 1 + rand.nextInt(99 - 1 + 1);

			}
	}

	private static void output(int m, int n, int[][] A) {
		System.out.println("Ma tran ngau nhien la: ");
		int iRow, iCol;
		System.out.println("A = ");
		for (iRow = 0; iRow < m; iRow++) {
			System.out.println();
			for (iCol = 0; iCol < n; iCol++) {
				System.out.print("\t\t" + A[iRow][iCol]);
			}
		}
	}

	private static int checkSaddle(int m, int n, int[][] A) {
		int iRow, iCol;
		int sd = 0;
		int col;
		int max = 0;
		int min = 0;;
		for (iRow = 0; iRow < m; iRow++) {
			max = A[iRow][0];
			col = 0;
			for (iCol = 1; iCol < n; iCol++) {

				if (max < A[iRow][iCol]) {
					max = A[iRow][iCol];
					col = iCol;
				}
			}

			min = A[0][col];
			for (int i = 1; i < m; i++) {
				if (min > A[i][col]) {
					min = A[i][col];
				}
			}

			if (max == min) {
				break;
			}
		}
		return max;
	}
}
