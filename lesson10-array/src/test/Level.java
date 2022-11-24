package test;

import java.util.Arrays;

public class Level {
	public static void main(String[] args) {
		int [] array = {8, 5, 9, 20};
		System.out.println(common(array[0]));
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	private static int common(int number) {
		int level = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				level++;
			}
		}
		return level;
	}
	private static int[] sort(int[] source) {
		int temp = 0;
		for(int i = 0; i < source.length - 1; i++) {
			for(int j = i + 1; j < source.length - 1 ; j ++) {
				if(common(source[i]) > common(source[j])){
					temp = source[i];
					source[i] = source[j];
					source[j] = temp; 
				}
			}
		}			
		return source;
	}
}
