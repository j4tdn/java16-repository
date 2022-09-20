package problem02.createpassword;

import java.util.Scanner;

import problem02.exception.InvalidPasswordException;
import problem02.exception.detail.LowercaseCharacterException;
import problem02.exception.detail.MaximumLengthException;
import problem02.exception.detail.MinimumLengthException;
import problem02.exception.detail.NumberException;
import problem02.exception.detail.SpecialCharacterException;
import problem02.exception.detail.UppercaseCharacterException;

public class CreatePassword {
	public static void main(String[] args) {
		System.out.println("Password Accepted: " + createPassword());
	}

	private static String createPassword() {
		Scanner sc = new Scanner(System.in);
		String password = "";
		do {
			try {
				System.out.print("Enter password: ");
				password = sc.nextLine();
				checkPassword(password);
				break;
			} catch (InvalidPasswordException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		sc.close();
		return password;
	}

	public static void checkPassword(String password) throws InvalidPasswordException {
		if (password.length() < 8)
			throw new MinimumLengthException();
		if (password.length() > 256)
			throw new MaximumLengthException();
		if (!password.matches(".*[a-z].*"))
			throw new LowercaseCharacterException();
		if (!password.matches(".*[A-Z].*"))
			throw new UppercaseCharacterException();
		if (!password.matches(".*\\d.*"))
			throw new NumberException();
		if (!password.matches(".*[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-].*"))
			throw new SpecialCharacterException();
	}
}
