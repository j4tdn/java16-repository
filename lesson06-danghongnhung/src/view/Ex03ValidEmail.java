package view;

import java.util.Scanner;

public class Ex03ValidEmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		do {
			try {
				System.out.println("Type your email: ");
				String email = sc.next();

				String[] parts = email.split("@");
				check = checkPostfix(parts[0]) && checkDomain(parts[1]);

				if (check)
					break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	
	static boolean checkDomain(String email) {
		String[] specialCharacter = { "(", "!", "@", "#", "%", "^", "&", "*", "(", ")", "-", "_", "=", "[", "]", "{",
				"}", "|", ";", ":", ",", "<", ">", "/", "?" };
		if (email.length() == 0)
			throw new IllegalArgumentException("Invalid email");
		for (int i = 0; i < specialCharacter.length; i++) {
			if (Character.toString(email.charAt(i)).contains(specialCharacter[i]))
				throw new IllegalArgumentException("Invalid email");
		}

		int count = 0;
		for (int i = 0; i < email.length() - 1; i++) {
			if (email.charAt(i) == '.' && email.charAt(i + 1) == '.')
				throw new IllegalArgumentException("Invalid email");
		}
		return true;
	}

	static boolean checkPostfix(String email) {
		String[] specialCharacter = { "(", "!", "@", "#", "%", "^", "&", "*", "(", ")", "-", "_", "=", "[", "]", "{",
				"}", "|", ";", ":", ",", ".", "<", ">", "/", "?" };
		if (email.length() == 0)
			throw new IllegalArgumentException("Invalid email");
		for (int i = 0; i < specialCharacter.length; i++) {
			if (Character.toString(email.charAt(0)).contains(specialCharacter[i])
					|| Character.toString(email.charAt(email.length() - 1)).contains(specialCharacter[i]))
				throw new IllegalArgumentException("Invalid email");
		}

		int count = 0;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '.')
				count++;
			if (count > 1)
				break;
			if (email.charAt(i) == '#')
				throw new IllegalArgumentException("Invalid email");
		}
		return true;
	}

	
}
