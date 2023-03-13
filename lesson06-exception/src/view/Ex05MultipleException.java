package view;

import java.util.Scanner;

public class Ex05MultipleException {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("x = " + findX());
		
		
		
	}
	
	private static float findXLevel2() {
		int a = nextInt("a");
		int b = nextInt("b");
		if (a==0) {
			throw new ArithmeticException("please enter a!=0 ");
		}
		return (float) -b/a;
	}
	
	
	private static int nextInt(String text) {
		String numberAsText = " ";
		do {
			System.out.println("Enter " + text + ":");
			String numberAsText = ip.nextLine();
			if (numberAsText.matches(("\\d+"));
			// \\d+ --> \\d(number) + (1|n letter)
			// -?: optional for -
			
			break;
		} while (true);
		return Interger.parseInt(numberAsText);
	}
	
	private static float findX() {
		
		try {
			// NumberFormatException
			// ArithmeticException
			// NullPointException
			
			System.out.println("Enter a: ");
			int a = Integer.parseInt(ip.nextLine());
			
			System.out.println("Enter b: ");
			int b = Integer.parseInt(ip.nextLine());
			
			return (float) -b/a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Integer.MIN_VALUE;
	}
}
