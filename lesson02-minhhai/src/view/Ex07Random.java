package view;

import java.util.Random;

public class Ex07Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[6];
		a[0] = 0;
		int i = 0;
		int m = 0;
		for (i = 1; i <= 5; i++)
			while (!(m - a[i - 1] == 0)) {

				m = 20 + rd.nextInt(30 - 20 + 1);
				a[i] = m;
				System.out.println("So thu " + i + ": " + a[i]);
			
			}

	}
}
