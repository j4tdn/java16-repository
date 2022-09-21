package view;

import java.util.Scanner;

public class Ex04UserValidationThrow {
	public static void main(String[] args) {
		// Password requirements
		// 1. At least 8 characters
		// 2. At most 256 characters
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = ip.nextLine();
		
		boolean isPassed = false;
		try {
			isPassed = validate(password);
		} catch (IllegalArgumentException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		if (isPassed) {
			System.out.println("Create account successful");
		}
		System.out.println("Finished...");
		ip.close();
	}

	// throw new X
	// X: compile exception
	//   
	private static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("At least 8 charaters");
			// System.out.println("At least 8 charaters");
			// return false;
		}
		if (length > 256) {
			throw new IllegalArgumentException("At most 256 charaters");
			//System.out.println("At most 256 charaters");
			//return false;
		}

		// at least one lower character
		boolean atLeastOneLowerLetter = false;
		for (int i = 0; i < length; i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowerLetter = true;
				break;
			}
		}
		if (!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower charaters");
			//System.out.println("At least one lower letter");
		}
		return atLeastOneLowerLetter;
	}
}
