package view;

import java.util.Random;

import exception.InvalidAgeException;

public class Ex06VoteApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15 + new Random().nextInt(6);
		
		try {
			boolean isValid = validate(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("qua 18 tuoi");
		}
		return true;
	}

}
