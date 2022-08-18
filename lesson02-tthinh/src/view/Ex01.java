package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {2,0,1,3,4,5,6,7,8};
		for(int number:numbers) {
			System.out.println(number + " ==> " + isPowerOfTwo(number));
		}
	}

	private static boolean isPoerof2(int a, int b) {
		if (b <= 0) {
			return false;
		}
		double n = Math.log(b) / Math.log(a);
		return Math.ceil(n) == Math.floor(n);
	}

	private static boolean isPowerOfTwo(int number) {
		if (number <= 0) {
			return false;
		}
		while (number != 1) {
			if (number % 2 != 0) {
				return false;
			}
			number /= 2;
		}
		return true;
	}
}
