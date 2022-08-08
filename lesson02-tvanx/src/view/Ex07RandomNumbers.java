package view;

import java.util.Random;

public class Ex07RandomNumbers {
	public static void main(String[] args) {
		Random rd = new Random();

		int[] Array = new int[5];

		for (int i = 0; i < 5; i++) {
			Array[i] = 20 + rd.nextInt(10);
		}
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (Array[i] == Array[j]) {
					Array[j] = 20 + rd.nextInt(10);
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(Array[i] + " ");
		}
	}

}
