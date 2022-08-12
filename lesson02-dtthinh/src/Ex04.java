import java.util.Scanner;

public class Ex04 {
	private static int i;
	private static Scanner sc;

	public static void main(String[] args) {
		int no1;
		sc = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số lượng phần tử của dãy số: ");
			no1 = sc.nextInt();
		} while (no1 <= 0);

		int A[] = new int[no1];
		System.out.print("Nhập vào các phần tử của dãy số: ");
		for (i = 0; i < no1; i++) {
			A[i] = sc.nextInt();
		}

		System.out.println("Các phần tử của dãy số:");
		for (i = 0; i < no1; i++) {
			System.out.print(A[i] + "\t");
		}
		System.out.println();
		System.out.println("Số lẻ lớn nhất trong dãy số là: " + checkNumber(A, no1));
	}

	private static int checkNumber(int A[], int no1) {
		int max = A[0];
		for (int i = 0; i < no1; i++) {
			if (A[i] % 2 != 0 && max < A[i])
				max = A[i];
		}
		return max;
	}
}
