package condition.loop;

import java.util.Scanner;

public class Ex08validateNumber {
	public static void main(String[] args) {
		// Enter and validate a number
		// If number of wrong times exceed 3 --> Exit system
		// ip.netLine() --> string.matches("\\d+)
		
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTimes = 0;
		do {
			System.out.print("Enter valid number: ");
			numberAsText = ip.nextLine();
			if (numberAsText.matches("\\d+")){
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("Wrong times > 3 ==> Exit");
			}
			
		} while (true);
		
		// 
		
		int number = Integer.parseInt(numberAsText);
		System.out.println("value " + number);
		
	}
}
