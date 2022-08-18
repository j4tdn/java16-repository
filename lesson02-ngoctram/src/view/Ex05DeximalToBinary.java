package view;

import java.util.Scanner;

public class Ex05DeximalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int dex = sc.nextInt();
		String result = "";
		do {
			int i = dex % 2;
			result = i + result;
			dex = dex / 2; 
		} while (dex >= 1);
		System.out.println(result);
		sc.close();
	}
}
