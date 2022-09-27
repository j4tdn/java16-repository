package ex02;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String pass = "";
		do
		{
			try
			{
				System.out.println("Enter the password: ");
				pass = sc.nextLine();
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		while(checkpass(pass));
		System.out.println("SUCCESSFULLY ");
	}
	private static boolean checkpass(String pass)
	{
		
		boolean check1 = true;
		boolean check2 = true;
		boolean check3 = true;
		boolean check4 = true;
		
		if (pass.length() < 8 && pass.length() > 256) {
			throw new IllegalArgumentException("Your password must contain more than 8 and less than 256 letters");
		}
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isLowerCase(pass.charAt(i))) {
				check1 = false;
			}
			if (Character.isUpperCase(pass.charAt(i))) {
				check2 =false;
			}
			if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
				check3 = false;
			}
			String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
			if (specialChars.contains(pass.substring(i, i+1))) {
				check4 = false;
			}
		}
		if (check1) {
			throw new IllegalArgumentException("At least one lower characters");
		}
		if (check2) {
			throw new IllegalArgumentException("At least one upper characters");
		}
		if (check3) {
			throw new IllegalArgumentException("At least one number");
		}
		if (check4) {
			throw new IllegalArgumentException("At least one special character");
		}
		return check1 && check2 && check3 && check4;
	}
}
