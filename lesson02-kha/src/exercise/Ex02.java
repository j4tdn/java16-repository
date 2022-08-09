package exercise;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Sum of : x! + y! + z! + k!");
		int x,y,z,k;
		x = input("x");
		y = input("y");
		z = input("z");
		k = input("k");
		long sum = factorial(x) + factorial(y) + factorial(z) + factorial(k);
		System.out.println("Sum of : "+x+"! + "+y+"! + "+z+"! + "+k+"! = "+ sum);
	}
	
	public static int input(String num) {
		int number = 0;
		Scanner ip = new Scanner(System.in);
		Boolean check = true;
		do {
			System.out.print("Nhập "+ num +" : ");
			String numberAsText = ip.nextLine();
			if(numberAsText.matches("\\d+")) {
				check = false;
				number = Integer.parseInt(numberAsText);
			}
		} while (check);
		return number;
	}
	
	public static long factorial(int n) {
		if(n == 1 || n == 0) return 1;
		return n*factorial(n-1);
	}
}
