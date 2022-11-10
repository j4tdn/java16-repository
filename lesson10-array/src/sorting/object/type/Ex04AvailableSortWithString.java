package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a1", "c3", "b2", "e5", "d4"};
		
		//1. Sort sequences ascending
		Arrays.sort(sequences);
		ArrayUtils.printf("1. Sort sequences ascending", sequences);
		
		//2. Sort sequences descending
		//Comparator --> sort asc/desc handle null/non-null value
		//comparator#compare(s1, s2)
		//mergeSort --> if(compare(s1,s2) > 0) ==> swap ==> default(asc)
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
				//(-1) * s1.compareTo(s2)
			}
		});
		

		
		//2. Sort sequences descending andnull first
		
		sequences = new String[] {null, "a1", "c3", null, "b2", "e5", "d4", null};
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			
			public int compare(String s1, String s2) {
				//step 1: handle null values
				if(s1 == null && s2 != null) {
					return -1;
				}
				//s1!= null
				if(s2 == null) {
					return 1;
				}
				//step 2: asc/desc non-null value
				return s1.compareTo(s2);
				
			}
		});
		ArrayUtils.printf("2. Sort sequences descending & null first", sequences);
		
	}
}
