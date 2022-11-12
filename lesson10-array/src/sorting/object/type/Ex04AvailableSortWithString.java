package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a1", "c3", "b2", "e5", "d4" };

		// 1. Sorting sequences ASC
		Arrays.sort(sequences);
		ArrayUtils.printf("1. Sequences ASC", sequences);

		// 2. Sorting sequences DESC
		// Comparator --> sorting asc/desc - handle Null/not-Null values
		// Comparator#compare(s1, s2)
		// mergeSort --> if (compare(s1, s2) > 0) ==> Swap ==> Default: ASC
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		ArrayUtils.printf("2. Sequences DESC", sequences);

		// 3. Sorting sequences ASC and Null_First
		sequences = new String[] { null, "a1", "c3", null, "b2", "e5", "d4", null };
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s2 == null)
					return 1;
				if (s1 == null)
					return -1;
				return s1.compareTo(s2);
			}
		});
		ArrayUtils.printf("3. Sequences ASC & NULL_FIRST", sequences);
	}
}
