package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {
		int[] digit = { 1, 5, 11, 9, 4, 6 };
		selectionSort(digit);
		ArrayUtils.printf("digit", digit);
	}

	// sorting ascending
	private static void selectionSort(int[] element) {
		//Array has N element --> N rounds 
		//Each round --> find max,min(asc,desc) per round
		
		//Loop left --> right
		//if(a[left] > a[right] --> swap --> ASC
		//if(a[left] < a[right] --> swap --> DESC
		for (int round = element.length-1; round > 0; round--) {
			for (int i = 0; i < round; i++) {
				if (element[i] > element[round]) {
					//swap==> ASC
					//i : previous
					//i+1 : next 
					int tmp = element[i];
					element[i] = element[round];
					element[round] = tmp;
				}
			}
		}
	}
}