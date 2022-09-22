package view;

import java.util.Scanner;

public class Ex04ReadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter your number: ");
				int number = Integer.valueOf(sc.nextLine());
				if (number >= 0 && number <= 10) {
					System.out.println(readOneDigit(number));
					break;
				} else if (number < 100) {
					System.out.println(readTwoDigit(number));
					break;
				} else {
					System.out.println(readThreeDigit(number));
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số");
			}
		} while (true);
		sc.close();
	}

	private static String readOneDigit(int number) {
		switch (number) {
		case 1:
			return "một";
		case 2:
			return "hai";
		case 3:
			return "ba";
		case 4:
			return "bốn";
		case 5:
			return "năm";
		case 6:
			return "sáu";
		case 7:
			return "bảy";
		case 8:
			return "tám";
		case 9:
			return "chín";
		case 10:
			return "mười";
		}

		return "";
	}

	private static String readTwoDigit(int number) {
		String res;
		int teens = number / 10;
		int ones = number % 10;
		if (teens == 1) {
			res = "mười " + readOneDigit(ones);
		} else {
			res = readOneDigit(teens) + " " + readOneDigit(ones);
		}

		return res.replace("một", "mốt");
	}

	private static String readThreeDigit(int number) {
		int hundreds = number / 100;
		int others = number - (hundreds * 100);

		return readOneDigit(hundreds) + " trăm " + readTwoDigit(others);
	}

}
