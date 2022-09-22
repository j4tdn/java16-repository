package view;

import java.util.Scanner;

public class Ex04ReadNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		do {
			System.out.println("Nhập n: ");
			String number = ip.next();
			System.out.println("Kết quả : " + readNumber(number));
		} while (true);
	}

	static String Onecharacter(String number) {
		String[] numbers = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
		return numbers[Integer.valueOf(number)];
	}

	static String Twocharacter(String number) {
		String[] numbers = { "linh", "mươi", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi",
				"tám mươi", "chín mươi" };

		if (Integer.valueOf(number) % 10 != 0)
			return numbers[(int) number.charAt(0) - '0'] + " " + Onecharacter(Character.toString(number.charAt(1)));

		return numbers[(int) number.charAt(0) - '0'];
	}

	static String Threecharacter(String number) {
		String[] numbers = { "không trăm", "mọt trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm",
				"bảy trăm", "tám trăm", "chín trăm" };

		if (Integer.valueOf(number) % 100 == 0)
			return numbers[(int) number.charAt(0) - '0'];
		return numbers[(int) number.charAt(0) - '0'] + " "
				+ Twocharacter(Character.toString(number.charAt(1)) + Character.toString(number.charAt(2)));

	}

	static String readNumber(String number) {

		if (number.length() == 1)
			return Onecharacter(number);
		if (number.length() == 2)
			return Twocharacter(number);

		return Threecharacter(number);

	}

	
	
}
