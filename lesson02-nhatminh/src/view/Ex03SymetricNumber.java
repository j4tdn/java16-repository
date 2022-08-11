package view;

import java.util.Scanner;

public class Ex03SymetricNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so test case: ");
		int Try = Integer.parseInt(sc.nextLine());
		while (Try-- != 0) {
			System.out.println("Nhap so can xet: ");
			String str = sc.nextLine();
			if (IsSymetricNumber(str))
				System.out.println(str + " la so doi xung!");
			else
				System.out.println(str + " la so khong doi xung!");
		}
	}

	public static boolean IsSymetricNumber(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}
		return true;
	}
}
