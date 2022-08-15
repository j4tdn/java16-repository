package Condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String numberAsText = "";
		int wrongtime = 0;
        do {
			String wrongtimeAsText = wrongtime > 0? "("+wrongtime+")" : "";
			System.out.print("Enter valid number: " + wrongtimeAsText + ": ");
			numberAsText = ip.nextLine();
			if (!numberAsText.matches("\\+d")) {
				
			wrongtime++;
				if (wrongtime == 3) {
					System.out.println("You enter wong text exceed 3 times");
					return ;
				}continue;
			}break;
				
			
		}
        while (true);
        int number = Integer.parseInt(numberAsText);
        System.out.println("valid: " + number);
		}
	}


