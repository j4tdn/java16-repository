package sorting.basic;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digits = {1, 5, 11, 9, 4, 6};
		bubbleSort(digits);
		ArrayUtils.printf("ditgits", digits);
		
	}
	//sorting ascending
	private static void bubbleSort(int[] elements) {
		//array has N element  --> n round
		//each round --> find max, min(asc/desc) per round
		for(int round = 0; round < elements.length; round++) {
			for(int i = 0; i < elements.length - round -1; i++) {
				if(elements[i] > elements[i+1]) {
					int tmp = elements[i];
					elements[i] = elements[i+1];
					elements[i+1] = tmp;
				}
					
			}
		}
		
	}
	
	private static void bubbleSort2(int[] elements) {
		//array has N element  --> n round
		//each round --> find max, min(asc/desc) per round
		for(int round = 0; round < elements.length; round++) {
			for(int i = elements.length-1; i > round; i--) {
				if(elements[i] > elements[i-1]) {
					int tmp = elements[i];
					elements[i] = elements[i-1];
					elements[i-1] = tmp;
				}
					
			}
		}
		
	}
	
	

}
