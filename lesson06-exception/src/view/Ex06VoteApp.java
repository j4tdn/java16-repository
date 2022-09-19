package view;

import java.util.Random;

import exception.InvalidAgeException;

public class Ex06VoteApp {
	public static void main(String[] args) {
		int age = 15 + new Random().nextInt(6);

		boolean isValid;
		try {
			isValid = validate(age);
			
			System.out.println("isValid: " + isValid);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Finished ...");
	}

	private static boolean validate(int age) throws InvalidAgeException{
		if (age < 18) {
			throw new InvalidAgeException("Age must be greatter or equal than 18");
		}
		
		return true;
	}
}
