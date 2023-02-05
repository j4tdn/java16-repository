package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap n = ");
		int n = ip.nextInt();
		int result = n;
		while(result !=1) {
			result = check(result);
		}
		if(result == 1) {
			System.out.println("la so hanh phuc");
			
		}
		else {
			System.out.println("k phai so hanh phuc");
		}
		
	}
	private static int check(int n) {
		int temp = 0, sum =0;
		while(n > 0) {
			temp = n % 10;
			sum = sum +(temp * temp);
			n= n /10;
		}
		return sum;
	}

}
