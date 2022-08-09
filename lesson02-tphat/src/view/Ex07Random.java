package view;

import java.util.Random;

public class Ex07Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = 20 + rd.nextInt(11);
			System.out.println(a[i] + " ");
			for (int j = 0; j < i; j++) {
				if (a[j] == a[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println("======");
		for (int i = 0; i < a.length; i++) {
			System.out.println("range of a " + (i + 1) + " is " + a[i]);
		}
	}
}
//a[0]=29
//a[1]=25
//a[2]=29 a[0]=a[2];i=2-1=1;
//a[2]=29 a[0]=a[2];i=2-1=1;
//a[2]=20
//a[3]=20 a[2]=a[3];i=3-1=2;
//a[3]=23
