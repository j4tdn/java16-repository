package view;

import java.util.Random;

import exception.InvalidAgeException;

public class Ex06VoteApp {
	public static void main(String[] args) {
		int age = 15 + new Random().nextInt(6);

		try {
			boolean isValid = validate(age);
			System.out.println("isValid: " + isValid);
		} catch (Exception e) {
			
		}
	}

private static boolean validate(int age) throws InvalidAgeException
{
	if(age < 18)
	{
		throw new InvalidAgeException("Age must be greater or equal 18");
		
	}
	return true;
}
}
