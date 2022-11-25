package ex02;

public class Matrix {
	public static void main(String[] args) {
		int mat[][] = { { 1, 1, 1, 1 },
						{ 1, 0, 1, 1 }, 
						{ 1, 1, 1, 1 }, };

		System.out.println("Matrix Initially");
		printMatrix(mat);
		modifyMatrix(mat);
		System.out.println("Matrix after modification");
		printMatrix(mat);
	}

	public static void modifyMatrix(int mat[][])
    {
        // variables to check if there are any 1
        // in first row and column
        boolean row_flag = false;
        boolean col_flag = false;
 
        // updating the first row and col if 1
        // is encountered
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == 0 && mat[i][j] == 0)
                    row_flag = true;
 
                if (j == 0 && mat[i][j] == 0)
                    col_flag = true;
 
                if (mat[i][j] == 0) {
 
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
 
        // Modify the input matrix mat[] using the
        // first row and first column of Matrix mat
        for (int i = 1; i < mat.length; i++)
            for (int j = 1; j < mat[0].length; j++)
                if (mat[0][j] == 0 || mat[i][0] == 0)
                    mat[i][j] = 0;
 
        // modify first row if there was any 1
        if (row_flag == true)
            for (int i = 0; i < mat[0].length; i++)
                mat[0][i] = 0;
 
        // modify first col if there was any 1
        if (col_flag == true)
            for (int i = 0; i < mat.length; i++)
                mat[i][0] = 0;
    }
 
    /* A utility function to print a 2D matrix */
    public static void printMatrix(int mat[][])
    {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println("");
        }
    }
    // way 2
	
//	public static void modifyMatrix(int mat[][], int R, int C) {
//		int row[] = new int[R];
//		int col[] = new int[C];
//		int i, j;
//
//		/* Initialize all values of row[] as 0 */
//		for (i = 0; i < R; i++)
//			row[i] = 0;
//
//		/* Initialize all values of col[] as 0 */
//		for (i = 0; i < C; i++)
//			col[i] = 0;
//
//		/*
//		 * Store the rows and columns to be marked as 1 in row[] and col[] arrays
//		 * respectively
//		 */
//		for (i = 0; i < R; i++) {
//			for (j = 0; j < C; j++) {
//				if (mat[i][j] == 1) {
//					row[i] = 1;
//					col[j] = 1;
//				}
//			}
//		}
//
//		/*
//		 * Modify the input matrix mat[] using the above constructed row[] and col[]
//		 * arrays
//		 */
//		for (i = 0; i < R; i++)
//			for (j = 0; j < C; j++)
//				if (row[i] == 1 || col[j] == 1)
//					mat[i][j] = 1;
//	}
//
//	/* A utility function to print a 2D matrix */
//	public static void printMatrix(int mat[][], int R, int C) {
//		int i, j;
//		for (i = 0; i < R; i++) {
//			for (j = 0; j < C; j++)
//				System.out.print(mat[i][j] + " ");
//			System.out.println();
//		}
//	}

}