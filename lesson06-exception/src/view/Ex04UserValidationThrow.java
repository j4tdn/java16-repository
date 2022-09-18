package view;

import java.util.Scanner;

//import javax.security.auth.DestroyFailedException;

public class Ex04UserValidationThrow {
	public static void main(String[] args) {
		//Password requirements
		//1. At least 8 characters
		//2. At most 256 characters
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = ip.nextLine();
	
		boolean isPass = false;
		try {
			isPass = validate(password);
		} catch (IllegalArgumentException e) {
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		if(isPass) {
			System.out.println("Create account successful");
		}
		
		System.out.println("Finish ...");
		ip.close();
	}
	//throw new X
	//X: compile exception
	//   --> vị trí khai báo hàm bắt buộc throws X
	//X: runtime exception
	//   --> vị trí khai báo hàm không cần throws X
	public static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("At least 8 character");
		//	System.out.println("At least 8 character");
		//	return false;
		}
		if (length > 256) {
			throw new IllegalArgumentException("At most 256 character");
		//	System.out.println("At most 256 character");
		//	return false;
		}
		
		// ai least one lower letter 
		boolean atLeastOneLowerLetter = false;
		for (int i = 0; i < length; i++) {
			if ( Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowerLetter = true;
				break;
			}
		}
		if (!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower letter");
		//	System.out.println("At least one lower letter");
		}
		return atLeastOneLowerLetter;
	}
}
