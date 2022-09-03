package pascaltriangle;

import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {
		display();
	}

	static long factorial(int n) {
		long fact = 1;
		if (n == 0 || n == 1) {
			return 1;
		} else
			for (int i = 2; i <= n; i++) {
				fact *= i;
			}
		return fact;
	}

	public static void display() {
		System.out.println("nhap chieu cao:");
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(factorial(i) / (factorial(j) * factorial(i - j)) + " ");
			}
			System.out.println(" ");
		}
	}

}
