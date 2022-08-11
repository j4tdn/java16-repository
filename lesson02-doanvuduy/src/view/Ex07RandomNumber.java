package view;

import java.util.Random;

public class Ex07RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int[] a = new int[5];
		a[0]=20+rd.nextInt(11);
		for (int i = 1; i < 5; i++) {
			if(a[i]!=a[i-1]) {
				a[i] = 20 + rd.nextInt(11);
			}
			
			
		}

		System.out.println("cac so vua nhap:");
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
