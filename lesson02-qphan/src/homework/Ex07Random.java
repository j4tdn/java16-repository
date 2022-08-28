package homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Bài 7: Viết chương trình random 5 số nguyên ngẫu nhiên 
 * từ 0 đến 10.
 * Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
 */
public class Ex07Random {
	public static void main(String[] args) {
		Random rd = new Random();
		// 0 0 0 0 0
		// 4 5 X 
		int[] numbers = new int[5];
		int noDupCount = 0; // số lượng phần tử không trùng nhau đã tạo ra
		while(noDupCount < numbers.length) {
			int number = rd.nextInt(10); // '0' 1 2 3 '4' 5 6 7 8 9
			if (!isExist(noDupCount, numbers, number)) {
				numbers[noDupCount++] = number;
			}
		}
		
		System.out.println(Arrays.toString(numbers));
	}
	
	private static boolean isExist(int validElements, int[] numbers, int testedNumber) {
		for (int i = 0; i < validElements; i++) {
			if(numbers[i] == testedNumber) {
				return true;
			}
		}
		return false;
	}
}
