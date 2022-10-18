package view;

import java.util.Scanner;

public class Ex04EquivalentPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(isEquivalentPrimeNumber(num1, num2));
	}
	
	private static String isEquivalentPrimeNumber(int num1, int num2)
	{
		 int x = num1>num2?num1:num2;
		 for(int i = 2; i<x; i++) {
			 if(checkIsPrime(i)) {
				 if((num1%i==0 && num2%i!=0) || (num1%i!=0 && num2%i==0))
					 return "No";
			 }
		 }
		return "Yes";
	}
	private static boolean checkIsPrime(int n) {
		boolean arr[] = new boolean[n+1];
		for(int i = 0; i<=n; i++) {
			arr[i] = true;
		}
		arr[0] = arr[1] = false;
		for(int i =2; i <= n; i++) {
			if(arr[i])
				for(int j = i*2; j<=n; j+=i) {
					arr[j] = false;
				}
		}
		return arr[n];
	}
}
