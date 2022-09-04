package ex03_trianglepascal;

/**
  * Viết chương trình in ra màn hình tam giác Pascal. 
  	Ví dụ, với n=4 sẽ in ra hình sau:
	1 1
	1 2 1
	1 3 3 1
	1 4 6 4 1
	1 5 10 10 5 1
	... Hàng thứ n được xác định từ hàng n-1:
	- Phần tử đầu tiên và phần tử cuối cùng đều bằng 1.
	- Phần tử thứ 2 là tổng của phần tử thứ nhất và thứ 2 của hàng n-1
	- Phần tử thứ k của hàng thứ n là tổng của phần tử thứ k-1 và k của hàng thứ n-1.
 */

public class Ex03TrianglePascal {
	public static void main(String[] args) {
		printPascal(initPascal(5));
	}

	private static int[][] initPascal(int number) {
		int[][] digits = new int[number + 1][number + 1];

		digits[0][0] = 1;
		for (int i = 1; i <= number; i++) {
			digits[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				digits[i][j] = digits[i - 1][j - 1] + digits[i - 1][j];
			}
		}
		return digits;
	}

	private static void printPascal(int digits[][]) {
		for (int i = 0; i < digits.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(digits[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
