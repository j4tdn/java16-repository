package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tu ban phim: ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Input number " + (i + 1) + ": ");
			num[i] = sc.nextInt();
			sum(num);
		}
		System.out.println("KQ: "+ sum(num));	
	}
	 public static long factorial(int n) {
	        long gt = 1;
	        for (int i = 1; i <= n; i++) {
	            gt *= i;
	        }
	        return gt;
	    }
	 private static int sum(int[] numbers) {
		    int sum = 0; 
		    for(int number: numbers) {
		          sum += factorial(number);
		     }
		     return sum;
		}
}