package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = ip.nextInt();
		String k = "";
		while (number > 0) {
			k = (number % 2) + k;
			number = number / 2;
		}
		System.out.println(k);
	}
}
