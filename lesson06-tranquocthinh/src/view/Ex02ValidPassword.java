package view;

import java.util.Scanner;

public class Ex02ValidPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter password: ");
			String password = sc.nextLine();
			try {
				if (isValidPassword(password)) {
					System.out.println("Create account successfully !!!");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		sc.close();
	}

	public static boolean isValidPassword(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("At least 8 character");
		}
		if (length > 256) {
			throw new IllegalArgumentException("At least 256 character");
		}
		if (!password.matches(".*([a-z]{1,}).*")) {
			throw new IllegalArgumentException("At least one lowercase alphabetic characters");
		}
		if (!password.matches((".*([A-Z]{1,}).*"))) {
			throw new IllegalArgumentException("At least one uppercase alphabetic characters");
		}
		if (!password.matches(".*([0-9]{1,}).*")) {
			throw new IllegalArgumentException("At least one number");
		}
		if (!password.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-]{1,}.*")) {
			throw new IllegalArgumentException("At least one special characters");
		}
		return true;

	}
}
