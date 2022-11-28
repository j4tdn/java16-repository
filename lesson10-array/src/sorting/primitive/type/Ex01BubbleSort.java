package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex01BubbleSort {
	public static void main(String[] args) {
		int[] digit = { 1, 5, 11, 9, 4, 6 };
		bubbleSort(digit);
		ArrayUtils.printf("digit", digit);
		
		// N rounds havs N*k ==> complexity: K=N O(N^2)
		// N*K==> k=[N-1] O(Nlog(N))
	}

	// sorting ascending
	private static void bubbleSort(int[] element) {
		//Array has N element --> N rounds 
		//Each round --> find max,min(asc,desc) per round
		
		//Loop left --> right
		//if(a[left] > a[right] --> swap --> ASC
		//if(a[left] < a[right] --> swap --> DESC
		for (int row = 0; row < element.length; row++) {
			for (int column = 0; column < element.length - row - 1; column++) {
				if (element[column] > element[column + 1]) {
					//swap==> ASC
					//i : previous
					//i+1 : next 
					int tmp = element[column];
					element[column] = element[column + 1];
					element[column + 1] = tmp;
				}
			}
		}
	}
}