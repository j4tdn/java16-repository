package view;

import java.util.Scanner;

public class Ex04RegisterAccount {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter your account name:");
		String ac = ip.nextLine();
		System.out.print("Enter your password:");
		String password = ip.nextLine();

		boolean isPassed = false;

		try {
			isPassed = validate(password);

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		if (isPassed) {
			System.out.println("Create account successful");
		}

		System.out.println("Finished ...");
		ip.close();

	}

	private static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("At least 8 characters");
		}

		boolean atLeastOneLowerLetter = false;
		for (int i = 0; i < length; i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowerLetter = true;
				break;
			}
		}
		if (!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower letter");
		}
		return atLeastOneLowerLetter;

	}
}
