package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a: ");
		double a = sc.nextInt();
		System.out.println("Enter number b: ");
		double b = sc.nextInt();
		//System.out.println("is relatively prime: " +CheckRelativelyPrime(a, b));
		if(CheckRelativelyPrime(a, b)==true) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
	private static boolean CheckRelativelyPrime(Double a, Double b)
	{
		 double x = a>b?a:b;
		 for(int i = 2; i<x; i++) {
			 if(isPrimeNumber(i)) {
				 if((a%i==0 && b%i!=0) || (a%i!=0 && b%i==0))
					 return false;
			 }
		 }
		return true;
	}
	private static boolean isPrimeNumber(double n) {
		if(n<2) {
			return false;
		}
		for(int i=1; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}