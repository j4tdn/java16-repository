package view;

import java.util.Scanner;

public class Ex05MultipleException {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("x= "+findXlv12());

	}
	
	private static float findXlv12() {
		int a = nextInt("a");
		int b = nextInt("b");
		if (a == 0) {
			throw new ArithmeticException("Enter a !=0");
			
		}
		return (float) -b/a;

	}
	private static int nextInt(String text) {
		do { 
			System.out.println("Enter "+ text + ": ");
			String numberAsText ="";
			if(numberAsText.matches("-?\\d+")) {
				break;
			}
			
		} while (true);
		return Integer.parseInt(numberAsText);
	}
	
	

	private static float findX() {
		Scanner ip = new Scanner(System.in);

		try {
			//NumberFormat
			//Arithmetic
			//NullPointer
			System.out.println("Enter a: ");
			int a = Integer.parseInt(ip.nextLine());

			System.out.println("Enter b: ");
			int b = Integer.parseInt(ip.nextLine());

			return (float) -b / a;
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Integer.MIN_VALUE;
	}

}
