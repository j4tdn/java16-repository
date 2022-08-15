package view;

import java.util.Scanner;
// class name:noun
// method name:[phase]verb
// naming convention: camel case
// first letter of class -> uper
// firt letter of variable, method -->lower
// package-name: lower
// project-name: lower
public class Ex01Power {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		do {
			System.out.println("nhập số: ");
			numberAsText = ip.nextLine();
		} while (!numberAsText.matches("\\d+"));
		int n = Integer.parseInt(numberAsText);

		boolean result = isPowerOfTwo(n);
		System.out.println(n + " luỹ thừa của 2 là: " + result);

	}

	public static boolean isPowerOfTwo(int n) {
		if (0 == n || 1 == n)
			return true;
		int x = n / 2;
		int y = n % 2;
		if (1 == y)
			return false;
		return isPowerOfTwo(x);
	}
	private static boolean PowerOfTwo(int number) {
		if(number <= 0) {
			return false;
		}
		while(number != 1 ) {
			if(number % 2 != 0)
			return false;
		
		number /= 2;
		}
		return true;		
	}
	// 2nd way
	private static boolean isPowerOf(int a, int b) {
		if(b <= 0) {
			return false;
		}
		double n = Math.log(b)/Math.log(a);
		return Math.ceil(n) == Math.floor(n);
	}
		
}
