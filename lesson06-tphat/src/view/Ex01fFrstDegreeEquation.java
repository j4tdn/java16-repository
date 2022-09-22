package view;

import java.util.Scanner;

public class Ex01fFrstDegreeEquation {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				System.out.println(findXLevel2());
				break;
			} catch (ArithmeticException e) {
				System.out.println("message " + e.getMessage());
			}
		} while (true);
	}

	private static float findXLevel2() {
		int a = nextInt("a");
		if (a == 0) {
			throw new ArithmeticException("Please enter a !=0");
		}
		int b = nextInt("b");
		
		return (float) -b / a;
	}

	private static int nextInt(String text) {
		String numberAsText = "";
		do {
			try {
				System.out.println("Enter " + text + ":");
				numberAsText = ip.nextLine();
				if (numberAsText.matches("-?\\d+"))
					break;

			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("ERROR!! Please input the number!");
			}
		} while (true);
		return Integer.parseInt(numberAsText);
	}
}
