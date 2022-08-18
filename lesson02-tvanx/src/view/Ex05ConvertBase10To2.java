package view;

import java.util.Scanner;

public class Ex05ConvertBase10To2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the number need to convert base 2: ");
		int number = ip.nextInt();
		System.out.println("The base 2 form is: ");
		convert10To2(number);
	}

	private static void convert10To2(int number) {
		int dem = 0;
		int number2 = number;
		while (number2 > 0) {
			number2 /= 2;
			dem += 1;
		}
		int[] Array = new int[dem];
		int index = 0;
		while (number > 0) {
			Array[index] = number % 2;
			number /= 2;
			index = index + 1;
		}
		for (int i = dem - 1; i >= 0; i--) {
			System.out.print(Array[i] + " ");
		}
	}
}
