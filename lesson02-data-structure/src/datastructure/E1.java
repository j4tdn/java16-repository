package datastructure;

import java.util.Scanner;

public class E1 {
	public static void main(String args[]) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("The first number: ");
		x = sc.nextInt();
		System.out.print("The second number: ");
		y = sc.nextInt();
		System.out.println("Before Swapping\nx = " + x + "\ny = " + y);
		swap(x, y);
	}

	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("After Swapping\nx = " + a + "\ny = " + b);
	}
}
