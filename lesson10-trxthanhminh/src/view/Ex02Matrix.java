package view;

public class Ex02Matrix {
	public static void main(String[] args) {
		
		int[][] matrix = { {1,2 ,3, 4}, {5, 6, 7, 8},
				{1, 9, 0, 9}, {2, 9, 6, 5}, {1, 2, 4, 5}};
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("===========");
		
		changeMatrix(matrix);
	}
	
	private static void changeMatrix(int[][] matrix) {
		int a = 0;
		int b = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if(matrix[row][col] == 0) {
					a = row;
					b = col;
				}
			}
		}
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][b] = 0;
				matrix[a][col] = 0;
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	
	}
}
