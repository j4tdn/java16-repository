package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import common.NullOption;
import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a1", "c3", "b2", "e5", "d4" };
		// 1. Sorting sequences ascending
		Arrays.sort(sequences);
		ArrayUtils.printf("1. sequences asc", sequences);

		// 2. Sorting sequences descending
		// Comparator --> Sorting asc/desc - handle null/non null values
		// Comparator#compare(s1,s2) > 0) => swap
		// mergeSort --> if(compare
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		ArrayUtils.printf("2. sequences desc", sequences);
		// 3. Sorting sequences ascending and Null first
		sequences = new String[] { null, "a1", "c3", null, "b2", "e5", "d4", null };
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1 == null && s2 !=null) {
					return -1;
				}
				if (s2 == null) {
					return 1;
				}
				return s2.compareTo(s1);
			}
		});
		ArrayUtils.printf("3. sequences asc", sequences);
	}

	
	}

