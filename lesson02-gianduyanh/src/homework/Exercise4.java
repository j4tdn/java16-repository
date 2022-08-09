package homework;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		boolean check = true;

		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = scanner.nextInt();
		} while (n <= 0);

		int A[] = new int[n];

		System.out.println("nhap cac so cho mang : ");

		for (int i = 0; i < n; i++) {
			System.out.print("nhap vao so thu nhat: " + i + ": ");
			A[i] = scanner.nextInt();
		}
		bubbleSort(A, n);
		for (int i = A.length -1 ; i >= 0; i--) {
			if(A[i] % 2 != 0) {
				System.out.println("phan tu le lon nhat la " + A[i]);
				break;
			}
			
		}

	}
	
	static void bubbleSort(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (swapped == false)
				break;
		}
	}

}
