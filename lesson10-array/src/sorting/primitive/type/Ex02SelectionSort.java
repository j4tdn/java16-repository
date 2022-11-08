package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02SelectionSort {

	public static void main(String[] args) {
		int[] didits = {1, 5, 11, 9, 4, 6};
		seletionSort(didits);

		ArrayUtils.printf("didits", didits);

	}
	
	private static void seletionSort(int[] element) {
		for (int i = 0; i < element.length; i++) {
			for (int j = i + 1; j < element.length; j++) {
				if(element[j] > element[i]) {
					int tmp = element[j];
					element[j] = element[i];
					element[i] = tmp;
				}
			}
		}
	}

}
