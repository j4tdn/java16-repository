package homework;

import java.util.Random;

public class Exercise2 {
	public static void main(String[] args) {
		int[] number = new int[4];
		number[0] = new Random().nextInt(1, 10);
		System.out.println("so cua number 0 :" + number[0]);
		number[1] = new Random().nextInt(1, 10);
		System.out.println("so cua number 1 :" + number[1]);
		number[2] = new Random().nextInt(1, 10);
		System.out.println("so cua number 2 :" + number[2]);
		number[3] = new Random().nextInt(1, 10);
		System.out.println("so cua number 3 :" + number[3]);
		System.out.println(sum(number));

	}

	private static int sum(int[] number) {
		int sum = 0;
		for (int i : number) {
			sum += fac(i);
		}
		return sum;
	}

	public static long fac(int n) {
		long gt = 1;
		for (int i = 1; i <= n; i++) {
			gt *= i;
		}
		return gt;
	}

}
