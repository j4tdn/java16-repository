package view;

import java.util.Scanner;

public class Ex05MultipleException {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println(findXLevel2());
	}

	private static int nextInt(String varname) {
		String numberAsText = "";
		do {
			System.out.print("Enter " + varname + " : ");
			numberAsText = ip.nextLine();
			if(numberAsText.matches("-?\\d+")) break;
		} while (true);
		return Integer.parseInt(numberAsText);
	}
	
	private static float findXLevel2() {
		int a = nextInt("a");
		int b = nextInt("b");
		if(a == 0) {
			throw new ArithmeticException("please enter a != 0");
		}
		return -b/(float)a;
	}
	
	private static float findX() {
		Scanner ip = new Scanner(System.in);
		try {
			System.out.print("Enter a: ");
			int a = Integer.parseInt(ip.nextLine());
			System.out.print("Enter b: ");
			int b = Integer.parseInt(ip.nextLine());
			return -b/(float)a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Integer.MIN_VALUE;
	}
}
