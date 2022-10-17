package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		boolean rightAcc = false;
		boolean rightPass = false;

		do {
			System.out.println("Enter your account: ");
			String account = ip.nextLine();

			try {
				rightAcc = validateAccount(account);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (!rightAcc);

		do {
			System.out.println("Enter password: ");
			String password = ip.nextLine();

			try {
				rightPass = validatePassword(password);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (!rightPass);

		if (rightPass) {
			System.out.println("Your acount had create successfully");
		}
		ip.close();

	}

	private static boolean validateAccount(String account) {
		int count = 0;
		for (char i = 'a'; i <= 'z'; i++ ) {
			if (account.contains(Character.toString(i)) == account.contains(Character.toString(i + 1))) {
				count++;
				if (count == 3)
					throw new IllegalArgumentException("Account with more than 3 same letter is invalid!!");
			}
		}
		return true;
	}

	private static boolean validatePassword(String password) {
		int len = password.length();
		if (len < 8)  {
			throw new IllegalArgumentException("At least 8 character!");
		}
		if (len > 256) {
			throw new IllegalArgumentException("At most 256 character!");
		}

		int count = 0;
		for (char i = '0'; i <= '9'; i++) {
			if (password.contains(Character.toString(i))) {
				count++;
				if (count == 1)
					break;
			}
		}

		if (count == 0) {
			throw new IllegalArgumentException("At least one 1 number!");
		}

		boolean atLeastOneUpperLetter = false;
		for (int i = 0; i < len; i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				atLeastOneUpperLetter = true;
				break;
			}
		}

		if (!atLeastOneUpperLetter) {
			throw new IllegalArgumentException("At least one upper letter!");
		}

		count = 0;
		String[] specialCharacter = { "(", "~", "!", "@", "#", "$", "%", "^", "&", "*", ")" };
		for (int i = 0; i < specialCharacter.length; i++) {
			if (password.contains(specialCharacter[i])) {
				count++;
				if (count == 1)
					break;
			}
		}

		if (count == 0) {
			throw new IllegalArgumentException("At least one 1 special character!");
		}

		return true;

	}
}
