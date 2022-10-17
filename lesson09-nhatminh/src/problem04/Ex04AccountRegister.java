package problem04;

import java.util.Scanner;

import problem04.exception.InvalidPasswordLength;
import problem04.exception.InvalidPasswordRequiredCharacter;
import problem04.exception.InvalidUsername;
import problem04.exception.PasswordNotMatchException;
import problem04.exception.Repeat3TimeWithUsernameException;

public class Ex04AccountRegister {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("$Account Registration:");
		String username = getUsername();
		String password = getPassword(username);
		System.out.println("===============================================");
		System.out.println("**You have successfully registered an account**");
		System.out.println("Your account:");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	private static String getUsername() {
		String username = "";
		while (true) {
			try {
				System.out.print("Username: ");
				username = sc.nextLine();
				if (username.matches(".*[^a-zA-Z0-9_].*"))
					throw new InvalidUsername();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return username;
	}

	private static String getPassword(String username) {
		String password = "";
		String confirm = "";
		while (true) {
			try {
				System.out.print("Password: ");
				password = sc.nextLine();
				checkPassword(username, password);
				System.out.print("Confirm Password: ");
				confirm = sc.nextLine();
				if (!password.equals(confirm))
					throw new PasswordNotMatchException();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return password;
	}

	private static void checkPassword(String username, String password) throws Exception {
		if (password.length() < 8)
			throw new InvalidPasswordLength();
		if (!password.matches(".*[0-9].*") || !password.matches(".*[~!@#\\$%\\^&\\*].*")
				|| !password.matches(".*[A-Z].*"))
			throw new InvalidPasswordRequiredCharacter();
		int count = 0;
		String appearedChar = "";
		for (int i = 0; i < password.length(); i++) {
			String character = password.substring(i, i + 1);
			if (!appearedChar.contains(character)) {
				appearedChar += character;
				if (username.contains(character))
					count++;
				if (count == 3)
					throw new Repeat3TimeWithUsernameException();
			}
		}
	}
}
