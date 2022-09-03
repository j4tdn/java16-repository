package ex03trianglepascal;

import java.util.Scanner;

public class TrianglePascal {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter height of Triangle Pascal: ");
		int number = ip.nextInt();
		printTriangle(number);

	}

	public static void printTriangle(int number) {
		int arr[][] = new int[number + 1][number + 2];
		for (int i = 0; i <= number; i++) {
			for (int j = 0; j < i + 2; j++) {
				if (j == 0 || j == i + 1) {
					arr[i][j] = 1;
				} else if (i != 0) {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}

		for (int i = 0; i < number + 1; i++) {
			for (int j = 0; j < i + 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
