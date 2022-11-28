package test;

import java.util.*;

public class HappNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số nguyên khác không :");
		int number = sc.nextInt();
		System.out.println(checkHappyNumber(number) ? "True" : "False");
	}
	
	public static Boolean checkHappyNumber(int number) {
		Set<Integer> digits = new HashSet<Integer>();
		while (digits.add(number)) {
			int result = 0;
			while (number > 0) {
				result += Math.pow(number % 10, 2);
				number = number / 10;
			}
			number = result;
		}
		return number == 1;
	}
}
