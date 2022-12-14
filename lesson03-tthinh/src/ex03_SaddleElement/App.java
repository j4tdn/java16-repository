package ex03_SaddleElement;

public class App {
	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int n = 3;
		if (findSaddlePoint(mat, n) == false)
			System.out.println("No Saddle Point ");
	}

	private static boolean findSaddlePoint(int matrix[][], int n) {
		for (int i = 0; i < n; i++) {

			int min_row = matrix[i][0], col_ind = 0;
			for (int j = 1; j < n; j++) {
				if (min_row > matrix[i][j]) {
					min_row = matrix[i][j];
					col_ind = j;
				}
			}

			int k;
			for (k = 0; k < n; k++)

				if (min_row < matrix[k][col_ind]) {
					break;
				}

			if (k == n) {
				System.out.println("Value of Saddle Point " + min_row);
				return true;
			}
		}

		return false;
	}

}
