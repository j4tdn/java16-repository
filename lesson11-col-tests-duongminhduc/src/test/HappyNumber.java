package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println ("Enter a non-zero integer number :");
			int number = sc.nextInt();
			System.out.println(checkHappyNumber(number)?"It is a Happy Number":"It is an Unhappy Number");
		}
	}

	public static boolean checkHappyNumber(int number) {
		Set<Integer> numbers = new HashSet<Integer>();
		while (numbers.add(number))
		{
			int sum = 0,r = 0;
			while (number > 0) 
			{
				r = number % 10;
				sum += Math.pow(r, 2);
				number = number / 10;
			}
			number = sum;
			if(number == 1)
			{
				return true;
			}
		}
		return false;
	}
}
