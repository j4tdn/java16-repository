package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.Item;
import common.NullOption;
import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"a1", "c3", "b2", "e5", "d4"};
		
		// 1. Sorting sequences ascending
		Arrays.sort(sequences);
		ArrayUtils.printf("1. sequences asc", sequences);
		
		// 2. Sorting sequences descending
		// comparator --> sorting asc/desc - handle null/non
		// Comparator#compare(s1, s2)
		// merge sort --> if (compare(s1, s2) > 0) ==> swap ==> default(asc) 
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		ArrayUtils.printf("2. sequences desc", sequences);
		
		// 3. Sorting sequences ascending and NULL first
		sequences = new String[] {null, "a1", "c3", null, "b2", "e5", "d4", null};
		
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// step 1: handle null values
				if (s1 == null) {
					return -1;
				}
				// sure --> s1(!null)
				if (s2 == null) {
					return 1;
				}
				
				// step2: asc/desc non-null values
				return s1.compareTo(s2);
			}
		});
	}
}
