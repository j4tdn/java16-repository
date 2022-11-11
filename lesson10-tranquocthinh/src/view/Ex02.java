package view;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrixs = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		printf(matrixs);
		System.out.println("====================================================================================");
		setZeroes(matrixs);
		printf(matrixs);
	}

	private static void setZeroes(int[][] matrix) {
		int R = matrix.length;
		int C = matrix[0].length;
		Set<Integer> rows = new HashSet<Integer>();
		Set<Integer> cols = new HashSet<Integer>();

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (matrix[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (rows.contains(i) || cols.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	private static void printf(int[][] matrixs) {
		for (int i = 0; i < matrixs.length; i++) {
			for (int j = 0; j < matrixs[i].length; j++) {
				System.out.print(matrixs[i][j] + " ");
			}
			System.out.println();
		}
	}
}
