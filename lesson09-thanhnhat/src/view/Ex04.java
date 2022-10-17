package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		String account = "byztkhx256";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		boolean check = false;
		try {
			check = validate(password);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		if (check) {
			System.out.println("Successfully created account!");
		}
		sc.close();
	}

	private static boolean validate(String password) {
		if (password.length() < 8) {
			throw new IllegalArgumentException("Password must be at least 8 characters!!!");
		}
		boolean atLeastOneNumber = false;
		boolean atLeastOneUpperLetter = false;
		boolean atLeastOneSpecialLetter = false;
		char ch;
		String specialCharacter = "~!@#$%^&*";
		for (int i = 0; i < password.length(); i++) {
			ch = password.charAt(i);
			if (Character.isDigit(ch)) {
				atLeastOneNumber = true;
			}
			if (Character.isUpperCase(ch)) {
				atLeastOneUpperLetter = true;
			}
		}
		for (int j = 0; j < specialCharacter.length(); j++) {
			if (password.contains(Character.toString(specialCharacter.charAt(j)))) {
				atLeastOneSpecialLetter = true;
				break;
			}
			if (!atLeastOneNumber) {
				throw new IllegalArgumentException("Password must contain at least one number");
			}
			if (!atLeastOneUpperLetter) {
				throw new IllegalArgumentException("Password must contain at least one upper letter");
			}
			if (!atLeastOneSpecialLetter) {
				throw new IllegalArgumentException("Password must contain at least one special letter");
			}
		}
		return false;
	}
}
