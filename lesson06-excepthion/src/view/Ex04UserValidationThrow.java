package view;

import java.util.Scanner;

public class Ex04UserValidationThrow {
	public static void main(String[] args) {
		/*
		 * Password requirements
		 * 1. At least 8 characters
		 * 2. At most 256 characters
		 * 3. At least 1 lower characters a,b,c...
		 */
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = ip.nextLine();
		boolean isPass = false;
		try {
			isPass = validate(password);
		}catch (IllegalArgumentException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		if(isPass) {
			System.out.println("Create acount successful");
		}
		System.out.println("Finish!!");
		ip.close();
	}

	/*
	 * Throw new X
	 * X: Compile exception
	 * --> Vị trí khai báo hàm bắt buộc throws x
	 * 
	 * X: Runtime exception
	 * --> Vị trí khai báo không cần throws X
	 */
	private static boolean validate(String password) {
		int len = password.length();
		if(len < 8) {
			throw new IllegalArgumentException("At least 8 character!!");
		//	System.out.println("At least 8 character!!");
			//return false;
		}
			
		if(len > 256 ) {
			throw new IllegalArgumentException("At most 256 character!!");
			//System.out.println("At most 256 character!!");
			//return false;
		}
	
		boolean atLeastOneLowerLetter = false;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowerLetter = true;
				break;
			}
		}
		if(!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower letter!!");
			//System.out.println("At least one lower letter!!");
		}
		return atLeastOneLowerLetter;
	}
}
