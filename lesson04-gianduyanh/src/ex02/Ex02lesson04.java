package ex02;

import java.util.Arrays;
import java.util.Iterator;

public class Ex02lesson04 {
	public static void main(String[] args) {
		int[] number = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		System.out.println(Arrays.toString(sortRequest(number)) );

	}

	public static int[] sortRequest(int[] numbers) {
		int arr[] = new int [numbers.length];
		int count = 0;
		for (int i = 0; i < numbers.length ; i++) {
			if (numbers[i] % 7 == 0 && numbers[i] % 5 != 0) {
				
				arr[count] = numbers[i];
				count++;
			}
		}
		for(int i = 0; i < numbers.length ; i ++) {
			if((numbers[i] % 7 == 0 && numbers[i] % 5 == 0) || (numbers[i] % 7 != 0 && numbers[i] % 5 != 0) ) {
				
				arr[count] = numbers[i];
				count++;
			}
		}
		for (int i = 0; i < numbers.length ; i++) {
			if (numbers[i] % 7 != 0 && numbers[i] % 5 == 0) {
				
				arr[count] = numbers[i];
				count++;
			}
		}
		

		
		return arr;
		}
	
}
	


