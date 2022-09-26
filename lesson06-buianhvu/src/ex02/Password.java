package ex02;

import java.util.Scanner;

public class Password {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				System.out.print("Enter password: ");
				String password = ip.nextLine();
				if (validate(password))
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			if (true)
				System.out.print("Suitable password ! ");
		} while (true);
	}

	private static boolean validate(String password) {
		int length = password.length();

		if (!password.matches("~!@#$%^&*()-_=+[]{}|;:,.<>/?")) {
			throw new IllegalArgumentException("At least 1 special characters");
		}

		if (length < 8) {

			throw new IllegalArgumentException("At least 8 characters");
		}

		if (length > 256) {
			throw new IllegalArgumentException("At most 256 characters");
		}

		for (int i = 0; i <= length - 1; i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				break;
			}
			else {
				throw new IllegalArgumentException("At least one lower characters");
			}
		}

		for (int i = 0; i <= length - 1; i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				break;
			}
			else {
				throw new IllegalArgumentException("At least one upper characters");
			}
		}


		for (int i = 0; i <= length - 1; i++) {
			if (Character.isDigit(password.charAt(i))) {

				break;
			} else {
				throw new IllegalArgumentException("At least 1 number");
			}
		}
		return true;

	}

}