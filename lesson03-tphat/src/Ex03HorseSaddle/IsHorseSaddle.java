package Ex03HorseSaddle;

import java.util.Random;
import java.util.Scanner;

public class IsHorseSaddle {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Nhập số dòng: ");
//		int row = input.nextInt();
//		System.out.print("Nhập số cột: ");
//		int col = input.nextInt();
//		int a[][] = new int[row][col];
//		NhapMaTran(a, row, col);
//		XuatMaTran(a, row, col);
//		System.out.println();
//		findSaddlePoint(a);
		int[][] a = { { 3, 3, 4 }, { 3, 3, 4 }, { 2, 3, 3 } };
		findSaddlePoint(a, 3, 2);
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

	static void findSaddlePoint(int[][] a, int row, int col) {
		int colIndex;
		int max;
		for (int i = 0; i < row; i++) {
			int min = a[i][0];
			for (int j = 0; j < col; j++) {
				if (a[i][j] <= min) {
					min = a[i][j];
					max = a[i][j];
					for (int k = 0; k < col; k++) {
						if (max < a[k][j]) {
							max = a[k][j];
						}
					}
					if (max == min) {
						System.out.println("Điểm yên ngựa: " + min + " ở hàng " + (i + 1) + " cột " + (j + 1));
					}
				}
			}
		}
	}
}

