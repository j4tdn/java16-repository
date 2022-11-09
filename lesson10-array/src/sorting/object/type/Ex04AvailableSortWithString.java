package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a1", "c3", "b2", "e5", "d4" };

		// 1.Sorting sequences asc
		Arrays.sort(sequences);
		ArrayUtils.printf("1. sequences asc", sequences);

		// 2.Sorting sequences des
		// Comparator --> sorting asc/des - handle null/non-null values
		// Comparator#compare(s1,s2)
		// mergeSort --> if (compare(s1,s2)>0) ==> swap -->default(asc)
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		ArrayUtils.printf("2. sequences des", sequences);

		// 3. Sorting sequences asc and NULL first
		sequences = new String[] { null, "a1", "c3", null, "b2", "e5", "d4", null };
		Arrays.sort(sequences, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				// handle null values
				if(s1 == null && s2 != null) {
					return -1;
				}
				if(s2==null) {
					return 1;
				}
				//step1 sort non null values
				// default
				return s1.compareTo(s2);
			}
		});
		ArrayUtils.printf("3. sequences asc & null first", sequences);
	}
}