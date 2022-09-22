package homework;

import java.util.Scanner;

public class Ex02PasswordVerify {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = ip.nextLine();

		boolean isPass = false;
		try {
			isPass = validate(password);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		if (isPass) {
			System.out.println("Successfully");
		}
		ip.close();
	}

	private static boolean validate(String password) {
		int length = password.length();

		if (length < 8) {
			throw new IllegalArgumentException("At least 8 characters");
		}

		if (length > 256) {
			throw new IllegalArgumentException("At most 256 characters");
		}

		boolean atLeastOneLowerLetter = false;
		boolean atLeastOneUpperLetter = false;
		boolean numberFlag = false;
		char ch;

		for (int i = 0; i <= password.length(); i++) {
			ch = password.charAt(i);
			if (Character.isDigit(ch)) {
				numberFlag = true;
			}
			if (Character.isUpperCase(ch)) {
				atLeastOneUpperLetter = true;
			}
			if (Character.isLowerCase(ch)) {
				atLeastOneLowerLetter = true;
			}
			if (numberFlag && atLeastOneUpperLetter && atLeastOneLowerLetter) {
				return true;
			}
		}
		if (!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower letter");
		}
		if (!atLeastOneUpperLetter) {
			throw new IllegalArgumentException("At least one upper letter");
		}
		if (!numberFlag) {
			throw new IllegalArgumentException("At least one number");
		}

		return false;
	}
}
