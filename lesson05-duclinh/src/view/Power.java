package view;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in); 
		System.out.println(isPowerOf(8,2));
		
	}
	public static boolean isPowerOf(int x, int y) {
		 double power = Math.log(x)/Math.log(y);
		    return Math.floor(power) == power;
	}
}
