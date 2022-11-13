package problem02;

import java.util.Arrays;
import java.util.Vector;

public class Ex02ConvertMatrix {
	public static void main(String[] args) {
		int r = 5, c = 4;
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		printMatrix(matrix, r);
		System.out.println("====================\nResult:");
		int[][] result = convertMatrix(matrix, r, c);
		printMatrix(result, r);
	}

	private static void printMatrix(int[][] matrix, int r) {
		for (int i = 0; i < r; i++)
			System.out.println(Arrays.toString(matrix[i]));
	}

	private static int[][] convertMatrix(int[][] matrix, int row, int col) {
		int[][] result = cloneMatrix(matrix, row, col);
		Vector<Pair> vt = new Vector<>();
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				if (result[i][j] == 0)
					vt.add(new Pair(i, j));
		for (Pair p : vt)
			convertToZero(result, row, col, p.row, p.col);
		return result;
	}

	private static void convertToZero(int[][] matrix, int row, int col, int i0, int j0) {
		for (int k = 0; k < col; k++)
			matrix[i0][k] = 0;
		for (int k = 0; k < row; k++)
			matrix[k][j0] = 0;
	}

	private static int[][] cloneMatrix(int[][] matrix, int row, int col) {
		int[][] result = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				result[i][j] = matrix[i][j];
		return result;
	}
}

class Pair {
	public int row;
	public int col;

	public Pair(int row, int col) {
		this.row = row;
		this.col = col;
	}
}
