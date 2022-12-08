package view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class HackerRank {
	public static void main(String[] args) {
	int [] a = new int[5];
	Scanner sc = new Scanner(System.in);
	a[0] = sc.nextInt();
	a[1] = sc.nextInt();
	a[2] = sc.nextInt();
	a[3] = sc.nextInt();
	a[4] = sc.nextInt();
	Arrays.sort(a);
	Arrays.asList(a).forEach(o -> System.out.println(o.toString()));
	sum(a);
	}
	private static void sum(int[] a) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length - 1; i++) {
			sum1 += a[i]; 
			
		}
	    for (int i = 1; i < a.length; i++) {
			sum2 += a[i];
		}
	    System.out.println(sum1 + " " + sum2);
		
	}
	

}
