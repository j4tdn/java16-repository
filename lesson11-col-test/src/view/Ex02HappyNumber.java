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
	
	static boolean isHappyNumber(int n) {
		
		Set<Integer> setA = new HashSet<Integer>();
		while(n!=1)
		{
			setA.add(n);
			n=happyNumber(n);
			if(setA.contains(n))
				return false;
		}
		
		return true;
	}


	static int happyNumber(int n) {
		int sum = 0;
		while (n != 0) {
			sum += Math.pow((n % 10), 2);
			n /= 10;
		}
		return sum;
	}
	

}