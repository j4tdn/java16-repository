package sorting.basic;

import utils.ArrayUtils;

public class Ex03InsertionSort {
	public static void main(String[] args) {
		int[] digits = {1, 5, 11, 9, 4, 6};
		insertionSort(digits);
		ArrayUtils.printf("ditgits", digits);
		
		//N*k ==> K=N O(N2)
		//N*K ==> k=[1-N]  O(Nlog(N))
	}
	//sorting ascending
	private static void insertionSort(int[] elements) {
		//array has N element  --> n round
		//each round --> find max, min(asc/desc) per round
		for(int round = 1; round < elements.length; round++) {
			for(int i = 0; i < round; i++) {
				if(elements[i] > elements[i+1]) {
					int tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
				}
					
			}
		}
		
	}
}
