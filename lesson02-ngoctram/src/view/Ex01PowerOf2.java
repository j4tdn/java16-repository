package view;

import java.util.Scanner;

// class name: noun
// method name: [phrase]verb
// naming convention: camel case 
// 1st letter of class: Upper
// 1st letter of method, variable: Lower
// package name: all in lower

public class Ex01PowerOf2 {
	private static boolean isPowerOf2(int number) {
		// Cách 1
		if (number == 1)
			return true;
//		if (number % 2 == 1)
//			return false;
//		while (number % 2 == 0) {
//			number = number / 2;
//		}
//		if (number == 1)
//			return true;
//		else
//			return false;

		if (number <= 0)
			return false;
		while (number != 1) {
			if (number % 2 != 0)
				return false;
			number /= 2;
		}
		return true;
	}
	
	private static boolean isPowerOf(int a, int b) {
		if (b<0) {
			return false;
		}
		double n = Math.log(b)/Math.log(a);
		return Math.ceil(n) == Math.floor(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		if (isPowerOf2(number)) {
			System.out.println(number + " is the power of 2");
		} else {
			System.out.println(number + " is not the power of 2");
		}
		
		if (isPowerOf(2,number)) {
			System.out.println(number + " is the power of 2");
		} else {
			System.out.println(number + " is not the power of 2");
		}
		sc.close();
	}
}
