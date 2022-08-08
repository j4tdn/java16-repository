package homework;

import java.util.Scanner;

public class Ex03SymmetricNumber {
	private static boolean isSymmetricNumber(Integer number) {
		char[] numberToChar = number.toString().toCharArray();
		int i = 0, n = numberToChar.length;
		while (i < n / 2) {
			if (numberToChar[i] == numberToChar[n-1-i])	i++;
			else return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer number = sc.nextInt();
		if (isSymmetricNumber(number)) 
			System.out.println(number + " is symmetric");
		else 
			System.out.println(number + " is not symmetric");
		sc.close();
	}
}
