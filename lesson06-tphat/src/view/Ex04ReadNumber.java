package view;

import java.util.Scanner;

import exception.IsException;

public class Ex04ReadNumber {

	public static void main(String[] args) {
		String arr[] = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number: ");
		String number = ip.nextLine();
		try {
			readNumber(number, arr);

		} catch (IsException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void oneOfNumber(String number, String arr[]) {
		int num = Integer.parseInt(number);
		System.out.println(arr[num]);
	}

	public static void twoOfNumber(String number, String arr[]) {
		int num = Integer.parseInt(number);
		int firstNumber = (int) number.charAt(0) - 48;
		int secondNumber = (int) number.charAt(1) - 48;
		if (num >= 20 && num <= 99) {
			arr[0] = " ";
			arr[1] = "mốt";

			System.out.println(arr[firstNumber] + " mươi " + arr[secondNumber]);
		}

		else {
			System.out.println("mười " + arr[secondNumber]);
		}
	}

	public static void threeOfNumber(String number, String arr[]) {
		int num = Integer.parseInt(number);
		int firstNumber = (int) number.charAt(0) - 48;
		int secondNumber = (int) number.charAt(1) - 48;
		int thirdNumber = (int) number.charAt(2) - 48;
		if (num > 100 && num < 110) {
			System.out.println(arr[firstNumber] + " trăm lẻ " + arr[thirdNumber]);
		} else {
			if (secondNumber == 0 && thirdNumber == 0) {
				System.out.println(arr[firstNumber] + " trăm ");

			} else if (firstNumber == 0) {
				char arrNumber[] = { number.charAt(1), number.charAt(2) };
				String a = String.copyValueOf(arrNumber);
				twoOfNumber(a, arr);
			} else {
				char arrNumber[] = { number.charAt(1), number.charAt(2) };
				String a = String.copyValueOf(arrNumber);
				System.out.print(arr[firstNumber] + " trăm ");
				twoOfNumber(a, arr);

			}
		}

	}

	public static void readNumber(String number, String arr[]) {
		if (number.length() == 1) {
			oneOfNumber(number, arr);
		} else if (number.length() == 2) {
			twoOfNumber(number, arr);
		} else if (number.length() == 3) {
			threeOfNumber(number, arr);
		}
	}
}
