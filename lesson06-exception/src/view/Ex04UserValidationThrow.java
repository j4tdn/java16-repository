package view;

import java.util.Scanner;

public class Ex04UserValidationThrow {
	public static void main(String[] args) {
		//Password requirements
		// at least 8 characters
		// at most 256 characters
		
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Enter Password: ");
			String password = ip.nextLine();
			try {
				if(validatePassword(password)) {
					System.out.println("Create account successful");
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
		}while(true);
		
		

		System.out.println("Finishes....");
		ip.close();
	}
	// throw new X:
	// + X: compile exception
	//		--> vị trí khai báo hàm bắt buộc throws
	// + X: runtime exception
	//		-->>vị trí khai báo hàm không bắt buộc throws
	private static boolean validatePassword(String password) {
		if(password.length()<8 || password.length()>256) {
			throw new IllegalArgumentException("Invalid lenght");
		
		}
		for (int i = 0; i < password.length(); i++) {
			if(Character.isLowerCase(password.charAt(i)))
				return true;
		}
		throw new IllegalArgumentException("At least 1 lower letter");
	}
}
