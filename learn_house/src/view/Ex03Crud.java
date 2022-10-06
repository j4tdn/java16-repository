package view;

import java.util.Arrays;

public class Ex03Crud {
	public static void main(String[] args) {
		int[] numbers = {1 , 9,  5 , 36, 12 , 33};
		int[] k = add(numbers, 3, 99);
		System.out.println(Arrays.toString(k));
	}
	
	
	private static int[] add(int [] number, int pos, int newValue) {
		int[] newNumbers = new int[number.length +1];
		for(int i = 0 ; i < number.length; i ++) {
			newNumbers[i] = number[i];
		}
		newNumbers[pos] = newValue;
		for(int i = pos +1 ; i < newNumbers.length;i++) {
			newNumbers[i] = number[i-1];
		}
		return newNumbers;
	}
	

}
