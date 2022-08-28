package view;
import java.sql.Array;
import java.util.Random;
public class Ex07Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] numbers = new int[5];
		int noDupCount = 0; // số lượng phần tử không trùng nhau đã tạo ra
		while (noDupCount < numbers.length) {
			int number = 1 + rd.nextInt(5);
			if(!isExist(noDupCount,numbers, number)) {
				numbers[noDupCount++] = number;
			}
		}
		System.out.println(Array.toString(numbers));
	}
	private static boolean isExist(int validElements,int []numbers, int testedNumber) {
		for(int i = 0; i< validElements; i++) {
			if(numbers[i] == testedNumber)
				return true;
		}
		return false;
	}
}
