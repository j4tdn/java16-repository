package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
	public static void main(String[] args) {
		int age = 18;
		try {
			if(validate(age)) {
				System.out.println("can but a ticket");
			}else {
				System.out.println("Invalid ");
			}
			
		} catch (InvalidAgeException e) {
			
				System.out.println(e.getMessage());
			
		}
		
	}
	private static boolean validate(int age) throws InvalidAgeException {
		if( age < 16) {
			throw new InvalidAgeException(16);
		}
		return true;
		
	}

}
