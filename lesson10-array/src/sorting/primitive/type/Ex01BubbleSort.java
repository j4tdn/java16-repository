package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01BubbleSort {

	public static void main(String[] args) {
		int[] didits = {1, 5, 11, 9, 4, 6};
		bubbleSort(didits);

		ArrayUtils.printf("didits", didits);

	}
	
	private static void bubbleSort(int[] element) {
		for (int i = 0; i < element.length; i++) {
			for (int j = 0; j < element.length - i - 1; j++) {
				if(element[j] > element[j+1]) {
					int tmp = element[j];
					element[j] = element[j+1];
					element[j+1] = tmp;
				}
			}
		}
	}

}
