package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Input Number: ");
		int number = num.nextInt();
		if(numberOfTwo(number)== true) {
			System.out.println(number+ "is power of two");
		}else System.out.println(number + "isn't power of two");
	}
	private static boolean numberOfTwo(int number) {
		if(number==0) {
			return false;
		}
		if(number==1) {
			return true;
		}
		while(number>=2) {
			if(number % 2 !=0) {
				return false;
		}
		number = number/2;
		}
		return true;
	}	
}