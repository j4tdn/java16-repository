package ex03_SaddleElement;

public class App {

	public static void main(String[] args) {
		// INPUT======================================================================
		// --> Input nhap tu ban phim
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap kich thuoc cua ma tran:");
//		System.out.print("\t+Nhap so hang: ");
//		int row = Integer.parseInt(sc.nextLine());
//		System.out.print("\t+Nhap so cot: ");
//		int col = Integer.parseInt(sc.nextLine());
//
//		int[][] matrix = new int[row][col];
//		System.out.println("Nhap du lieu cac phan tu co trong ma tran:");
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.format("\t+Nhap phan tu A[%d][%d]: ", i, j);
//				matrix[i][j] = Integer.parseInt(sc.nextLine());
//			}
//		}
		// --> Input tu truoc
		int row = 3, col = 3;
		int[][] matrix = { { 47, 47, 36 }, { 23, 43, 31 }, { 46, 7, 29 } };

		// PROCESSING=================================================================
		int[][] result = SaddleElement(matrix, row, col);

		// OUTPUT=====================================================================
		// --> Hien thi theo matrix
		System.out.println("Result:");
		for (int i = 0; i < row; i++) {
			System.out.print("\t");
			for (int j = 0; j < col; j++) {
				if (result[i][j] == 1)
					System.out.format("%-5s ", "[" + matrix[i][j] + "]");
				else
					System.out.format("%-5s ", " " + matrix[i][j]);
			}
			System.out.println();
		}
		// --> Hien thi theo line
		String output = "Cac phan tu la SaddleElement: ";
		boolean firstElement = true;
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				if (result[i][j] == 1) {
					if (firstElement) {
						firstElement = false;
						output += "A[" + i + "]" + "[" + j + "]";
					} else
						output += ", A[" + i + "]" + "[" + j + "]";
				}
		System.out.println(output);
	}

	public static int[][] SaddleElement(int[][] matrix, int row, int col) {
		int[][] result = new int[row][col];
		for (int i = 0; i < row; i++) {
			// Tim ra gia tri min trong row
			int min = matrix[i][0];
			for (int j = 1; j < col; j++) {
				if (matrix[i][j] < min)
					min = matrix[i][j];
			}
			// Tu gia tri min duyet col
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == min) {
					boolean isSatisfied = true;
					for (int k = 0; k < row; k++) {
						if (matrix[k][j] > min) {
							isSatisfied = false;
							break;
						}
					}
					// Lieu min do co phai max trong col
					if (isSatisfied)
						result[i][j] = 1;
				}
			}
		}
		return result;
	}
}
