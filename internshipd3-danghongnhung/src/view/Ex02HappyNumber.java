package view;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number: ");
		int number = sc.nextInt();
		System.out.println(isHappyNumber(number));
	}
	static boolean isHappyNumber(int number) {
		Set<Integer> setA = new HashSet<Integer>();
		while(number!=1)
		{
			setA.add(number);
			number=happyNumber(number);
			if(setA.contains(number))
				return false;
		}

		return true;
	}


	static int happyNumber(int number) {
		int sum = 0;
		while (number != 0) {
			sum += Math.pow((number % 10), 2);
			number /= 10;
		}
		return sum;
	}

}
