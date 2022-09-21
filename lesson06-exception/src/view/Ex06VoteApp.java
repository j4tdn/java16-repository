package view;

import java.util.Random;

import exception.inValidAgeException;

public class Ex06VoteApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15  + new Random().nextInt(6);
		
		boolean isValid = false;
		try {
			isValid = validate(age);
		} catch (inValidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("isValid :" + isValid);
	}
	
	private static boolean validate(int age) throws inValidAgeException {
		if(age<18) {
			throw new inValidAgeException();
		}
		
		return true;
	}

}
