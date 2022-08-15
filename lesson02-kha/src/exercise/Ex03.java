package exercise;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String numberAsText = "";
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("nhap vao` 1 so : ");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));
		System.out.println(isRevertNumber(numberAsText) ? numberAsText + " la` so doi xung" : numberAsText + " khong la` so doi xung");
		System.out.println("Finish...");
	}
	
	private static boolean isRevertNumber(String number) {
		return (number.equals(revert(number)));
	}
	
	private static String revert(String text) {
		String tmp = "";
		for (int i = text.length()-1; i >= 0; i--) {
			tmp+= text.charAt(i);
		}
		return tmp;
	}
	
}
