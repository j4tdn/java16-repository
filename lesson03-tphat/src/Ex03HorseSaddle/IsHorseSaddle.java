package Ex03HorseSaddle;

import java.util.Random;
import java.util.Scanner;

public class IsHorseSaddle {

	public static void main(String[] args) {
//			Scanner input = new Scanner(System.in);
//			System.out.print("Nhập số dòng: ");
//			int row = input.nextInt();
//			System.out.print("Nhập số cột: ");
//			int col = input.nextInt();
//			int a[][] = new int[row][col];
//			NhapMaTran(a, row, col);
//			XuatMaTran(a, row, col);
//			System.out.println();
//			findSaddlePoint(a);
		int[][] a = { { 10, 3, 11 }, { 10, 10, 10 } };
		findSaddlePoint(a, 2, 3);
	}

	public static void NhapMaTran(int a[][], int row, int col) {
		Random rand = new Random();
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				a[i][j] = 1 + rand.nextInt(99 - 1 + 1);
	}

	public static void XuatMaTran(int a[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			System.out.println();
			for (int j = 0; j < col; j++)
				System.out.print(a[i][j] + "\t");
		}

	}

	public static int isMin(int[][] a, int indexRow, int col) {
		int min = Integer.MAX_VALUE;
		for (int x = 0; x < col; x++) {
			if (a[indexRow][x] <= min) {
				min = a[indexRow][x];
			}
		}
		return min;
	}

	static void findSaddlePoint(int[][] a, int row, int col) {
		int colIndex;
		int max;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] <= isMin(a, i, col)) {
					max = a[i][j];
					for (int k = 0; k < row; k++) {
						if (max < a[k][j]) {
							max = a[k][j];
						}
					}
					if (max == isMin(a, i, col)) {
						System.out.println("Điểm yên ngựa: " + a[i][j] + " ở hàng " + (i + 1) + " cột " + (j + 1));
					}
				}
			}
		}
	}
}
