package view;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int number[] = { 3,99,21,0,99,17,21,99,63,66,33};
		
	

		System.out.println(Arrays.toString(getUniqueNumbers(number)));
	}

	public static Object[] getUniqueNumbers(int[] numbers) {
		int da = numbers[0];
		ArrayList<Integer> da1 = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			count = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == numbers[i])
					count++;
			}
			
			System.out.println(count);

			if (count == 1 ) {
				da1.add(numbers[i]);
			}
			da1.sort((o1, o2) -> o1 - o2);

		}
		return da1.toArray();

	}

}
