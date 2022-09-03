package ex03_pascaltriangle;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int number = sc.nextInt();

		int[][] numbers = new int[number + 1][number + 2];
		for (int i = 0; i <= number; i++) {
			numbers[i][0] = 1;
			numbers[i][i + 1] = 1;
			for (int j = 1; j <= i; j++) {
				numbers[i][j] = numbers[i - 1][j - 1] + numbers[i - 1][j];
			}
		}

		for (int i = 0; i <= number; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}
	}
}