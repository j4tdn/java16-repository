package horse;

import java.util.Random;
import java.util.Scanner;

public class HorseSaddle {
	
	private static int row,col;

	public static void main(String[] args) {
		int arr[][] = new int[10][10];
		in(arr);
		out(arr);
		System.out.println();
		findHorseSaddle(arr);
		
	}

	private static void in(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		row = sc.nextInt();
		System.out.print("Enter column: ");
		col = sc.nextInt();
		Random rand = new Random();
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				arr[i][j] = 1 + rand.nextInt(99 - 1 + 1);
				System.out.println(arr[i][j]);
				System.out.println();
			}
				
	}

	private static void out(int arr[][]) {
		System.out.println("Show matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " " );
			}
		}
	}

	private static void findHorseSaddle(int arr[][]) {
		int min;
		int max;
		int n = 0;
		for (int i = 0; i < row; i++) {

			min = arr[i][0];
			for (int j = 0; j < col; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
					n = j;
				}
			}
			max = min;
			for (int j = 0; j < row; j++) {
				if (max < arr[j][n])
					max = arr[j][n];
			}
			if (max == min)
				System.out.println("Horse Saddle is: " + max);
		}
	}

}
