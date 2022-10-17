package view;

import java.util.Scanner;

public class Ex04Account {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter id account: ");
		String id = sr.nextLine();
		
		System.out.print("Enter password: ");
		String password = sr.nextLine();
		
		boolean issPassed = false;
		try {
			issPassed = validate(password);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		if (validate(password)) {
			System.out.println("Create account successfull");
		}
		
		sr.close();
	}
	
	private static boolean validate(String password) {
		if (!password.matches("\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$\"")) {
			throw new IllegalArgumentException("Please enter password again");
		}
		return true;
	}
}
