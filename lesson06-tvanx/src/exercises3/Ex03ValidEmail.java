package exercises3;

import java.util.Scanner;

import exception.EmailException;

public class Ex03ValidEmail {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter Email address: ");
		String email = ip.nextLine();

		try {
			checkEmail(email);
			System.out.println("Email Accepted");
		} catch (EmailException e) {
			System.out.println("error --> " + e.getMessage());
		}

		System.out.println("Finished..args.");
	}

	private static void checkEmail(String email) throws EmailException {
		String[] list = email.split("@");

		if (list.length != 2) {
			throw new EmailException("Wrong format Email Exception");
		}

		String prefix = list[0];
		if (prefix.matches(".*[!#$%^&*+=?].*")) {
			throw new EmailException("no special characters in email");
		}
		if(prefix.matches(".*[-_.]{2,}.*")) {
			throw new EmailException("no two dot in characters in email");
		}


		
		String domain = list[1];
		String[] listdomain = domain.split("\\.");
		if (listdomain.length < 2) {
			throw new EmailException("Wrong format domain Email Exception");
		}

	}

}
