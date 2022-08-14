package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		//Enter and validate a number 
		// if number of wrong times exceed 3 --> Exit system
		// ip.nexLine() --> string.matches("\\d+)
		
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTimes = 0;
//		do {
//			System.out.print("Enter valid number: ");
//			numberAsText = ip.nextLine();
//			if((!numberAsText.matches("\\d+")){
//				break;
//			}
//			wrongTimes ++;
//			if(wrongTimes == 3) {
//				return ;			
//			}
//		}while(true);
		do {
			String wrongTimeAsText = wrongTimes > 0 ? "("+wrongTimes+")": "";
			System.out.print("Enter valid number: ");
			numberAsText = ip.nextLine();
			if(!numberAsText.matches("\\d+")){
				wrongTimes ++;
				if (wrongTimes == 3) {
					System.out.println("wrong Time = 3 --> Exit");
					return;
				}
				continue;
			}
			break;
		}while(true);
		int number = Integer.parseInt(numberAsText);
		System.out.println("number: "+ number);		
		}
}
