package ex02;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		int[][] arrays = getArrays();
		
		System.out.println("Input: ");
		printf(arrays);
		
		output(arrays);
	
		System.out.println("Ouput: ");
		printf(arrays);
	}
	
	public static int[][] getArrays() {
		Random rd = new Random();
		int m = rd.nextInt(5)+1; 
		int n = rd.nextInt(5)+1; 
		int[][] arrays = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arrays[i][j] = rd.nextInt(10);
			}
		}
		return arrays;
	}
	
	public static void output(int[][] arrays) {
		int[] checkRow = new int[20];
		int[] checkColumn = new int[20];
		int count = 0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				if (arrays[i][j] == 0) {
					checkRow[count] = i;
					checkColumn[count++] = j;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			for (int row = 0; row < arrays.length; row ++) {
				arrays[row][checkColumn[i]] = 0;
			}
			for (int column = 0; column < arrays[0].length; column++) {
				arrays[checkRow[i]][column] = 0;
			}
		}
	}
	public static void printf(int[][] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.print(arrays[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
