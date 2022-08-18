package view;

import java.util.Scanner;

public class Ex05Base2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x, i = 1, sum = 0;
		System.out.print("Enter number: ");
		n = sc.nextInt();
		do {
			x = n % 2;
			sum = sum + (i * x);
			n = n / 2;
			i = i * 10;
		} while (n > 0);
		System.out.println("Binary of number " + n + " is:" + sum);
	}

}
