package view;

import java.util.Scanner;
import java.util.regex.Pattern;

import exception.IsException;

public class Ex03EmailCheck {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String email;
		while (true) {
			try {
				System.out.println("Enter your email: ");
				email = ip.nextLine();
				if (checkEmail(email)) {
					int index = email.indexOf("@");
					String prefix = email.substring(0, index);
					String domain = email.substring(email.indexOf("@") + 1, email.length());
					if (prefixEmail(prefix) && domainEmail(domain)) {
						System.out.println("Email: " + email);
						break;
					}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());	
			}
		}
	}

	public static boolean checkEmail(String str) {
		if (!str.contains("@")) {
			throw new IsException("Invalid due to no @ character");
		}
		return true;
	}

	private static boolean prefixEmail(String str) throws IsException {
		if (str.length() == 0) {
			throw new IsException("Email must have prefix");
		}
		if (str.matches(".*[^\\w-_.].*")) {
			throw new IsException("Allowed characters: letters (a-z), numbers, underscores, periods, and dashes.");
		}
		if (str.endsWith("-") || str.endsWith("_") || str.endsWith(".")) {
			throw new IsException("An underscore, period, or dash must be followed by one or more letter or number");
		}
		if (str.startsWith("-") || str.startsWith("_") || str.startsWith(".")) {
			throw new IsException("Prefix must start with aphabetic character");
		}
		return true;
	}

	private static boolean domainEmail(String str) throws IsException {
		if (str.length() == 0) {
			throw new IsException("Email must have domain");
		}
		if (!str.startsWith("mail")) {
			throw new IsException("Domain must start with [mail]");
		}
		return true;
	}
}
