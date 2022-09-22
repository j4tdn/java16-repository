package view;

import java.util.Random;

import exception.InvalidAgeException;

public class Ex06VoteApp {
	public static void main(String[] args) {
		int age = 15 + new Random().nextInt(6);
		System.out.println("Age: " + age);
		boolean isValid;
		try {
			isValid = validate(age);
			System.out.println("Age is valid? " + isValid);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean validate(int age) throws InvalidAgeException{
		if (age < 18) {
			throw new IllegalArgumentException("Age must be greater than or equal to 18");
		}
		return true;
	}
}
