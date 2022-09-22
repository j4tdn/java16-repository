package view;

import java.util.Scanner;

public class Ex05MultipleException {
	private static 		Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
System.out.println("X = " +findX());
	}
	private static float findXLevel2() {
		int a=nextInt("a");
		int b=nextInt("b");
		if(a==0) {
			throw new ArithmeticException("please enter a!=0");
			
		}
		return(float)-b/a;
	}
	private static int nextInt(String text) {
		String numberAsText = "";
		do {
			System.out.println("Enter "  + text + ":");
			numberAsText=ip.nextLine();
			if(numberAsText.matches("-?\\d+")) {
				break;
			}
		}while(true);
		return Integer.parseInt(numberAsText);
		
	}

	private static int findX() {
		Scanner ip = new Scanner(System.in);
		try {
			// NumberFormatException
			// ArithmeticException
			// NullPointerException
			System.out.println("Enter a: ");
			int a = Integer.parseInt(ip.nextLine());

			System.out.println("Enter b: ");
			int b = Integer.parseInt(ip.nextLine());
			return -b / a;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		return Integer.MIN_VALUE;
	}

}
