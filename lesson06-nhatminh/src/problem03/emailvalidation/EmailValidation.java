package problem03.emailvalidation;

import java.util.Scanner;

import problem03.exception.EmailException;
import problem03.exception.detail.DividedCharacterException;
import problem03.exception.detail.DomainUnallowedCharacterException;
import problem03.exception.detail.EmailFormatException;
import problem03.exception.detail.TopLevelDomainLengthException;
import problem03.exception.detail.PrefixUnallowedCharacterException;
import problem03.exception.detail.TopLevelDomainException;

public class EmailValidation {
	public static void main(String[] args) {
		System.out.println("Email Accepted: " + validateEmail());
	}

	private static String validateEmail() {
		Scanner sc = new Scanner(System.in);
		String email = "";
		do {
			try {
				System.out.print("Enter email: ");
				email = sc.nextLine();
				checkEmail(email);
				break;
			} catch (EmailException e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		return email;
	}

	private static void checkEmail(String email) throws EmailException {
		String[] arr = email.split("@");
		// Cannot split to prefix and domain
		if (arr.length != 2)
			throw new EmailFormatException();
		if (email.matches(".*[-_.]{2,}.*"))
			throw new DividedCharacterException();
		// arr[0]: prefix, arr[1]: domain
		String prefix = arr[0];
		String domain = arr[1];
		// PREFIX
		if (prefix.matches(".*[^a-z0-9.-_].*"))
			throw new PrefixUnallowedCharacterException();
		// DOMAIN
		if (domain.matches(".*[^a-z0-9.-].*"))
			throw new DomainUnallowedCharacterException();
		String[] arrDomain = domain.split("\\.");
		if (arrDomain.length < 2)
			throw new TopLevelDomainException();
		if (arrDomain[arrDomain.length - 1].length() < 2)
			throw new TopLevelDomainLengthException();
	}
}
