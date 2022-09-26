package view;


import java.util.Scanner;

public class Ex01DateOfBirthValidate {
	public static void main(String[] args) {
		//Luu y nen dung chinh xác exception xảy ra trong catch
		
		Scanner ip = new Scanner(System.in);
		String yobAsText = "";
		do {
			System.out.println("Enter year your birth");
			yobAsText = ip.nextLine();
			if(yobAsText.matches("\\d+")){
				break;
			}
			
		} while (true);
		
		
		int yob = Integer.parseInt(yobAsText);
		//int curYear = Year.now().getValue();
		System.out.println("year of birth : "+yob);
		ip.close();
		
		
	}

}
