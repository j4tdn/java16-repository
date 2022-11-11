package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04vailableSortWithString {
	public static void main(String[] args) {
		String sequences[] = {"a1", "c3", "b2", "e5", "d4"};
		
		// 1. Sorting sequences ascending
		Arrays.sort(sequences);
		ArrayUtils.printf("1. Sorting sequences ascending: ", sequences);
		
		// 2. Sorting sequences descending
		// Comparator --> sorting asc/desc - handle null/non-null
		// Comparator#compare(s1, s2)
		// merge --> if (compare(s1, s2) > 0) ==> swap
		Arrays.sort(sequences, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		ArrayUtils.printf("2. Sorting sequences descending: ", sequences);
		
		// 3. Sorting sequences asceding and NULL first
		sequences = new String[]  {null, "a1", "c3", null, "b2", "e5", "d4", null};
		Arrays.sort(sequences, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if (s1 == null) {
					return -1;
				}
				if (s2 == null) {
					return 1;
				}
				return s2.compareTo(s1);
			}
		});
		ArrayUtils.printf("3. Sorting sequences asceding and NULL first: ", sequences);
	}
}
