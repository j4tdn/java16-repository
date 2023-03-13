package view;

import java.util.Scanner;

public class Ex02PowerNumber {
	public static void main(String[] args) {
		
		if(isPowerOfTwo(8)) {
			System.out.println("Is power of 2");
		} else {
			System.out.println("Isn't power of 2");
		}
		
	}
	
	private static boolean isPowerOfTwo(int n) {
		if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
		
	}
}
