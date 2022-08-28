package view;

import java.util.Arrays;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int numbers[] = new int[5]; // 0 0 0 0 0 
		int noDupCount = 0; // số lượng phần tử không trùng nhau đã tạo ra 
		
		while(noDupCount < numbers.length) {
			int number =rd.nextInt(10);
			if(!isExist(noDupCount,numbers, number)) {
				numbers[noDupCount++] = number;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
	private static boolean isExist(int validElements,int[] numbers, int testedNumber) {
		for (int i = 0; i < validElements; i++ ) {
			if (numbers[i] == testedNumber) {
				return true;
			}
		}
		return false;
	}
			
	

}
