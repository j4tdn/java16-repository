package ex04;

import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = ip.nextLine();
		System.out.println("Enter password: ");
		String password = ip.nextLine();
		try {
			if (validate(username, password)) {
				System.out.println("Create account successful");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		ip.close();
	}

	private static boolean validate(String username, String password) {
		int length = password.length();

		if (length < 8) {
			throw new IllegalArgumentException("At least 8 characters");
		}

		boolean atLeastOneNumberLetter = false;
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(password.charAt(i))) {
				atLeastOneNumberLetter = true;
				break;
			}
		}
		if (!atLeastOneNumberLetter) {
			throw new IllegalArgumentException("At least one number characters");
		}

		boolean atLeastOneUpperLetter = false;
		for (int i = 0; i < length; i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				atLeastOneUpperLetter = true;
				break;
			}
		}
		if (!atLeastOneUpperLetter) {
			throw new IllegalArgumentException("At least one upper characters");
		}

		boolean atLeastOneSpecialLetter = false;
		for (int i = 0; i < length; i++) {
			if (password.matches(".*[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-].*")) {
				atLeastOneSpecialLetter = true;
				break;
			}
		}
		if (!atLeastOneSpecialLetter) {
			throw new IllegalArgumentException("At least one special characters");
		}
		return atLeastOneNumberLetter;
	}
}
