package view;

import java.util.Scanner;

public class Ex05SwapDecimalNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		do {
			System.out.println("Nhập số thập phân: ");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));
		int decimalNumber = Integer.parseInt(numberAsText);
		long binaryNumber = dec2Bin(decimalNumber);
		System.out.println("Số nhị phân là: " + binaryNumber);
	}

	public static long dec2Bin(int decimalNumber) {
		long binaryNumber = 0;
		int temporary = 0;
		for (; decimalNumber > 0;) {
			binaryNumber += (decimalNumber % 2) * Math.pow(10, temporary);
			temporary++;
			decimalNumber /= 2;
		}
		return binaryNumber;
	}
}
