package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import common.Tuple;

public class Ex02Matrix {
	public static void main(String[] args) {
		int[][] matrix = initMatrix(5, 5);
		printf(matrix);

		System.out.println("==========");
		convertToZero(matrix);
		printf(matrix);
	}

	private static void convertToZero(int[][] matrix) {
		List<Tuple> zeros = new ArrayList<Tuple>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					zeros.add(new Tuple(i, j));
				}
			}
		}

		for (Tuple zero : zeros) {
			for (int i = 0; i < matrix.length; i++) {
				// right is column
				matrix[i][zero.getRight()] = 0;
			}

			for (int i = 0; i < matrix[0].length; i++) {
				// left is row
				matrix[zero.getLeft()][i] = 0;
			}
		}
	}

	private static int[][] initMatrix(int rows, int columns) {
		int[][] matrix = new int[rows][columns];
		Random rd = new Random();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = rd.nextInt(10);
			}
		}
		return matrix;
	}

	private static void printf(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
