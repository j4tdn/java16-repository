package lession2;

import java.util.Scanner;

public class Ex03SymmetricalNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = ip.nextInt();
		if(checkSymmertric(n))
			System.out.println(n + " là số đối xứng");
		else 
			System.out.println(n + " không phải là số đối xứng");

	}
	
	private static boolean checkSymmertric(int n) {
		if(n >= 0 && n <= 9) return false;
		int a = n;
		int tmp = 0;
		while(a != 0) {
			tmp = tmp*10 + a % 10;
			a /=  10;
		}
		return (tmp == n);
		
	}

}
