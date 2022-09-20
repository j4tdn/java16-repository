package view;


import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String a = "";
		
		do {
			a  = ip.nextLine();
			if(a.matches("\\d+")) {
				break;
			}
		} while (true);

		
		System.out.println(a);
		
		
		
		ip.close();
	}

}
