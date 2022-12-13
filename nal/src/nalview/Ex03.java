package nalview;

import java.util.Iterator;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a[i] = luckyNumber(number);
			sc.nextLine();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	
	}
	private static int luckyNumber(Integer n) {
		if(n.toString().length() <= 1) {
			return n;
		}
		else {
			String[] tmp = n.toString().split("");
			int sum = 0;
			for (String string : tmp) {
				sum += Integer.parseInt(string);
			}
			return luckyNumber(sum);
		}
		
	}

}
