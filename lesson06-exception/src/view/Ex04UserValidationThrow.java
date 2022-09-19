package view;

import java.util.Scanner;

public class Ex04UserValidationThrow {
	public static void main(String[] args) {
		// password requirements
		// 1. At least 8 characters
		// 2. At most 256 characters

		Scanner ip = new Scanner(System.in);

		System.out.println("Enter password: ");
		String password = ip.nextLine();
		
		boolean isPassed = false;
		
		try {
			isPassed = validate(password);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		if(isPassed) {
			System.out.println("Create account successful");
		}
		
		System.out.println("Finished... !!!");
		ip.close();
	}

	
	//throw new X
	//X: compile Exception 
	//	--> vị trí khai báo hàm mình phải throws X
	//X: runtime exception
	private static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
//			System.out.println("At Least 8 characters");
//			return false;
			throw new IllegalArgumentException("At Least 8 lower characters");
		}
		if (length > 256) {
			throw new IllegalArgumentException("At Most 26 characters");
//			System.out.println("At Most 26 characters");
//			return false;
		}

		// at least one character
		boolean atLeastOneLowwerLetter = false;
		for (int i = 0; i < length; i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowwerLetter = true;
				break;
			}
		}
		if (!atLeastOneLowwerLetter) {
			throw new IllegalArgumentException("At Least 1 lower leter");
			//System.out.println("At Least 1 lower leter");
		}

		return atLeastOneLowwerLetter;
	}
}
