package ex04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String password, username;
		
		while (true) {
			try { 
				System.out.print("Username: ");
				username = ip.nextLine();
				System.out.print("Password: ");
				password = ip.nextLine();
				if (isCheckPass(password, username)) {
					System.out.println("Register successfully");
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static boolean isCheckPass(String password, String username) throws Exception {
		if (password.length() < 8) {
			throw new Exception("Password must be at least 8 characters");
		}

		if (!Pattern.matches(".*([0-9]{1,}).*", password)) {
			throw new Exception("Password must have at least 1 number character");
		}

		if (!Pattern.matches(".*([A-Z]{1,}).*", password)) {
			throw new Exception("Password must have at least 1 uppercase character");
		}

		if ((!Pattern.matches(".*[^a-zA-Z0-9].*", password))) {
			throw new Exception("PassWord must have at least 1 special character.");
		}

		int count = 0;
        for (int i = 0; i < password.length(); i++) {
            String value = password.substring(i, i + 1);
            if (username.contains(value))
                count++;
            if (count == 3)
                throw new Exception("Password cannot match 3 characters of username");
        }
		
		return true;
	}
}
