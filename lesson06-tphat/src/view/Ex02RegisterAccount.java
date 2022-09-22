package view;

import java.util.Scanner;

import exception.IsException;

public class Ex02RegisterAccount {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String pass;
		while (true) {
			try {
				System.out.println("Enter pasword: ");
				pass = ip.nextLine();
				if (checkPass(pass) == true) {
					System.out.println("Successfully");
					break;
				}
			} catch (IsException e) {
				System.out.println(e.getMessage());
			}

		}
		ip.close();

	}

	private static boolean checkPass(String pass) throws IsException {
		if (pass.length() < 8) {
			throw new IsException("At least 8 characters");
		}

		if (pass.length() > 256) {
			throw new IsException("At most 256 characters");
		}

		boolean atLeastOneLowerLetter = false;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isLowerCase(pass.charAt(i))) {
				atLeastOneLowerLetter = true;
				break;
			}
		}
		if (!atLeastOneLowerLetter) {
			throw new IsException("At least one lower case characters");
		}

		boolean atLeastOneUpperLetter = false;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isUpperCase(pass.charAt(i))) {
				atLeastOneUpperLetter = true;
				break;
			}
		}
		if (!atLeastOneUpperLetter) {
			throw new IsException("At least one upper case characters");
		}

		if (!pass.matches(".*[#?!@$%^&*-].*")) {
			throw new IsException("At least 1 special character");
		}

		if (!pass.matches(".*?[0-9].*")) {
			throw new IsException("At least 1 number");
		}
		return true;
	}
}
