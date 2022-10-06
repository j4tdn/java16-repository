package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex01Numbers {
	public static void main(String[] args) {
		String da = "1aa2b03456b0478";
		String[] da1 = da.split("[a-z]+");
		int[] da2 = new int[da1.length]; 
		int count = 0;
		do {
			try {
				if (count == 1) {
					da1[0] = "0";
				}

				da2 = convertoInt(da1);
				Arrays.sort(da2);
				System.out.println((da2[da2.length-1]) + " la so lon nhat trong chuoi");
				
				break;
			} catch (Exception e) {
				count += 1;
				System.out.println(count);
			}

		} while (true);
	}
	public static int[] convertoInt(String[] numbers) {
		int[] number = new int[numbers.length];
		for(int i =0 ; i < number.length; i ++) {
			number[i] = Integer.parseInt(numbers[i]);
			
		}
		System.out.println(Arrays.toString(number));
		return number;
		
	}
}
