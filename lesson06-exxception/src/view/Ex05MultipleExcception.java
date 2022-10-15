package view;

import java.util.Scanner;

public abstract class Ex05MultipleExcception {
public static void main(String[] args) {
	
}
private static int findX() {
	Scanner ip = new Scanner(System.in);
	try {
		//NumberFormaatException
		//ArithmetiException
		//NullPointerException
	System.out.print("enter a: ");
	int a = Integer.parseInt(ip.nextLine());
	System.out.println("enter b:");
	int b = Integer.parseInt(ip.nextLine());
	return -b/a;
	}catch(NumberFormatException e) {
e.printStackTrace();

	return Integer.MIN_VALUE;
	
	
}
}
}

