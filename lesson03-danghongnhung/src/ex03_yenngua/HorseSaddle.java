package ex03_yenngua;

import java.util.Random;
import java.util.Scanner;

public class HorseSaddle {
	static int n, m;
	static int[][] arr;

	public static void main(String[] args) {
		input();
		output();
		horseSaddle();
	}

	public static void input() {
		Scanner ip = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("Input m: ");
		m = ip.nextInt();
		System.out.print("Input n: ");
		n = ip.nextInt();
		arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				arr[i][j] = 1 + rd.nextInt(99);
		}
	}

	public static void output() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void horseSaddle() {
		int value = 100;
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] < value) {
					value = arr[i][j];
				}
			}
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == value)
					if (maxInRow(j, m, value)) {
						System.out.println("A[" + i + "][" + j + "]");
						count++;
					}
			}
		}
		if (count == 0)
			System.out.println("no value");
	}

	public static boolean maxInRow(int j, int m, int value) {
		for (int i = 0; i < m; i++) {
			if (arr[i][j] > value)
				return false;
		}
		return true;
	}
}
