package exercises01;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Ex07Random {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] digits = new int[5];
		for (int i = 0; i <digits.length; i++) {
			int save = 0;
			while(!diffNum(digits, save)) {
				save = 20 + rd.nextInt(30-20+1);
			}
			digits[i] = save;
			System.out.println("Number " +(i+1)+ ": " + (digits[i]));
		}
	}
	
	private static boolean diffNum(int[] digits, int number) {
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == number)
				return false;
		}
		return true;
	}

}
