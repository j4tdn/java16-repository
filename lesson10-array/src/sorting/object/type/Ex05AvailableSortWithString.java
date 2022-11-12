package sorting.object.type;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex05AvailableSortWithString {
	public static void main(String[] args) {
		
	
	String[] sequences = {"a1", "c3", "b2", "e5", "d4"};
	Arrays.sort(sequences);
	ArrayUtils.printf("1. sequences asc", sequences);
	
	
	Arrays.sort(sequences, new Comparator<String>() {

		@Override
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}
	});
	ArrayUtils.printf("2. sequences desc", sequences);
	
	//3
	 sequences = new String[]{null,"a1", "c3", null, "b2", "e5", "d4", null};
	Arrays.sort(sequences, new Comparator<String>() {
		@Override
		public int compare(String s1, String s2) {
			if(s1 == null & s2 != null) {
				return -1;
			}
			// s1 != null
			if(s2 == null) {
				return 1;
			}
			return s1.compareTo(s2);
		}
	});
	ArrayUtils.printf("3. sequences asc & null first", sequences);
	
}
}