package view;

import java.util.Scanner;

public class Ex05Convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("change number: ");
		int n = sc.nextInt();
		Convert(n);
	}
	private static void Convert(int change) {
		int m = 0;
		String x = "";
		while (change > 0) {
			x = (change % 2) + x;
			change = change /2;
		}
		System.out.println("Convert= " + x);
	}

}
