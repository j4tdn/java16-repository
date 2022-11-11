package homework;

import java.util.Arrays;

public class Ex02MatrixZeroColumnRow {
	public static void main(String[] args) {

		int[][] matrix  = new int[][]{
			{1, 2, 3, 4},
			{4, 0, 2, 1},
			{1, 1, 0, 3},
			{1, 0, 2, 3},
			{2, 3, 1, 4}
		};
		changeRowColumn(matrix);
		
	}
	public static void changeRowColumn(int[][] matrix)
	{
		int[] a = new int[matrix[0].length];
		int[] b = new int[matrix[0].length];
		int i = 0;
		int j = 0;
		for(int row = 0; row < matrix.length ; row++) {
            for(int column = 0; column < matrix[row].length ; column++) {
                if(matrix[row][column] == 0)
                {
                	a[i++] = row;
                	b[j++] = column;
                }
            }
        }
		int[] m = Arrays.copyOfRange(a, 0, i);
		int[] n = Arrays.copyOfRange(b, 0, j);
 		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		for(int row = 0; row < matrix.length ; row++) {
            for(int column = 0; column < matrix[row].length ; column++) {

                if(check(n,column) == true)
                {
                	matrix[row][column] = 0;
                }
            }
         
        }
		for(int column = 0; column < matrix[0].length ; column++) {
            for(int row = 0; row < matrix.length ; row++) {

                if(check(m, row))
                {
                	matrix[row][column] = 0;
                }
            }
         
        }
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + "     ");

			}
			System.out.println();
			System.out.println();
        }
		
	}
	public static boolean check(int[] a, int n)
	{
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] == n)
			{
				return true;
			}
		}
		return false;
	}
}
