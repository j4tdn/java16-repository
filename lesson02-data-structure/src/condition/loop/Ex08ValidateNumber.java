package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		// Enter and validate a number
		// If number of wrong times exceed 3 --> Exit system
		// ip.nextLine() --> string.matches("\\d+")
		// abc a1bc
		
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		// validation
		do {
			System.out.println("Enter valid number: ");
			numberAsText = ip.nextLine();
		}while(!numberAsText.matches("\\d+"));
		
		
		
		int number = Integer.parseInt(numberAsText);
		System.out.println("value: " + number);
		
	}
}

	

