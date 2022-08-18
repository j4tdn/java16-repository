package view;


import java.util.Scanner;

public class Ex02Sum {

	public static void main(String[] args) {
		int s = 1, a, b, c, d;
		int a1 = 1, a2 = 1, a3 = 1, a4 = 1; 
		Scanner sc = new Scanner(System.in);
		System.out.print("factorial 1: ");
		a = sc.nextInt();
		System.out.print("factorial 2: ");
		b = sc.nextInt();
		System.out.print("factorial 3: ");
		c = sc.nextInt();
		System.out.print("factorial 4: ");
		d = sc.nextInt();
		for (int i = 1; i <= a ; i++) {
			a1 = a1 * i;
		}
		for (int i = 1; i <= b ; i++) {
			a2 = a2 * i;
		}
		for (int i = 1; i <= c ; i++) {
			a3 = a3 * i;
		}
		for (int i = 1; i <= d ; i++) {
			a4 = a4 * i;
		}
		s= a1 + a2 + a3 + a4;
		System.out.println("S ="+ a + "!" + b + "!" + c + "!" + d + "! =" + s);
	}
}
