package ex04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckAccount {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter username: ");
		String username = ip.nextLine();
		String password;
		while(true) {
			try {
				System.out.print("Enter password: ");				
				password=ip.nextLine();
				if(checkPassWord(username,password)) {
					System.out.println("Register succesfully");
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static boolean checkPassWord(String username,String password) throws Exception{
		if (password.length() < 8) {
			throw new Exception("PassWord password has more than 8 character");
		}

		if (!Pattern.matches(".*[0-9].*", password)) {
            throw new Exception("Password must have at least 1 number character");
        }

        if (!Pattern.matches(".*[A-Z].*", password)) {
            throw new Exception("Password must have at least 1 uppercase character");
        }

        if ((!Pattern.matches(".*[^a-zA-Z0-9].*", password))) {
            throw new Exception("PassWord must have at least 1 special character.");
        }
		
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
        	String charat=password.substring(i, i+1);
            if (username.contains(charat))
                count++;
            if (count == 3)
                throw new Exception("Password cannot match 3 characters of username");
        }
        return true;
	}
}
