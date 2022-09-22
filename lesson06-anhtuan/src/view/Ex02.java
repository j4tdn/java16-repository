package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		try (Scanner ip = new Scanner(System.in)) {
			do {
				try {
					
					System.out.print("String password = ");
					String password = ip.nextLine();
					validate(password);
					if(validate(password)) {
						System.out.println("success");
					}
					break;
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
					
				}
			}while(true);
		}
		
	}
	private static boolean validate(String password) throws Exception {
		if(password.length() < 8) {
			throw new IllegalArgumentException("At least 8 charaters");
		}
		if(password.length() > 256) {
			throw new IllegalArgumentException("At most 256 charaters");
		}
		if(!password.matches(".*[a-z].*")) {
			throw new IllegalArgumentException("At least 1 lowercase alphabetic charaters");
		}
		if(!password.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("At least 1 uppercase alphabetic charaters");
		}
		if(!password.matches(".*\\d.*")) {
			throw new IllegalArgumentException("At least 1 number");
		}
		if(!password.matches(".*[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-].*")) {
			throw new IllegalArgumentException("At least 1 special charater");
		}
		return true;
	}

}
