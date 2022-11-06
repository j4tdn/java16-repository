package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a1", "c3", "b2", "e5", "d4" };
		// 1. Sorting sequences ascending
		Arrays.sort(sequences);
		ArrayUtils.printf("1. sequences asc", sequences);

		// 2. Sorting sequences descending
		// Comparator --> Sorting asc/desc - handle null / non-null values
		// Comparator # compare(s1, s2)
		// mergeSort --> if (compare(s1, s2) > 0) => swap => default(asc)
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		ArrayUtils.printf("2. sequences desc", sequences);

		// 3. Sorting sequences ascending and null first
		sequences = new String[] { null, null, "a1", "c3", null, "b2", "e5", "d4", null };
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1 == null) {
					return -1;
				}
				if (o2 == null) {
					return 1;
				}
				return o1.compareTo(o2);
			}
		});
		ArrayUtils.printf("3. sequences asc", sequences);
	}
}
