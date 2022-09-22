package view;

import java.util.Scanner;

public class Ex01Equation {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(findX());
	}
	
	private static float findX() {
		int a = nextInt("a");
		int b = nextInt("b");
		try {
			if(a==0) {
				System.out.println("Enter a again with a!0: ");
				a=nextInt("a");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (float) -b/a;
	}

	private static int nextInt(String text) {
		String numberAsText = "";
		do {
			System.out.println("Enter " + text + ": ");
			numberAsText = ip.nextLine();
			if (numberAsText.matches("-?\\d+")) {
				break;
			}
		} while (true);
		return Integer.parseInt(numberAsText);
	}
}
