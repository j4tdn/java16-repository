package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		try (Scanner ip = new Scanner(System.in)) {
			do {
				try {
					System.out.print("nhap email = ");
					String email = ip.nextLine();
					if(check(email)) {
						System.out.println("success");
					}
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage()); 
				}
}while(true);
		}
	}
	
	
	private static boolean check(String email) throws Exception {
		if(!email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
			throw new IllegalArgumentException("Enter error and re-enter");
		}
		return true;
	}

}

