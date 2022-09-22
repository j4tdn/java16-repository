package view;

import java.util.Scanner;

public class Ex004UserValidationThrow {
	public static void main(String[] args) {
		// Password requirements
		// 1. At least 8 characters
		// 2. At most 256 characters
		Scanner ip = new Scanner(System.in);
		System.out.println("enter password: ");
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

		System.out.println("finish ...");
		ip.close();
	}

	// throw new x
	// x: compile exception
	// --> vị trí khai báo hàm bắt buộc throws x
	// x: runtime exception
	// --> vị trí khai báo hàm không cần throws x
	private static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("at least 8 character");
			// System.out.println("at least 8 character");
			// return false;
		}
		if (length > 256) {
			throw new IllegalArgumentException("at most 256 character");
			// System.out.println("at most 256 character");
			// return false;
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
			throw new IllegalArgumentException("At least one lower letter");
			// System.out.println("At least one lower letter");
		}
		return atLeastOneLowerLetter;
	}

}
