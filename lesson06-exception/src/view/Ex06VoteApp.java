package view;

import java.util.Random;

import exception.InvalidAgeException;

public class Ex06VoteApp {
	public static void main(String[] args) {
		int age = new Random().nextInt(15,22);
		System.out.println(age);
		
		try {
			boolean isValid = validate(age);
			System.out.println("isvalid " + isValid);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("finished ..");
	}
	
	private static boolean validate(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Age must be greater than 18");
		}
		return true;
	}

}
