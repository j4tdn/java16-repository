package testHomework;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random rd=new Random();
		int a1= rd.nextInt(10);
		int a2= rd.nextInt(10);
		int a3= rd.nextInt(10);
		int a4= rd.nextInt(10);
		int sum= giaithua(a1)+ giaithua(a2)+ giaithua(a3)+ giaithua(a4);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(sum);
		
	}
	private static int giaithua(int n) {
		if(n<=0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		for(int i=n-1;i>1;i--) {
			n=n*i;
		}
		return n;
	}

}
