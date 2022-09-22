package view;

import java.util.Scanner;

public class Ex02PassWord {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String password;
		while (true) {
			try {
				System.out.println("Enter password: ");
				password = ip.nextLine();
				if (validate(password) == true) {
					System.out.println("Create password successfully");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		ip.close();
	}

	private static boolean validate(String password) throws Exception {
		if (password.length() < 8) {
			throw new Exception("At least 8 character");
		}

		if (password.length() > 256) {
			throw new Exception("At most 8 character");
		}

		boolean atLeastOneLowerCase = false;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowerCase = true;
				break;
			}
		}

		if (!atLeastOneLowerCase) {
			throw new Exception("At least one lower case character");
		}

		boolean atLeastOneUpperCase = false;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				atLeastOneUpperCase = true;
				break;
			}
		}

		if (!atLeastOneUpperCase) {
			throw new Exception("At least one upper case character");
		}

		if (!password.matches(".*[#?!@$%^&*-].*")) {
			throw new Exception("At least 1 special character");
		}

		if (!password.matches(".*?[0-9].*")) {
			throw new Exception("At least 1 number");
		}
		return true;
	}

}
