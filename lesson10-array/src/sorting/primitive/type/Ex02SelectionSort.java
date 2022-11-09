package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex02SelectionSort {
	public static void main(String[] args) {

		int[] digits = {1, 2, 6, 2, 3, 5};
		selectionSort(digits);
		ArrayUtils.printf("digits", digits);
		
	}

	private static void selectionSort(int[] elements)
	{
		for(int round = elements.length - 1; round > 0 ; round --)
		{
			for(int i  = 0; i < round; i++)
			{
				if(elements[i] > elements[round]) // tăng dần
				{
					int tmp = elements[i];
					elements[i] = elements[round];
					elements[round] = tmp;
				}
			}
		}
	}

}
