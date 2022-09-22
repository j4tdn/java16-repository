package view;

import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	public static void main(String[] args) {
		System.out.println("x = " + findX2());
		
	}
	private static Scanner sr = new Scanner(System.in);
	
	private static float findX2() {
		int a = nextInt("a");
		int b = nextInt("b");
		if (a==0) {
			throw new ArithmeticException("Please enter a!=0");
		}
		return (float) -b/a;
	}
	
	private static int nextInt(String text) {
		String numberAsText = "";
		do {
			System.out.println("Enter " + text + ": ");
			numberAsText = sr.nextLine();
			if (numberAsText.matches("-?\\d+")) {
				break;
			}
		} while(true);
		return Integer.parseInt(numberAsText);
	}
	
	private static float findX() {
		try {
			System.out.println("Enter a: ");
			int a = Integer.parseInt(sr.nextLine());
			System.out.println("Enter b: ");
			int b = Integer.parseInt(sr.nextLine());
			
			return (float) -b/a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Integer.MIN_VALUE;
	}
}
