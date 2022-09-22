package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String email;
		do {
			try {
				System.out.println("Enter email: ");
				email = ip.nextLine();
				if (Valid(email)) {
					System.out.println("success");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} while (true);
		ip.close();
	}

	private static boolean Valid(String email) {

		Pattern Email = Pattern.compile("@gmail.com");
		if (!Email.matcher(email).find()) {
			throw new RuntimeException("Emails short @mail.com ");
		}

		return true;
	}

}