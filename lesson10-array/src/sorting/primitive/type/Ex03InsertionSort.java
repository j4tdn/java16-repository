package sorting.primitive.type;

import utils.ArrayUtils;

public class Ex03InsertionSort {

	public static void main(String[] args) {

		int[] digits = {1, 2, 6, 2, 3, 5};
		insertionSort(digits);
		ArrayUtils.printf("digits", digits);
		
	}

	private static void insertionSort(int[] elements)
	{
		for(int i  = 1 ; i < elements.length; i++)
		{
			for(int j  = 0; j < i; j++)
			{
				if(elements[j] > elements[i]) // tăng dần
				{
					int tmp = elements[j];
					elements[j] = elements[i];
					elements[i] = tmp;
				}
			}
		}
	}

}
