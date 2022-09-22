package view;

import java.util.Random;

import exception.InvalidAgeException;

public class Ex06VoteApp {
	public static void main(String[] args) {
		int age = 15 + new Random().nextInt(6);


		try {
			boolean isValid = validate(age);
			System.out.println("isValid: " + isValid);
		} catch (InvalidAgeException e) {
e.printStackTrace();
		}
		System.out.println("finish ");
	}

	private static boolean validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("age must be >18");
		}             //IllegalArgumentException
		return true;
	}

}
