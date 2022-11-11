package view;

import java.util.Arrays;

import bean.Point;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		Point[] arr = new Point[100];
		int index = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					arr[index++] = new Point(i, j);
				}
			}
		}
		int lengthArr = index;
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, lengthArr)));
		for (index = 0; index < lengthArr; index++) {
			int row = arr[index].getRow();
			for (int i = 0; i < matrix[i].length; i++) {
				matrix[row][i] = 0;
			}
			int col = arr[index].getCol();
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][col] = 0;
			}
		}
		
		for (int i = 0 ; i<matrix.length; i++) {
			for (int j = 0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
