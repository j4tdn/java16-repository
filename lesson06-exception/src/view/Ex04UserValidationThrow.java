package view;

import java.util.Scanner;

public class Ex04UserValidationThrow {
	public static void main(String[] args) {
		// Password requirements
		// 1. At least 8 characters
		// 2. At least 256 characters
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password:");
		String password = ip.nextLine();

		if (validate(password)) {
			System.out.println("Create account successful!");
		}

		System.out.println("Finished....");
		ip.close();
	}

	// throw new X;
	// X: compile excreption
	// --> vị trí khai báo hàm bắt buộc throws X
	// X: runtime excreption
	// --> vị trí khia báo hàm kh cần throws X
	private static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
			return false;
		}
		if (length > 256) {
			return false;
		}

		// at least one lower character
		boolean atLeastLowerLetter = false;
		for (int i = 0; i < length; i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeastLowerLetter = true;
				break;
			}
		}

		return atLeastLowerLetter;
	}
}
