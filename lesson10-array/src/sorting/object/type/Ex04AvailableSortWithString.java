package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {
		String[] sequences = { "a1", "c3", "b2", "e5", "d4" };

		// 1.Sorting sequences ascending
		Arrays.sort(sequences);
		ArrayUtils.printf("2. sequences asc", sequences);

		// 2.Sorting sequences descending
		// comparator --> sortng asc/desc - handle null/ non-null values
		// Comparator#Compare(s1,s2)
		// mergeSort --> iff (comapre(s1,s2)>0) ==>swap ==> default(asc)
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// default
				return s2.compareTo(s1);
			}
		});
		ArrayUtils.printf("2.sequences desc", sequences);

		// 3. Sorting sequences ascendnig and NULL first
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
		ArrayUtils.printf("3.sequences asc & null first", sequences);
	}
}
