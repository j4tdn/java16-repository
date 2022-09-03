package ex02swapdivisible7or5;

import java.util.Scanner;

public class SwapDivisible7Or5 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int[] arr = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };

		swapDivisible(arr);
	}

	public static void swapDivisible(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 7 == 0 && arr[i] % 5 == 0) || (arr[i] % 7 != 0 && arr[i] % 5 != 0)) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
