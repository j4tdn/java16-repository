package view;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] a0 = {1};
		int[] a1 = {2,3};
		int[] a2 = {2,3,4};
		int[] a3 = {2,3,6};
		int[] a4 = {2,5,10};
		int[] a5 = {};
		
		System.out.println(getLeastCommonMultiple(a0));
		System.out.println(getLeastCommonMultiple(a1));
		System.out.println(getLeastCommonMultiple(a2));
		System.out.println(getLeastCommonMultiple(a3));
		System.out.println(getLeastCommonMultiple(a4));
		System.out.println(getLeastCommonMultiple(a5));
		
		System.out.println("======================");
		
		System.out.println(getLeastCommonMultiple2(a0));
		System.out.println(getLeastCommonMultiple2(a1));
		System.out.println(getLeastCommonMultiple2(a2));
		System.out.println(getLeastCommonMultiple2(a3));
		System.out.println(getLeastCommonMultiple2(a4));
		System.out.println(getLeastCommonMultiple2(a5));
	}
	
	public static int getLeastCommonMultiple(int[] arr) {
		int tmp = 1;
		for (int i : arr) {
			tmp*=i;
		}
		for (int i = 1; i <= tmp; i++) {
			boolean check = true;
			for (int j : arr) {
				if(i%j!=0) check = false;
			}
			if(check) return i;
		}
		return -1;
		
	}

	public static int getLeastCommonMultiple2(int[] arr) {
		int Rs = 1;
		for (int i : arr) {
			Rs = lcm(Rs,i);
		}
		return Rs;
	}
	
	public static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
	
	public static int gcd(int a, int b) {
		if(a==b) return a;
		else return a > b ? gcd(a-b,b) : gcd(a,b-a);
	}

}
