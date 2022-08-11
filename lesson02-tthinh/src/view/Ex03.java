package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = ip.nextInt();
		if (checkSysmetricalNumber(number)) {
			System.out.println(number + " is sysmetrical number");
		} else {
			System.out.println(number + " is not sysmetrical number");
		}
	}

	public static boolean checkSysmetricalNumber(int number) {
		int reverse = 0;
		int flag = number;
		while (flag > 0) {
			reverse = reverse * 10 + flag % 10;
			flag = flag / 10;
		}
		if (reverse == number) {
			return true;
		} else {
			return false;
		}
	}
}
