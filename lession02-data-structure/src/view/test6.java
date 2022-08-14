package view;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("enter your number " );
        int n=number.nextInt();
        int count = 0;
        int i=2;
		while(count<n) {
			if(isPrimeNumber(i)) {
				count++;
				}i++;
			}                System.out.println(i-1);
			
		}
		
		
	
	public static boolean isPrimeNumber(int n) {    
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
