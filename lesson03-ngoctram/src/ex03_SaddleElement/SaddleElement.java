package ex03_SaddleElement;

import java.util.Scanner;

public class SaddleElement {
	private static int findMaxOfColumn(int... column) {
		int max = -1;
		for (int element : column) {
			if (element > max)
				max = element;
		}
		return max;
	}

	private static int[] getColumn(int[][] matrix, int index, int numberOfRows) {
		int[] column = new int[numberOfRows];
		for (int i = 0; i < numberOfRows; i++) {
			column[i] = matrix[i][index];
		}
		return column;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		System.out.print("Enter column: ");
		int column = sc.nextInt();
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				do {
					System.out.print("Enter matrix[" + i + "][" + j + "]: ");
					matrix[i][j] = sc.nextInt();
				} while (matrix[i][j] < 1 || matrix[i][j] > 99);
			}
		}

		System.out.println("Saddle Elements: ");
		for (int i = 0; i < row; i++) {
			int minOfRow = 100;
			int index[] = new int[column];
			int flag = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] <= minOfRow) {
					minOfRow = matrix[i][j];
					index[flag]= j;
					flag++;
				}
			}
			for (int time = 0; time<flag; time++) {
				int columnIndex = index[time];
				int maxOfColumn = findMaxOfColumn(getColumn(matrix, columnIndex, row));
				if (minOfRow == maxOfColumn) {
					System.out.println("matrix[" + i + "][" + columnIndex + "]: " + matrix[i][columnIndex]);
				}
			}
			
		}
		sc.close();
	}
}
