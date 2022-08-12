package view;

import java.util.Scanner;

class Ex03SymmetricalNumber {
	public static void main(String[] args) {
		int sum = 0, temp, number, r;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your number: ");
		number = Integer.parseInt(ip.nextLine());

		for (temp = number; number != 0; number = number / 10) {
			r = number % 10;
			sum = sum * 10 + r;
		}
		if (temp == sum) {
			System.out.println(temp + " là số đối xứng");
		} else {
			System.out.println(temp + " không phải là số đối xứng");
		}
	}

}
