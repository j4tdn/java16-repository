package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] digits = {1, 5 ,11, 9, 4, 6 };
		selectionSort(digits);
		ArrayUtils.printf("digits" , digits);
	}
	
	// sorting ascending
	private static void selectionSort(int[] elements) {
		// Array has N elements --> N rounds
		// Each round --> find max , min (asc/desc) per round
		
		//loop left -> right
		// if(a[left] > a[right]) --> swap --> ASC
		// if(a[left] < a[right]) --> swap --> DESC
		for(int round = elements.length-1 ; round > 0 ; round --) {
			for(int i = 0; i < round ; i++) {
				if(elements[i] < elements[round]) {
					// swap ==> ASC
					// i: current
					// round: privot
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}
}
