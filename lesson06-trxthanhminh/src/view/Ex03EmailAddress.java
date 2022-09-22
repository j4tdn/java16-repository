package view;

import java.util.Scanner;

public class Ex03EmailAddress {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = sr.nextLine();
		boolean invalid = false;
		try {
			invalid = validate(email);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		if (validate(email)) {
			System.out.println("Enter email successful!");
		}
		sr.close();
	}
	
	private static boolean validate(String email) {
		if(!email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
			throw new IllegalArgumentException("Pleasr enter email again !");
		}
		return true;
	}
}
