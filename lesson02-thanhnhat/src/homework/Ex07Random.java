package homework;

import java.util.Random;
import java.util.Scanner;

public class Ex07Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int i = 0, count = 0;
		int[] array = new int[6];
		for (i = 1; i <= 5; i++) {
			int random = 20 + rd.nextInt(11);
			if (i == 1) {
				array[i] = random;
			} else if (i > 1) {
				if (random != array[i]) {
					array[i] += random;
				}
			}

		}
		for (i = 1; i <= 6; i++) {
			System.out.println(array[i]);

		}

	}
}
