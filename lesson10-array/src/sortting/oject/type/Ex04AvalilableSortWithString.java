package sortting.oject.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvalilableSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a1", "b2", "e5", "d4" };
		// 1. Sorting sequences ascending
		Arrays.sort(sequences);
		ArrayUtils.printf("1.sequences asc", sequences);

		// 2.sorting sequences descending
		// Comparator --> sorting asc/deswc - handle null/non-null values
		// mergeSort--> if(compare(s1,s2) >0)==>swap ==>

		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}

		});
      ArrayUtils.printf("2.sequences desc", sequences);
      
      //3. Sorting sequences ascending and NUll first
      sequences = new String[] {null, "a1" , "c3", null, "b2", "e5", "d4", null};
      Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//step1:handle null values
				if (s1 == null && s2 != null) {
					return -1;
				}
				//s1!=null
				if(s2 == null) {
					return 1;
				}
				return s1.compareTo(s2);
				
			}
      });
      ArrayUtils.printf("sequeces ascending and NUll first", sequences);

	}
}
