package exercises;

import java.util.Arrays;
import java.util.Random;

public class Ex07RandomNumber {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int numbers[] = new int [5];
		int count = 0;
		while(count < numbers.length){
			int rand = 20 +rd.nextInt(11);
			if(!isExists(numbers,rand)){
				numbers[count++] = rand;
				
			}
		}
		System.out.println(Arrays.toString(numbers));
		
	}
	private static boolean isExists(int[] numbers, int testedNumber) {
		for(int number: numbers){
			if(number == testedNumber) {
				return true;
			}
		}
		return false;
	}

}
