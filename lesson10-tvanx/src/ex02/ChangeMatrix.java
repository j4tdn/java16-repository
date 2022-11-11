package ex02;

import java.util.ArrayList;

public class ChangeMatrix {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 1, 0, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 1, 9, 0, 9 }, 
				{ 2, 9, 6, 2 }, 
				{ 1, 2, 4, 5 } };
		printMatrix(matrix);
		System.out.println("==================");
		changeMatrix(matrix);
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] changeMatrix(int[][] matrix) {
		int x=0,y=0;
		ArrayList<Point> point = new ArrayList<Point>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					x=i;
					y=j;
					Point po = new Point(i,j);
					point.add(po);
				}

			}
		}
		
		for(Point po:point) {
			changeZero(matrix, po);
		}
		
		return matrix;
	}
	private static int[][] changeZero(int[][] matrix,Point po){
		for (int m = 0; m < matrix.length; m++) {
			for (int n = 0; n < matrix[m].length; n++) {
				if (m==po.getX() || n==po.getY()) {
					matrix[m][n] = 0;
				}
			}
		}
		return matrix;
	}
}
