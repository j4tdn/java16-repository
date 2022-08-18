package homework;

import java.util.*;

public class Ex07Random {
	public static void main(String[] args) {
		int[] num = new int[5];
		Random rd = new Random();
		System.out.println("Ramdom 5 số nguyên từ 20 đến 30: ");
		for (int i = 0; i < num.length; i++) {
			int n = 0;
			while(!otherNumber(num, n)) {
				n = 20 + rd.nextInt(30 - 20 + 1);			
			}
			num[i] = n;
			System.out.println("Số thứ " + (i + 1) + ":" + num[i]);
		}
	}
	
	private static boolean otherNumber(int[] num, int n) {
		for(int i = 0; i < num.length; i++) {
			if(num[i] == n)
				return false;
		}
		return true;
	}
}