package view;

import java.util.Scanner;

public class Ex05MultipleException {
	Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("x = " + findXlevel12());
		
	}
	private static float findXlevel12() {
		int a = nextInt("a");
		int b = nextInt("b");
		if(a==0) {
			throw new ArithmeticException("please enter a !=0");
			
		}
		return (float)-b/a;
	}
	private static int nextInt(String text) {
		Scanner ip = new Scanner(System.in);

		String numberAstext = "";
		do {
			System.out.println("Enter" + text + ":");
			String numberAsText = ip.nextLine();
			if(numberAstext.matches("\\d+")) {
				break;
			}
		}while(true);
		return Integer.parseInt(numberAstext);
	}

}
