package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex03InsertionSort {

	public static void main(String[] args) {
		int[] didits = {1, 5, 11, 9, 4, 6};
		insertionSort(didits);

		ArrayUtils.printf("didits", didits);

	}
	
	private static void insertionSort(int[] element) {
		for (int i = 1; i < element.length; i++) {
			for (int j = 0; j < i; j++) {
				if(element[j] < element[i]) {
					int tmp = element[j];
					element[j] = element[i];
					element[i] = tmp;
				}
			}
		}
	}

}
