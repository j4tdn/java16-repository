package view;

import java.util.Scanner;

public class Ex04 {
	private static String numberAsText(int number) {
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
		default:
			return "";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int hundred = number / 100;
		int dozen = (number % 100) / 10;
		int unit = number % 10;

		if (hundred > 0) {
			if (dozen > 0) {
				if (dozen == 1) {
					System.out.println(numberAsText(hundred) + " trăm " + " mười " + numberAsText(unit));
				} else {
					System.out.println(
							numberAsText(hundred) + " trăm " + numberAsText(dozen) + " mươi " + numberAsText(unit));
				}
			} else {
				if (unit > 0) {
					System.out.println(numberAsText(hundred) + " trăm " + " lẻ " + numberAsText(unit));
				} else {
					System.out.println(numberAsText(hundred) + " trăm");
				}
			}
		} else {
			if (dozen > 0) {
				if (dozen == 1) {
					System.out.println("mười " + numberAsText(unit));
				} else {
					System.out.println(numberAsText(dozen) + " mươi " + numberAsText(unit));
				}
			} else {
				System.out.println(numberAsText(unit));
			}
		}
		sc.close();
	}
}
