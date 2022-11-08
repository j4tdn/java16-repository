package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvailableSortWithString {

	private static final int NULL_FRIST = -1;
	private static final int NULL_LAST = 1;
	public static void main(String[] args) {
		String[] sequences = {"a1", "c3", "d2", "e5", "d4"};
		
		// 1. Sorting sequences ascending
		Arrays.sort(sequences);
		
		ArrayUtils.printf("1. sequences ascending", sequences);
		
		// 2. Sorting sequences descending
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
		});
		ArrayUtils.printf("2. sequences descending", sequences);

		// 3. Sorting sequences ascending and null first
		sequences = new String[]{null, "a1", "c3", null, "d2", "e5", "d4", null};
		Arrays.sort(sequences, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int isnull = NULL_LAST;
				if(o1 == null) return isnull;
				else if (o2 == null) return isnull*(-1);
				else return o1.compareTo(o2);
			}
		});
		ArrayUtils.printf("3. sequences ascending & null first", sequences);
		
		
	}

}
