package practice;

import java.util.Scanner;

public class Ex01Exponentiation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
	int number = 8;
	System.out.println(8 & 7);
		//System.out.println(isPowerOf2(sc.nextInt())); 
			System.out.println(isPowerOfTwo(number)?number + " la` thua` so cua 2":number + " khong la` thua` so cua 2");

	}
	private static boolean isPowerOf(int a, int b) {
		if(b<=0) return false;
		double n = Math.log(a)/Math.log(b);
		return Math.ceil(n) == Math.floor(n);
	}
	
	private static boolean isPowerOfTwo(int x){
	    return (x & (x - 1)) == 0;
	}
}
