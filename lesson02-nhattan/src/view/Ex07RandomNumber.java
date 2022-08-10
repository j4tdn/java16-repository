package view;

import java.util.Arrays;
import java.util.Random;

/**
 * Bài 7: Viết chương trình random 5 số nguyên ngẫu nhiên từ 20 – 30. 
 * Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
 */

public class Ex07RandomNumber {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(nonRepeatRandom()));
	}

	private static int[] nonRepeatRandom() {
		int[] nonRepeat = new int[5];
		
		for (int i = 0; i < nonRepeat.length; i++) {
			nonRepeat[i] = random20To30();
		}
		
		for (int i = 0; i < nonRepeat.length; i++) {
			for (int j = 0; j < i; j++) {
				while (nonRepeat[j] == nonRepeat[i]) {
					nonRepeat[i] = random20To30();
					j = 0;
				}
			}
		}
		return nonRepeat;
	}
	
	private static int random20To30() {
		return 20 + new Random().nextInt(30 - 20 + 1);
	}
}
