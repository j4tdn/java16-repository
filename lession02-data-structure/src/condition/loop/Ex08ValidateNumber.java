package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		//enter and validate a number
		//if number of wrong time exceed 3-->exit system
		Scanner ip =new Scanner(System.in);
		String numberAsTest= "";
		
		//validation
		int wrongTimes=0;
		do {
			System.out.println("Enter valid number ");
			numberAsTest = ip.nextLine();
			
			if(numberAsTest.matches("\\d+")) {
				break;
			}
			wrongTimes++;
			if(wrongTimes==3) {
				System.out.println("EXIT  ");
				return;//dừng lại hàm có kdl trả về là void
				//System.exit(0);//thoát khỏi chương trình
			}

		} while (true);
		

		int number=Integer.parseInt(numberAsTest);//chuyển chuỗi qua số
		System.out.println("valid: " +number);
		
	}
}
