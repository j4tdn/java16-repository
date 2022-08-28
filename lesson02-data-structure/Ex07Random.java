package homework2;

import java.util.Arrays;
import java.util.Random;

// Viết chương trình Random 5 số ngẫu nhiên từ 20 đến 30
// Yêu cầu 5 số không được trùng nhau
public class Ex07Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[5];
		int noDupCount = 0;// số lượng phần tử không trùng nhau 
		while(noDupCount < numbers.length) {
			int number = 20 + rd.nextInt(11);
			if(!isExists(numbers, number)) {
				numbers[noDupCount++] = number;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
	private static boolean isExists(int validElements, int[] numbers, int testedNumber) {
		for(int i=0;i< validElements;i++) {
			if(numbers[i] == testedNumber) {
				return true;
			}
		}
		return false;
	}
}
