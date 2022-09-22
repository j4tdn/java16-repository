package view;

import java.util.Scanner;

public class Ex03Gmail {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter email: ");
				String email = ip.nextLine();
				check(email);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println("Finished ... ");
	}

	public static void check(String email) throws Exception {
		String[] arr = email.split("@");
		if (arr.length != 2)
			throw new Exception("Invalid email");
		if (email.matches(".*[-.]{2,}.*"))
			throw new Exception("An period, or dash must be followed by one or more letter or number!!!");
		String prefix = arr[0];
		if (prefix.matches(".*[^a-z0-9.-].*"))
			throw new Exception("Allowed characters in prefix: letters, numbers, dashes!!!");
		String domain = arr[1];
		if (domain.matches(".*[^a-z0-9.-].*"))
			throw new Exception(("Allowed characters in domain: letters, numbers, dashes!!!"));
		String[] arrDomain = domain.split("\\.");
		if (arrDomain[arrDomain.length - 1].length() < 2)
			throw new Exception(
					("The last position of the domain must be: .com, .org, .cc!!!"));
	}
}
