package exercises;

import java.util.Scanner;

public class Ex04MaxArray {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		boolean check = true;

		do {
			System.out.print("Nhap vao phan tu cua mang: ");
			n = scanner.nextInt();
		} while (n <= 0);

		int A[] = new int[n];

		System.out.print("nhap cac so cho mang  ");

		for (int i = 0; i < n; i++) {
			System.out.print("A" +"["+ i+"]= ");
			A[i] = scanner.nextInt();
		}
		Sort(A, n);
		for (int i = A.length -1 ; i >= 0; i--) {
			if(A[i] % 2 != 0) {
				System.out.println("phan tu le lon nhat la " + A[i]);
				break;
			}
			
		}

	}
	
	static void Sort(int arr[], int n) {
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
	


