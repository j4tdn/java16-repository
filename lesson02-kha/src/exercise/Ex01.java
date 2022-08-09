package exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int number = 0;
		Scanner ip = new Scanner(System.in);
		Boolean check = true;
		int count = 0;
		do {
			System.out.print("Nhập vào 1 số : ");
			String numberAsText = ip.nextLine();
			if(numberAsText.matches("\\d+")) {
				check = false;
				number = Integer.parseInt(numberAsText);
				System.out.println(IsPowerOfTwo(number)?number + " là lũy thừa của 2":number + " không là lũy thừa của 2");
			}
			else {
				count++;
				System.out.println();
			}
		} while (check && count < 3);
		System.out.println("Finish...");
		
	}
	
	private static boolean IsPowerOfTwo(int x){
	    return (x & (x - 1)) == 0;
	}
}
