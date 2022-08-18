package exercises;

import java.util.Scanner;

public class Ex06Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter n= ");
		int n = scanner.nextInt();
		int count =0;
		for ( int i = 2; i < n; i ++) {
			if (isPrime(n) == true) {
				count += 1;
				if(count == 200) {
					System.out.println("so nguyen to thu 200 la: " + i );
					
				}
			}		
		}	
	}
	private static boolean isPrime(int n) {
		
		if (n < 2 ) {
	           return false;
	    }
 		for (int i =2; i <=Math.sqrt(n); i ++) {
 			if ( n % i == 0) {
 				return false;
 			}
	}
 		return true;
	}
}
