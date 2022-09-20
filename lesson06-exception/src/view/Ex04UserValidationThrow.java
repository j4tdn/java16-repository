package view;

import java.util.Scanner;

public class Ex04UserValidationThrow {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password ");
		String pw = ip.nextLine();
		
		boolean isPassed = false;
		try {
			isPassed = validate(pw);
		} catch (IllegalArgumentException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
//		if(validate(pw)) {
//			System.out.println("create account success");	
//		}
		System.out.println("finished .. ");
		ip.close();
	}
	
	//throw new X
	//X: compile exception
	// --> vi tri khai bao ham bat buoc throws  X
	//X : runtime exception
	// --> vi tri khai bao ham khong can throws X
	private static boolean validate(String pw) {
		int lengt = pw.length();
		if(lengt < 8) {
			//System.out.println("duoi 8 ki tu");
			//return false;
			throw new IllegalArgumentException("duoi 8 ki tu");
		}
		if(lengt > 256) {
			//System.out.println("tren 256 ki tu");
			//return false;
			throw new IllegalArgumentException("tren 256 ki tu");
		}	
		boolean k = false;
		for(int i = 0 ; i < lengt ; i ++) {
			if(Character.isLowerCase(pw.charAt(i))) {
				k = true;
				break;
			}
		}
		if(!k) {
			//System.out.println("at least one lower letter");
			throw new IllegalArgumentException("at least one lower letter");
		}
		return k;
	}
}
