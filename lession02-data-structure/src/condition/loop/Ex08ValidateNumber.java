package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		//enter and validate a number
		//if number of wrong time exceed 3-->exit system
		Scanner ip =new Scanner(System.in);
		String numberAsTest="";
		int wrongtime=0;
		do {
			System.out.println("Enter valid number ");
			numberAsTest = ip.nextLine();
			if(!numberAsTest.matches("\\d+")) {
				wrongtime++;
       
				if(wrongtime==3) {
				System.out.println("wrong times >3");
				return;
			}
				continue;
			}
			break;
		} while (true);
		
		System.out.print("enter a valid number");
		String numberAsString =ip.nextLine();
		//validation
		
		int number=Integer.parseInt(numberAsString);
		System.out.println("number" + number);
		
	}

}
