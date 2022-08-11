package view;

import java.util.Random;

public class Ex02SumOfRandom {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = 0;
		int[] a = new int[4];
		for (int i = 0; i < 4; i++) {
			a[i] = rd.nextInt(20);
			n += a[i];
		}
		System.out.println("cac so vua nhap:");
		for (int i = 0; i < 4; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println("");
		System.out.println("======");
		System.out.println("tong cac so vua nhap="+n);
		
	}
}