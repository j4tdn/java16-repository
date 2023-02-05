package view;

import java.util.Scanner;

public class Ex03HappyNumber {
	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Nhap n = ");
		int n = number.nextInt();
		int result = n;
		
		while(result !=1) {
			result = checkNumber(result);
		}
		if(result == 1) {
			System.out.println("Là số hạnh phúc");
			
		}
		else {
			System.out.println("Không phải là số hạnh phúc");
		}
	}
	
	private static int checkNumber(int n) {
		int temp = 0, sum =0;
		while(n > 0) {
			temp = n % 10;
			sum = sum +(temp * temp);
			n = n /10;
		}
		return sum;
	}
}
