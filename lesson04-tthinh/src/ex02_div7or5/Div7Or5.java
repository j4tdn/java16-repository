package ex02_div7or5;

import java.util.Arrays;
import java.util.Scanner;

public class Div7Or5 {
	public static void main(String[] args) {

		int[] number = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };

		int temp;
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 7 == 0 && number[i] % 5 != 0) {
				temp = number[count];
				number[count] = number[i];
				number[i] = temp;
				count++;
			}
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 7 == 0 && number[i] % 5 == 0 || number[i] % 7 != 0 && number[i] % 5 != 0) {
				temp = number[count];
				number[count] = number[i];
				number[i] = temp;
				count++;
			}
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 7 != 0 && number[i] % 5 == 0) {
				temp = number[count];
				number[count] = number[i];
				number[i] = temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(number));
	}
}
