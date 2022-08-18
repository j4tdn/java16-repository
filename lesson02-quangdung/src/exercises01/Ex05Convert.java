package exercises01;

import java.util.Scanner;

public class Ex05Convert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = sc.nextInt();
		convert(number);
	}

	private static void convert(int number) {
		int a;
		int s = 0;
		int[] digits = new int[number];
		while(number > 0) {
			a = number % 2;
			digits[s] = a;
			s++;
			number = number / 2;
		}
		
		for (int i = s - 1; i >= 0; i--) {
			System.out.print(digits[i]);
		}
	}
}
