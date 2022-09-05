package ex03_lcmultiple;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		System.out.println("BSCNN của " + a + " và " + b + " là: " + BSCNN(a, b));

	}

	public static int USCLN(int a, int b) {
		if (b == 0)
			return a;
		return USCLN(b, a % b);
	}

	public static int BSCNN(int a, int b) {
		return (a * b) / USCLN(a, b);
	}
}
