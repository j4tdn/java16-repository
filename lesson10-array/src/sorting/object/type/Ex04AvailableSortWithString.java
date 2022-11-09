package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04AvailableSortWithString {
	public static void main(String[] args) {

		String[] sequences = {"a1", "c3", "b2", "e5", "d4"};
		
		// 1. Sorting squences ascending
		Arrays.sort(sequences);
		ArrayUtils.printf("1. sequences asc", sequences);
		
		// 2. Sorting sequences desending
		Arrays.sort(sequences, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2)
			
			{
				return s2.compareTo(s1);
			}
		});
		ArrayUtils.printf("2. sequences desc", sequences);
		
		//3. Sorting sequences ascending and NULL first
		sequences = new String[] {
				"a1",null, "c3", "b2",null, "e5", "d4", null
		};
		Arrays.sort(sequences, new Comparator<String>() {

			public int compare(String s1, String s2) {
				
				// step 1 : handle null values
				if(s1 == null && s2 != null)
				{
					return -1;
				}
				if(s2 == null)
				{
					return 1;// hóan vị khi trả về sô duong
				}
				// step 2 : asc/desc non-null values
				return s1.compareTo(s2);
			}
		});
		ArrayUtils.printf("3. sequences asc & null first", sequences);
		
	}
}
