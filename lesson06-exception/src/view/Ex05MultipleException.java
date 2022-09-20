package view;

import java.util.Scanner;

public class Ex05MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("x2 = " + findXLevel2());
	}
	
	private static float findXLevel2() {
		int a = nextInt("a");
		int b = nextInt("b");
		if (a==0) {
			throw new ArithmeticException("please enter a != 0");
		}
		return (float)-b/a;
	}
	
	private static int nextInt(String text) {
		String numberAsText = "";
		Scanner ip = new Scanner(System.in);
		do {
			System.out.println("Enter " + text + ": ");
			numberAsText = ip.nextLine();
			if (numberAsText.matches("-?\\d+")) { //nhap so nguyen duong hoac am
				break;
			}
		} while (true);
		ip.close();
		return Integer.parseInt(numberAsText);
			
	}
	
	private static float findX() {
		Scanner ip = new Scanner(System.in);
		try {
			System.out.println("Enter a: ");
			int a = Integer.parseInt(ip.nextLine());
			
			System.out.println("Enter b: ");
			int b = Integer.parseInt(ip.nextLine());
		
			return (float)-b/a;
		}
		catch (NumberFormatException e) {
			//System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}		
		ip.close();
		return Integer.MIN_VALUE;
		
	}

}
