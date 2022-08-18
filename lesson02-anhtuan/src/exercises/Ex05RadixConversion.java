package exercises;

import java.util.Scanner;

public class Ex05RadixConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter n= ");
		int n = scanner.nextInt();
		  System.out.print("He nhi phan " + n +" là :");

		  System.out.print(Integer.toBinaryString(n));

		 
	}

}


