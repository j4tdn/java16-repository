package view;

import java.util.Scanner;

public class Ex05MultipleException {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(findXLv2());
	}

	private static float findXLv2() {

		int a = nextInt("a");
		int b = nextInt("b");
		if(a == 0) {
			throw new ArithmeticException("lam` on nhap a # 0");
		}
		if(b == 0) {
			throw new ArithmeticException("lam on nhap b # 0");
		}
		return (float)-b/a;
	}
	
	private static int nextInt(String text) {
		String numberAstext = "";
		do {
		    System.out.println("Enter " + text + ": ");
		    numberAstext = ip.nextLine();
			if(numberAstext.matches("\\-?\\d+")) {
				break;
			}
		} while(true);
		return Integer.parseInt(numberAstext);
	}
	private static float findX() {	
		try {
			int a = Integer.parseInt(ip.nextLine());
			int b = Integer.parseInt(ip.nextLine());
			return (float)-b/a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Integer.MIN_VALUE;
	}

}
