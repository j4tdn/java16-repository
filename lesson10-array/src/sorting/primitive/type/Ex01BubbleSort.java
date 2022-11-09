package sorting.primitive.type;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01BubbleSort {

	public static void main(String[] args) {
		int[] digits = {1, 2, 6, 2, 3, 5};
		bubbleSort(digits);
		ArrayUtils.printf("digits", digits);
		
	}
	// sorting ascending - sắp xếp giảm dần
	
	private static void bubbleSort(int[] elements)
	{
		for(int round = 0; round < elements.length; round ++)
		{
			for(int i  = 0; i < elements.length - round - 1;i++)
			{
				if(elements[i] > elements[i + 1])
				{
					int tmp = elements[i];
					elements[i] = elements[i +1 ];
					elements[i+1] = tmp;
				}
			}
		}
	}
}
