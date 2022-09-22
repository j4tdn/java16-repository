package exercises;

import java.util.Scanner;

public class Ex01OneSolutionEquation {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		do {
			try {
				System.out.println(findX());
				break;
			}catch(ArithmeticException e) {
				System.out.println("error --> "+e.getMessage());
			}
		}while(true);
	}
	
	private static float findX() {
		int a= nextInt("a");
		int b = nextInt("b");
		System.out.println(a+"x"+" +"+b+" = 0");
		if(a==0) {
			throw new ArithmeticException("Please enter a != 0");
		}
		
		return (float)-b/a;
	}
	private static int nextInt(String text) {
		String numberAsText="";
		do {
			System.out.print("Enter "+text+" : ");
			numberAsText=ip.nextLine();
			if (numberAsText.matches("-?\\d+")){
				break;
			}
			else {
				System.out.println("enter "+text+" is a number!!!");
			}
		}while(true);
		return Integer.parseInt(numberAsText);
	}
}
