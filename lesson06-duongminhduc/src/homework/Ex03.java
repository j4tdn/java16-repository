package homework;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter email: ");
				String email = ip.nextLine();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println("Finished ... ");
	}

	public static void checkEmail(String email){
		
	}
}

