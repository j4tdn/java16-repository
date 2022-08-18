package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		String numberAsText ="";
		int wrongTimes =0;
		do {
			String wrongTimesAsText =wrongTimes >0 ? "("+wrongTimes+")":"";
			System.out.println("Enter valid number:"+wrongTimesAsText +": ");
			numberAsText =ip.nextLine();
			if(!numberAsText.matches("\\d+")) {
				wrongTimes++;
				if(wrongTimes==3) {
					System.out.println("wrongTimes ==3 __>EXIT");
					return;
				}
				continue;
			}
			break;
		
		} while(true);
		int number =Integer.parseInt(numberAsText);
		System.out.println("value:"+number );
		
		
	}
}
