package exercises;

import java.util.Scanner;

public class Ex01PowerOfTwo {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter so can ktra: ");
		int n = ip.nextInt();
		if (n == 0) {
			System.out.println(n + " khong la luy thua cua 2");
		}else if(isPowerOfTwo(n)== true) {
			System.out.println(n + " la luy thua cua 2");
		}else {
			System.out.println(n + " khong phai luy thua cua 2");
		}
	}
	private static boolean isPowerOfTwo( int n) {
		if( 0 == n || 1 == n) return true;
		int x = n / 2;
		int y = n%2;
		if (1 == y) return false;
		return isPowerOfTwo(x);
		
	}

}
