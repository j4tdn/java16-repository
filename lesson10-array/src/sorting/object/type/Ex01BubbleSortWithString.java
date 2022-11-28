package sorting.object.type;

import java.util.Arrays;

import utils.ArraysUtils;

public class Ex01BubbleSortWithString {
	
	public static void main(String[] args) {
		
		String[] da = { "a" , "u" , "d"  , null, "f" , "a" , null} ;
	   
	    
		bubbleSort(da);
		ArraysUtils.printf("String ", da);

	}
	private static void bubbleSort(String[] elemetns) {
		for (int round = 0; round < elemetns.length; round++) {
			for (int i = 0; i < elemetns.length - round - 1; i++) {
				if(elemetns[i] == null) {
					continue;
				}
				if(elemetns[i + 1] == null) {
					String tmp = elemetns[i];
					elemetns[i] = elemetns[i + 1];
					elemetns[i + 1] = tmp;
					continue;
				}
				if (elemetns[i].compareTo(elemetns[i + 1]) >  0) {
					// swap

					String tmp = elemetns[i];
					elemetns[i] = elemetns[i + 1];
					elemetns[i + 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(elemetns));
	}
	
}
