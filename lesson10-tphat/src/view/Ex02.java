package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int row = 5, column = 4;
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		System.out.printf("Các phần tử trong ma trận %dx%d:\n", row, column);
		print(matrix);
		System.out.printf("Các phần tử sau khi chuyển đổi %dx%d:\n", row, column);
		int[][] result = revertArray(matrix);
		print(matrix);
	}

	public static void print(int[][] matrix) {
		for (int[] row : matrix) {
			for (int column : row) {
				System.out.print(column + "  ");
			}
			System.out.println();
		}
	}

	private static int[][] revertArray(int[][] matrix) {
		int[][] a = matrix;
		int col = matrix[1].length;
		int row = matrix.length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] == 0) {
					for (int indexCol = 0; indexCol < col; indexCol++) {
						a[i][indexCol] = 0;
					}
					for (int indexRow = 0; indexRow < row; indexRow++) {
						a[indexRow][j] = 0;
					}
					return a;
				}
			}
		}
		return a;
	}
}
