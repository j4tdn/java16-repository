package homework;

import java.util.Scanner;

public class Ex04LargestOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] digits = new int[5];
		int max = digits[0];
		System.out.println("Cac phan tu trong mang la: ");
		for (int i : digits) {
			System.out.print(i + " ,");
		}
		for (int num : digits) {
			if (max < num)
				max = num;
		}
	}
}
