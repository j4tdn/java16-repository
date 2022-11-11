package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 } };
		printMatrix(a);
		check(a);
		
	}
	private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
	private static void check(int [][] matrix) {
		int a=0;
		int b=0;
		for(int row=0; row<matrix.length;row++) {
			for(int col=0; col< matrix[row].length; col++) {
				if(matrix[row][col] ==0) {
					a=row;
					b=col;
				}
			}
			
		}
		for(int row=0; row<matrix.length;row++) {
			for(int col=0; col< matrix[row].length; col++) {
				matrix[row][a]=0;
				matrix[b][col]=0;
				System.out.print(matrix[row][col] + "  ");
			}
			System.out.println();
		}
	}

}
